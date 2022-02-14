package Boletines.Boletin22;

import javax.swing.*;

public class Boleitn22 {
    public static void main(String[] args) {
        int menu=0;
        LaLiga App=new LaLiga();

        String[]equipos=App.equipos();
        int[][]tabla=App.gravarImprimirToboa(equipos);

        do{
            System.out.println("\n\n1 -> Obter clasificacion de menor");
            System.out.println("2 -> Equipo mas goleador por xornada");
            System.out.println("3 -> Mas goles en una xornada");
            System.out.println("4 -> Consultar goles segun equipo/xornada");
            System.out.println("0 -> Salir");

            menu=Integer.parseInt(JOptionPane.showInputDialog("elige opcion"));
            switch (menu){
                case 0:break;
                case 1:App.listaEquiposMenorGoles(tabla,equipos);break;
                case 2:App.maisGolesCadaXornada(tabla,equipos);break;
                case 3:App.mejorEquipoXornada(tabla,equipos);break;
                case 4:App.elegirEquipoXornada(tabla,equipos);break;
                default:
                    System.out.println("opcion invalida !! repite");
            }
            System.out.println("\n");
        }while (menu!=0);








    }
}
