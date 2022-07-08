package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int chch;

        seconds %= 86400;
        chch = seconds/3600;

        System.out.printf("%01d:%02d:%02d", chch, (seconds-chch*3600)/60, seconds%60);

    }
}
