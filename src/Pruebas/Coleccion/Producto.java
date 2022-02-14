package Pruebas.Coleccion;

import javax.swing.*;

public class Producto {

    private int codigo;
    private String nome;
    private String tipo;
    private float prezo;
    private int stock;

    public Producto() {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
        this.nome = JOptionPane.showInputDialog("nombre?");
        this.tipo = JOptionPane.showInputDialog("tipo?");
        this.prezo = Float.parseFloat(JOptionPane.showInputDialog("Precio?"));
        this.stock = Integer.parseInt(JOptionPane.showInputDialog("Stock?"));
    }

    public Producto(int codigo, String nome, String tipo, float prezo, int stock) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.prezo = prezo;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
