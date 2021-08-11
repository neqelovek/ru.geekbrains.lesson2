package ru.geekbrains.lesson2.iml;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class lesson2 {

    public static void main(String[] args){

        doTask1();
        doTask2();
        doTask3();
        doTask4();



    }
    static void doTask1(){
        System.out.println(" Задание 1");
        int[] mass = new int[]{1, 0, 1, 0, 0, 1, 1, 0};
        for (int a = 0; a < 8; a++) {
            if (mass[a] == 0) mass[a] = 1;
            else mass[a] = 0;{
            System.out.println(mass[a]);
            }
        }
    }


    static void doTask2(){
        System.out.println(" Задание 2");
        int[] mass = new int[8];
                for (int a = 0, b = 0; a < 8; a++, b +=3){
                    mass[a]=b;
                    System.out.println(mass[a]);
                }
    }


    static void doTask3(){
        System.out.println("Задание 3");
        int[] mass = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < mass.length;a++){
            if (mass[a] < 6) mass[a]*=2;{

            System.out.println(mass[a]);}
         }



    }
    static void doTask4(){
        System.out.println("Задание 4");
        int[][] mass = new int[5][5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j || j == mass.length - i - 1){
                    mass[i][j] = 1;
                }
            }
        }
        printMass(mass);

    }
    static void printMass(int[][] mass){
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                    System.out.print(mass[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            
        }

    }







