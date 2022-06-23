import java.util.*;

class SortByPriority implements Comparator<Task> {

  public int compare(Task a, Task b) {
    return b.getPriority() - a.getPriority();
  }
}

public class Priority implements Algorithm {

  private ArrayList<Task> taskQueue;

  public Priority(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    // sort by priority
    this.taskQueue.sort(new SortByPriority());

    while(this.taskQueue.size() > 0) {
      CPU.run(pickNextTask(), pickNextTask().getBurst());
      this.taskQueue.remove(0);
    }
  }

  public Task pickNextTask() {
    return this.taskQueue.get(0);
  }
}