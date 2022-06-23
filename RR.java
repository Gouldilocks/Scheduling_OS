import java.util.*;

public class RR implements Algorithm {

  private ArrayList<Task> taskQueue;
  private int burstAmt = 10; 
  private int currTask = 0;

  public RR(List<Task> newQueue) {
    this.taskQueue = new ArrayList<Task>(newQueue);
  }

  public void schedule() {
    while (this.taskQueue.size() > 0) {
      // run the task, reduce its burst amt
      CPU.run(pickNextTask(), this.burstAmt);

      // if the next task is done executing
      if (pickNextTask().getBurst() <= 0) {
        this.taskQueue.remove(currTask);
      }
      // if the next task is not done executing
      else {
        // increment the task to the next one
        this.currTask++;
        // if the next one is >= the size, wrap back
        if (this.currTask >= this.taskQueue.size()) {
          this.currTask = 0;
        }
      }
    }
  }

  public Task pickNextTask() {
    return this.taskQueue.get(currTask);
  }
}