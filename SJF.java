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
    this.taskQueue.sort(new SortByTime());
    for (Task i : this.taskQueue) {
      CPU.run(i, i.getBurst());
    }
  }

  public Task pickNextTask() {
    System.out.println("Picking next task in SJF");
    return new Task("fake", 0, 0);
  }
}
