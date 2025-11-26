package com.mycompany.section03.dto;

// DTO : Data Transfer Object, 데이터 전달용 객체
// - 데이터를 묶어서 전달하는 용도의 객체
// - 추상화된 필드는 있음
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

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
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

  /* 설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
   * 설정자(setter) 작성 규칙
   *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
   *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
   *  [표현식]
   *  public void set필드명(매개변수) {
   *      필드 = 매개변수;
   *  }
   *  [작성예시]
   *  public void setName(String name) {
   *      this.name = name;
   *  }
   *
   *  접근자(getter) 작성 규칙
   *  : 필드의 값을 반환받을 목적의 메서드 집함을 의미한다.
   *    각 접근자는 하나의 필드에만 접근하도록 한다.
   *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
   *  [표현식]
   *  public 반환형 get필드명() {
   *      return 반환값;
   *  }
   *  [작성예시]
   *  public String getName() {
   *      return this.name;
   *  }
   * */

}
