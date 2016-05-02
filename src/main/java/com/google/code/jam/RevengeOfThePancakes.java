package com.google.code.jam;

import java.nio.file.Paths;

/**
 * Created by lautaro.meiners on 02/05/2016.
 * Link al ejercicio en la pagina de google: https://code.google.com/codejam/contest/6254486/dashboard#s=p1
 */
public class RevengeOfThePancakes extends CodeJam {

    String resolver(String linea) {
        int  darVuelta = 0;
        int i;

        for (i = 0; i < linea.length() ; i++){
            if (i + 1 < linea.length()) {
                if (!(linea.charAt(i) == linea.charAt(i + 1))) {
                    darVuelta++;
                }
            }else {
                    if (linea.charAt(i) == '-'){
                        darVuelta++;
                    }
                }
            }

        return String.valueOf(darVuelta);
        }

    public static void main (String[] args) throws Exception {
        RevengeOfThePancakes revengeOfThePancakes = new RevengeOfThePancakes();
        revengeOfThePancakes.run(Paths.get(args[0]));
    }
}
