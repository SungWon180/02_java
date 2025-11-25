package com.ohgiraffers.section03.dto;

// DTO(Data Transfer Object, 데이터 전달용 객체)
// - 데이터를 묶어서 전달하는 용도의 객체
// - 추상화된 필드 O
// - getter/setter 외에 다른 메서드가 없음
public class MemberDTO {

  /* 취급하려고 하는 회원정보를 고려해서 필드를 우선 작성.
   * 주로 화면(UI) 혹은 데이터베이스 테이블을 기준으로 한다.
   * 회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화여부)를 관리할 것이다.
   * 값 객체가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
   * DTO클래스를 만들기 위해서는 모든 필드를 private로 만든다.
   * */

  private int number;				    	//회원번호
  private String name;				    //회원명
  private int age;					      //나이
  private char gender;				    //성별
  private double height;			  	//키
  private double weight;			  	//몸무게
  private boolean isActivated;		//회원탈퇴여부(활성화여부)

  /* 필드 간접 접근을 위한 getter(접근자), setter(설정자) */

  public int getNumber(){
    return number;
  }

  public void setNumber(int number){
    this.number = number;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public boolean isActivated() {
    return isActivated;
  }

  public void setActivated(boolean activated) {
    isActivated = activated;
  }
}
