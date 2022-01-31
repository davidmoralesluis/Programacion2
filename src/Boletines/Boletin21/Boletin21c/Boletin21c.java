package Boletines.Boletin21.Boletin21c;

public class Boletin21c {
    public static void main(String[] args) {
        NotasName claseDAM=new NotasName();

        String[] nombresDAM=claseDAM.asignarNombre();
        int[] notasDAM=claseDAM.cargarNotas();


        claseDAM.buscarNotaAlumno("Persona7",nombresDAM,notasDAM);

        claseDAM.alumnosAprobados(nombresDAM,notasDAM);

        claseDAM.ordenarLista(nombresDAM,notasDAM);

        claseDAM.buscarNotaAlumnoPorTeclado(nombresDAM,notasDAM);

    }
}
