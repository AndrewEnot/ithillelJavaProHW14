package homework14.schoolmessenger.model;

import homework14.schoolmessenger.api.Sex;

public class Parent extends Human {

  private boolean isWorking;

  public Parent(String firstName, String secondName, int age, Sex sex,
      boolean isWorking) {
    super(firstName, secondName, age, sex);
    this.isWorking = isWorking;
  }

  @Override
  public void update(Object object) {
    if (object != null) {
      System.out.println(object + " under control by " + getFirstName() + " " + getSecondName());
    }
  }


  public boolean isWorking() {
    return isWorking;
  }
}
