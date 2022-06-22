import java.util.*;

public class FCFS implements Algorithm{

  private ArrayList<Task> taskQueue;

  public FCFS(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }
  
  public void schedule() {
    System.out.println("Scheduling FCFS");
    System.out.println();
    // keep it the same order
    for (Task curr : taskQueue) {
      CPU.run(curr, curr.getBurst());
    }
  }

  // this function is not needed because it simply runs straight through one by one
  public Task pickNextTask() {
    System.out.println("Picking next task in FCFS");
    return new Task("fake", 0, 0);
  }
}