package homework14.schoolmessenger;

import homework14.schoolmessenger.api.Sex;
import homework14.schoolmessenger.controller.MessageController;
import homework14.schoolmessenger.model.Classmate;
import homework14.schoolmessenger.model.Parent;

public class Main {

  public static void main(String[] args) {

    Parent parent1 =
        new Parent("John", "Garfield", 36, Sex.MAN, true);
    Parent parent2 =
        new Parent("Sara", "Garfield", 33, Sex.WOMEN, false);

    Classmate classmate1 = new Classmate(
        "Andrew", "Garfield", 12, Sex.MAN, new Parent[]{parent1, parent2});
    Classmate classmate2 = new Classmate(
        "Mary", "Garfield", 12, Sex.WOMEN, new Parent[]{parent1, parent2});

    MessageController classFirst = new MessageController();
    classFirst.register(classmate2);
    classFirst.register(classmate1);
    System.out.println();

    classFirst.printObservers();
    System.out.println();

    classFirst.notifySmb("Home Task #1");
    classFirst.notifySmb("Control work #1");
    System.out.println();

    classFirst.remove(classmate1);
    classFirst.printObservers();

  }
}