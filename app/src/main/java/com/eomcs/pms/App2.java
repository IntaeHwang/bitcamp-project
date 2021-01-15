package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[프로젝트]");
    int number = ScannerUtil.nextInt(scanner, "번호? ");
    String projectName = ScannerUtil.nextLine(scanner, "프로젝트명? ");
    String content = ScannerUtil.nextLine(scanner, "내용? ");
    Date startDate = Date.valueOf(ScannerUtil.nextLine(scanner, "시작일? "));
    Date endDate = Date.valueOf(ScannerUtil.nextLine(scanner, "종료일? "));
    String creator = ScannerUtil.nextLine(scanner, "만든이? ");
    String member = ScannerUtil.nextLine(scanner, "팀원? ");

    System.out.println("--------------------------------");
    System.out.println("번호: " + number);
    System.out.println("프로젝트명: " + projectName);
    System.out.println("내용: " + content);
    System.out.println("시작일: " + startDate);
    System.out.println("종료일: " + endDate);
    System.out.println("만든이: " + creator);
    System.out.printf("팀원: " + member);

    scanner.close();
  }
}