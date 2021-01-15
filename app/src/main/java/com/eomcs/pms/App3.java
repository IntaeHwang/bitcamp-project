package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[프로젝트]");
    int number = ScannerUtil.nextInt(scanner, "번호? ");
    String projectName = ScannerUtil.nextLine(scanner, "프로젝트명? ");
    String content = ScannerUtil.nextLine(scanner, "내용? ");
    Date endDate = Date.valueOf(ScannerUtil.nextLine(scanner, "완료일? "));
    int state = ScannerUtil.nextInt(scanner, "상태?\n", "0: 신규\n 1: 진행중\n 2: 완료");
    String incharge = ScannerUtil.nextLine(scanner, "담당자? ");

    System.out.println("--------------------------------");
    System.out.println("번호: " + number);
    System.out.println("프로젝트명: " + projectName);
    System.out.println("내용: " + content);;
    System.out.println("완료일: " + endDate);
    System.out.print("상태: ");
    switch(state) {
      case 1:
        System.out.println("진행중");
        break;
      case 2:
        System.out.println("완료");
        break;
      default:
        System.out.println("신규");

    }
    System.out.println("상태: " + state);
    System.out.println("담당자: " + incharge);

    scanner.close();
  }
}
