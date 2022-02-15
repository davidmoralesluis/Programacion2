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
            if (libros.get(numLibro).getUnidades()-cantidad<0){
                JOptionPane.showMessageDialog(null,"No hay sufiente Stock");
            }else{
                libros.get(numLibro).setUnidades(libros.get(numLibro).getUnidades()-cantidad);
            }
        }
    }

    public void mostrarLibros(){
        ordenarLibrosPorTitulo();
        String todosLibros="";
        for (int i = 0; i < libros.size(); i++) {
            todosLibros+=(i+1)+":\t"+libros.get(i).getTitulo()+",unidad: "+libros.get(i).getUnidades()+"\n";
        }
        JOptionPane.showMessageDialog(null,todosLibros);
    }

    public void ordenarLibrosPorTitulo(){
        Libro auxLibro;
        int vergleich=0;
        for (int i = 0; i < libros.size(); i++) {
            for (int j = i+1; j < libros.size(); j++) {
                System.out.println("1:"+libros.get(i).getTitulo());
                System.out.println("2:"+libros.get(j).getTitulo());
                vergleich=libros.get(i).getTitulo().compareToIgnoreCase(libros.get(j).getTitulo());
                if (libros.get(i).getTitulo().compareToIgnoreCase(libros.get(j).getTitulo())>=1){
                    auxLibro=libros.get(i);
                    libros.set(i,libros.get(j));
                    libros.set(j,auxLibro);
                }
            }
        }
    }

    public void darDeBaixaLibro(){
        String todosLibros="";
        int baixa=0;
        int borrar=0;
        for (int i = 0; i < libros.size(); i++) {
            todosLibros+=(i+1)+":\t"+libros.get(i).getTitulo()+",unidad: "+libros.get(i).getUnidades()+"\n";
        }
        baixa=(Integer.parseInt(JOptionPane.showInputDialog(todosLibros+"\n¿¿Que Libro quieres dar de baixa??"))-1);
        borrar=JOptionPane.showConfirmDialog(null,"¿estas seguro que quieres borrar el libro : "+libros.get(baixa)+" ?","titel",JOptionPane.YES_NO_OPTION);
        if (borrar==0){
            libros.remove(baixa);
        }
    }

    public void consultasLibro(){
        String todosLibros="";
        int consul=0;
        for (int i = 0; i < libros.size(); i++) {
            todosLibros+=(i+1)+":\t"+libros.get(i).getTitulo()+",unidad: "+libros.get(i).getUnidades()+"\n";
        }
        consul=(Integer.parseInt(JOptionPane.showInputDialog(todosLibros+"\n¿¿Que Libro quieres consultar??"))-1);
        JOptionPane.showMessageDialog(null,"Titulo: "+libros.get(consul).getTitulo()+"\nAutor: "+libros.get(consul).getAutor()+"\nISBN: "+libros.get(consul).getIsbn()+"\nPrezo: "+libros.get(consul).getPrezo()+"\nUnidades: "+libros.get(consul).getUnidades());
    }

}
