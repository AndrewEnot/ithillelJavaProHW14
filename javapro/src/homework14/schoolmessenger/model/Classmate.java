package homework14.schoolmessenger.model;

import homework14.schoolmessenger.api.Sex;

public class Classmate extends Human {

  private final Parent[] parents;

  public Classmate(String firstName, String secondName, int age, Sex sex, Parent[] parents) {
    super(firstName, secondName, age, sex);
    this.parents = parents;
  }

  //This method update and confirm getting of message from controller to the classmate
  @Override
  public void update(Object object) {
    if (object != null) {
      System.out.println(object + " is accepted...");
      for (Parent parent : parents) {
        if (!parent.isWorking()) {
          parent.update(object);
        }
      }
    }
  }

  public Parent[] getParents() {
    return parents;
  }
}
