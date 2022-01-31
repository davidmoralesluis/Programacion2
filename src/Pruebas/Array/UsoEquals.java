package Pruebas.Array;

public class UsoEquals {
    public static void main(String[] args) {

        Alumnado alum1= new Alumnado("aa",5);
        Alumnado alum2= new Alumnado("aa",5);

        boolean res= (alum1==alum2)? true:false;

        Alumnado alum3= alum1;

        System.out.println("");

    }
}
