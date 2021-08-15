package ru.geekbrains.lesson2.iml;


import java.util.Random;
import java.util.Scanner;

    class lesson3 {
        public static void main(String[] args) {
            doTask1();
            doTask2();




        }
        //Написать программу, которая загадывает случайное число от 0 до 9 и
        // пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
        // больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        static void doTask1(){
            Scanner scan = new Scanner(System.in);
            boolean nextGame;
            do {
                Random rand = new Random();
                int randDigit = rand.nextInt(10);
                System.out.println("У вас есть 3 попытки");
                int chances = 3;
                do {


                    System.out.println("Пожалуйста, введите число ... (0-9) ");
                    int userDigit = scan.nextInt();
                    if (userDigit == randDigit) {
                        System.out.println("Поздравляю! Вы победили!  " + randDigit + " Загаданное число");
                        break;
                    }

                    if (userDigit < randDigit) {
                        System.out.println("Ваше число меньше загаданного...");
                    } else {
                        System.out.println("Ваше число больше загаданного...");
                    }
                    chances--;

                } while (chances > 0);

                System.out.println("Хотите повторить игру?");
                nextGame = scan.nextInt() == 1;

            }   while (nextGame) ;

        }
        //Создать массив из слов:
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
        // "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
        // "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        // сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
        // Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.

        static void doTask2(){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                    "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                    "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            Scanner word = new Scanner(System.in);
            String randWord = word.next();
            System.out.println("asfd" + randWord);






        }

    }

}
