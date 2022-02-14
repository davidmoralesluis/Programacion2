package Boletines.Boletin24;

import javax.swing.*;
import java.util.ArrayList;

public class Libreria {

    ArrayList <Libro> libros=new ArrayList<>();

    public void addLibro(){
        libros.add(new Libro());
    }

    public void venderLibro(){

        String todosLibros="";
        int numLibro=0;
        int cantidad=0;
        boolean existe=false;
        for (int i = 0; i < libros.size(); i++) {
            todosLibros+=(i+1)+":\t"+libros.get(i).getTitulo()+"\n";
        }
        numLibro=(Integer.parseInt(JOptionPane.showInputDialog(todosLibros+"\n¿¿Que Libro quieres vender??"))-1);
        if ((numLibro>libros.size())||(numLibro<0)){
            JOptionPane.showMessageDialog(null,"¡¡No existe un libro en esa posicion!!");
        }else {
            cantidad=Integer.parseInt(JOptionPane.showInputDialog(libros.get(numLibro).getTitulo()+"\t->\t"+libros.get(numLibro).getUnidades()+"\n\n¿¿Cuantos libros quieres vender??"));

        }
    }

    public void mostrarLibros(){
        String todosLibros="";
        for (int i = 0; i < libros.size(); i++) {
            todosLibros+=(i+1)+":\t"+libros.get(i).getTitulo()+"\n";
        }
        JOptionPane.showInputDialog(todosLibros+"\n¿¿Que Libro quieres vender??");
    }
}
