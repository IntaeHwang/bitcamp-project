package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[회원]");
    int number = ScannerUtil.nextInt(scanner, "번호? ");
    String name = ScannerUtil.nextLine(scanner, "이름? ");
    String email = ScannerUtil.nextLine(scanner, "이메일? ");
    String password = ScannerUtil.nextLine(scanner, "암호? ");
    String picture = ScannerUtil.nextLine(scanner, "사진? ");
    String phoneNumber = ScannerUtil.nextLine(scanner, "전화? ");
    Date registerDate = new Date(System.currentTimeMillis());

    System.out.println("--------------------------------");
    System.out.println("번호: " + number);
    System.out.println("이름: " + name);
    System.out.println("이메일: " + email);
    System.out.println("암호: " + password);
    System.out.println("사진: " + picture);
    System.out.println("전화: " + phoneNumber);
    System.out.printf("가입일: " + registerDate);

    scanner.close();
  }
}
