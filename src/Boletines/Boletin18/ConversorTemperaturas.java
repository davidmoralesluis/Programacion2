package Boletines.Boletin18;

public class ConversorTemperaturas {

    public float centigradosAFharenheit(float celsius) throws TemperaturaErradaExcepcion{
        if (celsius<80){
            throw new TemperaturaErradaExcepcion("recorda que a temperatura non pode ser < 80 ºC");
        }
        return 9.0f / 5.0f * celsius + 32.4f;
    }

    public void centigradosAReamur(float celsius){
        System.out.println(celsius +" centigrados son "+ ((4.0f/5.0f)*celsius)+ " Reamur");
    }
}
