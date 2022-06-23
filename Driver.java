/**
 * Driver.java
 * 
 * Demonstrates different scheduling algorithms.
 * 
 * Usage:
 *  
 *  java Driver <schedule> <algorithm>
 *
 * where 
 *  schedule is schedule of tasks
 *
 *  algorithm = [FCFS, SJF, PRI, RR, PRI-RR]
 */
  
import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java Driver <algorithm> <schedule>");
            System.exit(0);
        }

        BufferedReader inFile = new BufferedReader(new FileReader(args[1]));

        String schedule;

        // create the queue of tasks
        List<Task> queue = new ArrayList<Task>();

        // read in the tasks and populate the ready queue        
        while ( (schedule = inFile.readLine()) != null) {
            String[] params = schedule.split(",\\s*");
            queue.add(new Task(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2])));
        }

        inFile.close();
        
        Algorithm scheduler = null;
        String choice = args[0].toUpperCase();

        switch(choice) {
            case "FCFS":
                System.out.println("First Come First Serve Scheduling\n");
                scheduler = new FCFS(queue);
                break;
            case "SJF":
                System.out.println("Shortest Job First Scheduling\n");
                scheduler = new SJF(queue);
                break;
            case "PRI":
                System.out.println("Priority Scheduling (Highest Priority First)\n");
                scheduler = new Priority(queue);
                break;
            case "RR":
                System.out.println("Round Robin Scheduling\n");
                scheduler = new RR(queue);
                break;
            case "PRI-RR":
                System.out.println("Priority with RR Scheduling\n");
                scheduler = new PriorityRR(queue);
                break;
            default:
                System.err.println("Invalid algorithm");
                System.exit(0);
        }

        // start the scheduler
        scheduler.schedule();
    }
}
