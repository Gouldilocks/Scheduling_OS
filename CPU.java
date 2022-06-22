/**
 * "Virtual" CPU
 *
 * This virtual CPU also maintains system time.
 *
 * @author Greg Gagne - March 2016
 */
 
public class CPU
{
    /**
     * Run the specified task for the specified slice of time.
     */
    public static void run(Task task, int slice) {
        System.out.println("Will run " + task);
        // if the task is finished running
        if (task.run(slice)) {
           System.out.println("Completed Task " + task.getName()); 
           System.out.println();
        }
    }
}
