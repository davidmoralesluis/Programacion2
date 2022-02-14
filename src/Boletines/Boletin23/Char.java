package Boletines.Boletin23;

import javax.print.DocFlavor;

public class Char {

    public void ejercicio1(){

        String texto="Esto e Java!";
        System.out.printf("La longitud del texto es de %d caracteres", texto.length());
    }

    public void ejercicio2(){

        String palabra="Java";

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }

    public void ejercicio3(){

        String texto="Java desde 0";
        String textoNuevo="";

        for (int i = texto.length()-1; i >= 0; i--) {
            textoNuevo+=texto.charAt(i);
        }

        System.out.println(textoNuevo);
    }

    public void ejercicio4(){

        String texto="James Gosling Created";
        String textoNuevo="";

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)!=' '){
                textoNuevo+=texto.charAt(i);
            }
        }

        System.out.println(textoNuevo);
    }
    
    public void ejercicio5(){
        
        String texto="java java java";
        int vocais=0;
        int consonantes=0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)!=' ') {
                if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
                    vocais++;
                }else {
                    consonantes++;
                }
            }
        }

        System.out.printf("El texto \"%s\" tiene %d vocales y %d consonantes.\n",texto,vocais,consonantes);
    }

    public void ejercicio6(){

        String texto="www.javadesde0.com";
        int split=texto.length()/2;
        String texto1=texto.substring(0,split);
        String texto2=texto.substring(split);
        String textoNuevo=texto1+texto2;

        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(textoNuevo);
    }

    public void ejercicio7(){

        String texto="javeros";

        System.out.println(texto.toUpperCase());
    }

    public void ejercicio8(){

        String texto="Javas";
        String texto2="JavaScript";

        System.out.printf("%s es igual a %s --> %b\n",texto,texto2,texto.equals(texto2));
        //System.out.println(texto.equalsIgnoreCase(texto2));
    }

    public void ejercicio9(){

        String texto="jeve jeve jeve";
        String textoNuevo="";

        for (int i = 0; i < texto.length(); i++) {

                if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
                    textoNuevo+='a';
                }else {
                    textoNuevo+=texto.charAt(i);
                }

        }
        System.out.println(textoNuevo);
    }

    public void ejercicio10(){

        String texto="ABCD";

        int [] ascii=new int[texto.length()];

        for (int i = 0; i < ascii.length; i++) {
            ascii[i]=(int)texto.charAt(i);
            System.out.println(texto.charAt(i)+" --> "+ascii[i]);
        }

    }

    public void ejercicio11(){

        String texto = "Ola, son alumno de DAM1, e son porgramador desde o 2021";
        int letras=0;
        int numeros=0;
        int espacios=0;

        //Character.isLetter()

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) ==' '){
                espacios++;
            }


            if ((texto.charAt(i)>='A')&&(texto.charAt(i)<='Z')||(texto.charAt(i)>='a')&&(texto.charAt(i)<='z')){
                letras++;
            }

            if ((texto.charAt(i)>='0')&&(texto.charAt(i)<='9')){
                numeros++;
            }
        }

        System.out.println("numeros: "+numeros);
        System.out.println("letras: "+letras);
        System.out.println("espacios: "+espacios);

    }
}
