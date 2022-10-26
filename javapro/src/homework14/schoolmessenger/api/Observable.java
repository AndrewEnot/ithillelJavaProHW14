package homework14.schoolmessenger.api;

public interface Observable {

  void register(Observer observer);

  void remove(Observer observer);

  void notifySmb(String message);

}
