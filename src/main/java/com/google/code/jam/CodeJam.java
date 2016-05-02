package com.google.code.jam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Created by lautaro.meiners on 02/05/2016.
 */
abstract class CodeJam {

    abstract String resolver(String linea);

    void run(Path inputFile) throws Exception {
        String[] tokens = inputFile.getFileName().toString().split("");
        Scanner nombreArchivoOut = new Scanner(System.in);
        System.out.println("Nombre del archivo out");
        String inputArchivoOut = nombreArchivoOut.nextLine();
        BufferedReader lector = new BufferedReader(new FileReader(inputFile.toFile()));
        PrintWriter escritor = new PrintWriter(tokens[0] + inputArchivoOut + ".out.txt");
        Scanner scanner = new Scanner(lector);
        int caseCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= caseCount; i++) {
            String solucion = resolver(scanner.nextLine());
            escritor.println("Case #" + i + ": " + solucion);
            System.out.println("Case #" + i + ": " + solucion);
        }
        escritor.close();
        scanner.close();
        lector.close();
    }

}
