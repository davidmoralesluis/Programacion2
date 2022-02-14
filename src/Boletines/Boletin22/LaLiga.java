package Boletines.Boletin22;

import javax.swing.*;
import java.util.Arrays;

public class LaLiga {

    public String[] equipos(){
        String [] eqip=new String[Integer.parseInt(JOptionPane.showInputDialog("Cuantos Equipos hay en la liga?"))];
        for (int i = 0; i < eqip.length; i++) {
            eqip[i]= JOptionPane.showInputDialog("Introduce el "+(i+1)+"º equipo!");
        }
        return eqip;
    }

    public int[][] gravarImprimirToboa(String [] teams){
        int xornadas=Integer.parseInt(JOptionPane.showInputDialog("cuantas jornadas hay?"));

        int tabla[][]=new int[teams.length][xornadas];

        System.out.printf("LaLiga\t\t");
        for (int i = 0; i < xornadas; i++) {
            System.out.printf("X%dº\t",(i+1));
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%s\t\t",teams[i]);
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Cuantos goles marco el "+teams[i]+" en la "+(j+1)+"º jornada?"));
                System.out.printf(" %d\t",tabla[i][j]);
            }
            System.out.println();
        }
        return tabla;
    }

    public void listaEquiposMenorGoles(int [][] tabla,String [] mannnschaft){

        int[]golesTeam=new int[tabla.length];
        String[]team=Arrays.copyOf(mannnschaft,mannnschaft.length);
        int auxGoles=0;
        String auxTeam="";
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                golesTeam[i]+=tabla[i][j];
            }
        }

        for (int i = 0; i < golesTeam.length; i++) {
            for (int j = i+1; j < golesTeam.length; j++) {
                if (golesTeam[i]>golesTeam[j]){
                    auxGoles=golesTeam[i];
                    golesTeam[i]=golesTeam[j];
                    golesTeam[j]=auxGoles;
                    auxTeam=team[i];
                    team[i]=team[j];
                    team[j]=auxTeam;
                }
            }
        }
        System.out.println("\nClasificacion por Goles ordenado por menor!!");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]+"\t"+golesTeam[i]+" goles");
        }

    }

    public void maisGolesCadaXornada(int [][] tabla,String [] mannschaft){

        int maxGoles=0;
        int maxTeam=0;
        boolean masDeUno=false;
        System.out.println("\nMais goles por cada xornada:");
        for (int xornada = 0; xornada < tabla[0].length; xornada++) {
            maxGoles=0;
            maxTeam=0;
            masDeUno=false;
            System.out.printf("En la Xornada %dº --> ",(xornada+1));
            for (int equip = 0; equip < tabla.length; equip++) {
                if (tabla[equip][xornada]>maxGoles){
                    maxGoles=tabla[equip][xornada];
                }
            }

            for (int equip = 0; equip < tabla.length; equip++) {

                if (maxGoles==tabla[equip][xornada]){
                    if (masDeUno){
                        System.out.printf("y ");
                    }
                    System.out.printf("%s ",mannschaft[equip]);
                    masDeUno=true;
                }
            }
            System.out.printf("con %d goles.\n",maxGoles);
        }

    }

    public void mejorEquipoXornada(int [][]tabla,String [] mannschaft){
        int maxGoles=0;
        int bestTeam=0;
        boolean masDeUno=false;
        String textXornada="";
        for (int i = 0; i < tabla[0].length; i++) {
            textXornada+=i+" -> "+(i+1)+" Xornada\n";
        }
        int xornada=Integer.parseInt(JOptionPane.showInputDialog("! Elige Xornada !\n"+textXornada));

        System.out.printf("En la Xornada %dº --> ",(xornada+1));
        for (int equip = 0; equip < tabla.length; equip++) {
            if (tabla[equip][xornada]>maxGoles){
                maxGoles=tabla[equip][xornada];
            }
        }

        for (int equip = 0; equip < tabla.length; equip++) {

            if (maxGoles==tabla[equip][xornada]){
                if (masDeUno){
                    System.out.printf("y ");
                }
                System.out.printf("%s ",mannschaft[equip]);
                masDeUno=true;
            }
        }
        System.out.printf("con %d goles.\n",maxGoles);
    }

    public void elegirEquipoXornada(int [][]tabla,String [] mannschaft){

        int maxGoles=0;
        String textTeams="";
        for (int i = 0; i < mannschaft.length; i++) {
            textTeams+=i+" -> "+mannschaft[i]+"\n";
        }
        int team=Integer.parseInt(JOptionPane.showInputDialog("! Elige equipo !\n"+textTeams));

        String textXornada="";
        for (int i = 0; i < tabla[0].length; i++) {
            textXornada+=i+" -> "+(i+1)+" Xornada\n";
        }
        int xornada=Integer.parseInt(JOptionPane.showInputDialog("! Elige Xornada !\n"+textXornada));

            System.out.printf("En la Xornada %dº el %s marco %d goles",(xornada+1),mannschaft[team],tabla[team][xornada]);

    }
}
