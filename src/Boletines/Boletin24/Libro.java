package Boletines.Boletin24;

import javax.swing.*;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int unidades;

    public Libro() {
        this.titulo = JOptionPane.showInputDialog("titulo del libro?");
        this.autor = JOptionPane.showInputDialog("autor del libro?");
        this.isbn = JOptionPane.showInputDialog("ISBN del libro?");
        this.prezo = Integer.parseInt(JOptionPane.showInputDialog("precio del libro?"));
        this.unidades = Integer.parseInt(JOptionPane.showInputDialog("unidades del libro?"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


}
