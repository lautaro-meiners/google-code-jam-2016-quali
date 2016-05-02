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

    abstract String solve(String line);

    void run(Path inputFile) throws Exception {
        String[] tokens = inputFile.getFileName().toString().split("");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile.toFile()));
        PrintWriter writer = new PrintWriter(tokens[0] + ".out.txt");
        Scanner scanner = new Scanner(reader);
        int caseCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= caseCount; i++) {
            String solution = solve(scanner.nextLine());
            writer.println("Case #" + i + ": " + solution);
            System.out.println("Case #" + i + ": " + solution);
        }
        writer.close();
        scanner.close();
        reader.close();
    }

}
