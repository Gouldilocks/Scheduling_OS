import java.util.*;

public class SJF implements Algorithm {

  private ArrayList<Task> taskQueue;

  public SJF(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    System.out.println("Scheduling SJF");
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in SJF");
    return new Task("fake", 0, 0);
  }
}