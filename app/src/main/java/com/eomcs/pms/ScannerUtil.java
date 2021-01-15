package com.eomcs.pms;

import java.util.Scanner;
public class ScannerUtil{
  public static String nextLine(Scanner scanner, String message) {
    System.out.print(message);
    String temp = scanner.nextLine();

    if(temp.isEmpty()) {
      temp = scanner.nextLine();
    }

    return temp;
  }

  public static int nextInt(Scanner scanner, String message) {
    System.out.print(message);
    int number = scanner.nextInt();

    return number;
  }

  public static int nextInt(Scanner scanner, String message, String menu) {
    System.out.print(message);
    System.out.println(menu);
    System.out.print("> ");
    int number = scanner.nextInt();

    return number;
  }
}