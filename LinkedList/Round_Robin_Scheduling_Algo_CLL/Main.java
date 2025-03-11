package LinkedList.Round_Robin_Scheduling_Algo_CLL;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time quantum = 4

        // Adding processes
        scheduler.addProcess(new Process(1, 10, 2));
        scheduler.addProcess(new Process(2, 5, 1));
        scheduler.addProcess(new Process(3, 8, 3));

        // Display initial list of processes
        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        // Simulate round-robin scheduling
        scheduler.simulateScheduling();
    }
}