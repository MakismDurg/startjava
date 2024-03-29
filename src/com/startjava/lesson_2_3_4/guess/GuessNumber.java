package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int secretNum = (int) (Math.random() * 100 + 1);
        Scanner console = new Scanner(System.in);

        for(int i = 0; i < GuessNumberTest.LIMIT_OF_GUESSES; i++) {
            System.out.println(player1.getName() + ", введи свой вариант:");
            int guessNum = console.nextInt();
            player1.saveNums(guessNum, i);
            if (guessNum > secretNum) {
                System.out.println("Введённое число больше загаданного");
            } else if (guessNum < secretNum) {
                System.out.println("Введённое число меньше загаданного");
            } else {
                System.out.printf("%s, ты победил", player1.getName());
                break;
            }

            System.out.println(player2.getName() + ", введи свой вариант:");
            guessNum = console.nextInt();
            player2.saveNums(guessNum, i);
            if (guessNum > secretNum) {
                System.out.println("Введённое число больше загаданного");
            } else if (guessNum < secretNum) {
                System.out.println("Введённое число меньше загаданного");
            } else {
                System.out.printf("%s, ты победил.", player2.getName());
                break;
            }
        }
    }
}