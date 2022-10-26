package homework14.schoolmessenger.controller;

import homework14.schoolmessenger.api.Observable;
import homework14.schoolmessenger.api.Observer;
import java.util.ArrayList;
import java.util.List;


public class MessageController implements Observable {

  private final List<Observer> observers;

  public MessageController() {
    this.observers = new ArrayList<>();
  }

  //This method add observers to the list of observers
  @Override
  public void register(Observer observer) {
    if (observer != null) {
      observers.add(observer);
    }
  }

  //This method remove from the list of observers concrete observer
  @Override
  public void remove(Observer observer) {
    if (observer != null) {
      observers.remove(observer);
    }
  }

  //This method send message to the group of observers
  public void notifySmb(String message) {
    if (message != null) {
      for (Observer observer : observers) {
        observer.update(message);
      }
    }
  }

  //This method prints info about observers in list of observers
  public void printObservers() {
    for (Observer observer : observers) {
      observer.printInfo();
    }
  }

  public List<Observer> getObservers() {
    return observers;
  }
}
