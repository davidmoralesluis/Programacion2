package Boletines.Boletin21.Boletin21d;

import javax.swing.*;

public class DNI {
    public char calculaLetraNIF(){
        char[]tabla={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int nif=Integer.parseInt(JOptionPane.showInputDialog("Introduce los numeros del DNI"));
        return tabla[(nif%23)];
    }
}
