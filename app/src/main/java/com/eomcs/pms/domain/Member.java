package com.eomcs.pms.domain;

import java.sql.Date;

public class Member {
  //회원 정보를 저장할 메모리의 설계도
  // - 각 항목의 데이터를 저장할 변수를 선언한다.
  // - 이 변수를 "필드(field)"라고 부른다.
  //
  public int no;
  public String name;
  public String email;
  public String password;
  public String photo;
  public String tel;
  public Date registeredDate;
}
