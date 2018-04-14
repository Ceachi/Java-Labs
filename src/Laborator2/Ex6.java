/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ceachi Bogdan
 */
public class Ex6 {

    public static void selectionSort(String arrayString[]) {

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = i + 1; j < arrayString.length; j++) {
                if (arrayString[i].compareTo(arrayString[j]) > 0) {
                    String temp = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = temp;
                }
            }
        }
    }

    public static String[] build(int n) {
        String arrayString[] = new String[n];

        Scanner read = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            arrayString[i] = read.nextLine();
        }
        return arrayString;
    }

    public static void main(String[] args) {

        String s[] = Ex6.build(5);
        long startTime = System.nanoTime();
        Ex6.selectionSort(s);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println(" Selection sort Time = " + elapsedTime);
        
        startTime = System.nanoTime();
        Arrays.sort(s, 0, s.length);
        System.out.println( " ArraysSort time = " + ( System.nanoTime() - startTime));
    }

}
