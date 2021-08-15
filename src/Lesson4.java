import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args){
        start();

    }
    static void start(){
     char[][] field = {
             {'_','_','_'},
             {'_','_','_'},
             {'_','_','_'}
     };
     drawfield(field);

        Scanner scanner = new Scanner(System.in);

        int h = getCoordinate(field.length - 1, 'h');
        int v = getCoordinate(field.length - 1, 'v');

        field[h][v] = 'X';


        drawfield(field);

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

static void drawfield(char[][]field){
    for (char[] chars : field) {
        for (int j = 0; j < field.length; j++) {
            System.out.print(chars[j]);
            System.out.print(" ");
        }
        System.out.println();

    }

}

}
