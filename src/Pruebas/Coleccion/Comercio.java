package Pruebas.Coleccion;

import javax.swing.*;
import java.util.ArrayList;

public class Comercio {

    ArrayList<Producto> listaProducto= new ArrayList<>();

    public void addProducto(){
        listaProducto.add(new Producto());
    }

    public void mostrarProducto(){
        String lista="";
        for (int i = 0; i < listaProducto.size(); i++) {
            lista+="codigo:"+listaProducto.get(i).getCodigo()+" -->     "+listaProducto.get(i).getNome()+"  \tstock: "+listaProducto.get(i).getStock()+"\n";
        }
        JOptionPane.showMessageDialog(null,lista);
    }

    public void eliminarProducto(){
        String lista="";
        int borrar=0;
        boolean present=false;
        for (int i = 0; i < listaProducto.size(); i++) {
            lista+="codigo:"+listaProducto.get(i).getCodigo()+" -->     "+listaProducto.get(i).getNome()+"\n";
        }
        borrar=Integer.parseInt(JOptionPane.showInputDialog(lista+"\n¿¿Que producto quieres eliminar??\nIntroduce codigo"));
        System.out.println("--"+borrar+"---");
        for (int i = listaProducto.size() - 1; i >= 0; i--) {
            if (borrar==listaProducto.get(i).getCodigo()){
                present=true;
                listaProducto.remove(i);
                break;
            }
        }
        if (!present){
            JOptionPane.showMessageDialog(null,"¡¡No existe ningun producto con ese codigo!!");
        }
    }

    public void obtenerProducto(){
        String lista="";
        int obtener=0;
        int cantidad=0;
        int stock=0;
        boolean present=false;
        for (int i = 0; i < listaProducto.size(); i++) {
            lista+="codigo:"+listaProducto.get(i).getCodigo()+" -->     "+listaProducto.get(i).getNome()+"\n";
        }
        obtener=Integer.parseInt(JOptionPane.showInputDialog(lista+"\n¿¿Que producto quieres obtener??\n\nIntroduce codigo"));
        for (int i = listaProducto.size() - 1; i >= 0; i--) {
            if (obtener==listaProducto.get(i).getCodigo()){
                present=true;
                cantidad=Integer.parseInt(JOptionPane.showInputDialog(listaProducto.get(i).getNome()+" --> stock: "+listaProducto.get(i).getStock()+"\n\n¿¿Cuantas unidades quieres obtener??\nIntroduce cantidad"));
                stock=listaProducto.get(i).getStock();
                if (stock-cantidad<0){
                    JOptionPane.showMessageDialog(null,"No hay sufiente Stock");
                }else {
                    listaProducto.get(i).setStock(stock-cantidad);
                }
                break;
            }
        }
        if (!present){
            JOptionPane.showMessageDialog(null,"¡¡No existe ningun producto con ese codigo!!");
        }
    }

    public void buscarPorCodigo(){

        int buscer=Integer.parseInt(JOptionPane.showInputDialog("Introduce codigo del producto"));
        boolean present=false;
        for (int i = listaProducto.size() - 1; i >= 0; i--) {
            if (buscer==listaProducto.get(i).getCodigo()){
                present=true;
                JOptionPane.showMessageDialog(null,"codigo:"+listaProducto.get(i).getCodigo()+" -->     "+listaProducto.get(i).getNome()+"  \tstock: "+listaProducto.get(i).getStock()+"\n");
                break;
            }
        }
        if (!present){
            JOptionPane.showMessageDialog(null,"¡¡No existe ningun producto con ese codigo!!");
        }
    }

}
