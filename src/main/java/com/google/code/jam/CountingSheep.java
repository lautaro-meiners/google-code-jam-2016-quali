package com.google.code.jam;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by lautaro.meiners on 02/05/2016.
 * Link a la pagina del ejercicio: https://code.google.com/codejam/contest/6254486/dashboard#s=p0
 */
public class CountingSheep extends CodeJam {

    String solve(String line) {
        Integer numeroOriginal = Integer.parseInt(line);
        Integer numeroActual = numeroOriginal;

        Integer [] digitos = {0,1,2,3,4,5,6,7,8,9};

        HashSet<Integer> setDeDigitos = new HashSet<Integer>(Arrays.asList(digitos));

        if(numeroActual == 0) {
            return "Insomio";
        }
        while (setDeDigitos.size() > 0){
            HashSet<Integer> digitosEnElNumeroActual = new HashSet<Integer>();
            for (char digito : String.valueOf(numeroActual).toCharArray()){
                digitosEnElNumeroActual.add(Integer.parseInt(String.valueOf(digito)));
            }
            setDeDigitos.removeAll(digitosEnElNumeroActual);
            numeroActual = numeroActual + numeroOriginal;
        }
        return String.valueOf(numeroActual - numeroOriginal);

    }

    public static void main (String[] args) throws Exception {
        CountingSheep countingSheep = new CountingSheep();
        countingSheep.run(Paths.get(args[0]));
    }
}
