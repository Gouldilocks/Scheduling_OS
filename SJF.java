import java.util.*;

class SortByTime implements Comparator<Task>{

  public int compare(Task a, Task b) {
    return a.getBurst() - b.getBurst();
  }
}

public class SJF implements Algorithm {

  private ArrayList<Task> taskQueue;

  public SJF(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }
  
  public void schedule() {
    System.out.println("Scheduling SJF");
    System.out.println();

    // sort them by their time
    this.taskQueue.sort(new SortByTime());
    while(this.taskQueue.size() > 0) {
      CPU.run(pickNextTask(), pickNextTask().getBurst());
      this.taskQueue.remove(0);
    }
  }

  public Task pickNextTask() {
    return this.taskQueue.get(0);
  }
}
