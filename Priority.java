import java.util.*;

public class Priority implements Algorithm {

  private ArrayList<Task> taskQueue;

  public Priority(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    System.out.println("Scheduling Priority");
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in Priority");
    return new Task("fake", 0, 0);
  }
}