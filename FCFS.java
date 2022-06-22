import java.util.*;

public class FCFS implements Algorithm{

  private ArrayList<Task> taskQueue;

  public FCFS(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }
  
  public void schedule() {
    System.out.println("Scheduling FCFS");
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in FCFS");
    return new Task("fake", 0, 0);
  }
}