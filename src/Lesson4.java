

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args){
        start();

    }
    static void start() {
        char[][] field = createField();

        do {
            doPlayerMove(field);
            drawfield(field);
            if (isWin(field, 'X')) {
                System.out.println("Пщздравляю!!! Вы победили!!!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("Ничья");
                break;

            }

            doAIMove(field);
            drawfield(field);
            if (isWin(field, '0')) {
                System.out.println("Извените. Вы проиграли");
                break;
            }
            if (isDraw(field)) {
                System.out.println("Ничья");
                break;
            }
        }while (true);
    }

    static boolean isDraw(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(isFreeCell(field, i, j));{
                return false;
                }

            }

        }
        return true;

    }

    static boolean isWin(char[][] field, char symbol){
        //horizontal
        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol){
            return true;
        }if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol){
            return true;
        }
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol){
            return true;
        }
        //vertical
        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol) {
            return true;
        }
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol) {
            return true;
        }
        //diagonals
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
            return true;
        }
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
            return true;
        }
        return false;
    }

    static char[][] createField(){
        return new char[][] {
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}

        };
    }

    static void doPlayerMove(char[][] field){
        int h, v;
        do {
            h = getCoordinate(field.length - 1, 'h');
            v = getCoordinate(field.length - 1, 'v');
        } while (isNotFreeCell(field, h, v));

        field[h][v] = 'X';
    }

    static void doAIMove(char[][]field){
        int h, v;
        Random random = new Random();
        do {
            h = random.nextInt(field.length);
            v = random.nextInt(field.length);
        } while (isNotFreeCell(field, h, v));

        field[h][v] = '0';

    }

    static boolean isFreeCell(char[][] field, int h, int v){
        return field[h][v] == '_';
    }

    static boolean isNotFreeCell(char[][] field, int h, int v){
        return !isFreeCell(field, h, v);
    }

     static int getCoordinate(int lastindex, char coordName){
        Scanner scanner = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Пожалуйста введите координату %s ...(1-3)%n", coordName);
            coord = scanner.nextInt() - 1;
        }while (coord < 0 || coord > lastindex);
        return coord;



}

static void drawfield(char[][] field){
    for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field.length; j++) {
            System.out.print(field[i][j]);
            System.out.print(" ");
        }
        System.out.println();

    }
    System.out.println();

}

}
