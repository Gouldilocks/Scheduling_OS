import java.util.*;

public class PriorityRR implements Algorithm {

  private ArrayList<Task> taskQueue;

  public PriorityRR(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    System.out.println("Scheduling PriorityRR");
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in PriorityRR");
    return new Task("fake", 0, 0);
  }
}