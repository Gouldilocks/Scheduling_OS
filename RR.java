import java.util.*;

public class RR implements Algorithm {

  private ArrayList<Task> taskQueue;

  public RR(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    System.out.println("Scheduling RR");
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in RR");
    return new Task("fake", 0, 0);
  }
}