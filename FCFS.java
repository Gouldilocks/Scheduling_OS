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
    while (this.taskQueue.size() > 0) {
      CPU.run(pickNextTask(), pickNextTask().getBurst());
      this.taskQueue.remove(0);
    }
  }

  // this function is not needed because it simply runs straight through one by one
  public Task pickNextTask() {
    return this.taskQueue.get(0);
  }
}