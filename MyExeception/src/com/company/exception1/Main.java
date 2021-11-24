package com.company.exception1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int num = Integer.parseInt(scanner.nextLine());

            try {
                if (num != 0) {
                    throw new ScannerException("Нольго барабар эмес");
                }
            } catch (ScannerException y) {
                System.out.println(y.getMessage());
            }
        }
    }
}