import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityRR implements Algorithm {

  private ArrayList<Task> taskQueue;
  private int currTask = 0;
  private ArrayList<Task> miniQueue;

  public PriorityRR(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    this.taskQueue.sort(new SortByPriority());

    // iterate through all the tasks
    while (this.taskQueue.size() > 0) {
      this.currTask = 0;
      int currPriority = pickNextTask().getPriority();
      miniQueue = new ArrayList<Task>();
      // Add all the tasks with that priority
      while (this.currTask < this.taskQueue.size() && pickNextTask().getPriority() == currPriority) {
        miniQueue.add(pickNextTask());
        this.taskQueue.remove(currTask);
        this.currTask++;
      }
      Algorithm mini = new RR(miniQueue);
      mini.schedule();
    }
  }

  public Task pickNextTask() {
    return this.taskQueue.get(currTask);
  }
}