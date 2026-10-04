package edu.umg.progra2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double suma = 0;
        double nota;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese la nota final del alumno " + i + ": ");
            nota = entrada.nextDouble();

            suma = suma + nota;
        }

        double promedio = suma / 15;

        System.out.println();
        System.out.println("Promedio grupal: " + promedio);

        entrada.close();
    }
}