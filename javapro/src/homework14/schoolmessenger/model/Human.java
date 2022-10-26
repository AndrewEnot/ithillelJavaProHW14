package homework14.schoolmessenger.model;

import homework14.schoolmessenger.api.Observer;
import homework14.schoolmessenger.api.Sex;

public abstract class Human implements Observer {

  private final String firstName;
  private final String secondName;
  private final int age;
  private final Sex sex;

  public Human(String firstName, String secondName, int age, Sex sex) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
    this.sex = sex;
  }

  @Override
  public void printInfo() {
    System.out.println(getFirstName() + " " + getSecondName() + " SEX: " + getSex() +
        " AGE: " + getAge());
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public int getAge() {
    return age;
  }

  public Sex getSex() {
    return sex;
  }
}
