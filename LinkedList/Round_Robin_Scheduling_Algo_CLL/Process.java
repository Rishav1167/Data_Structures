package LinkedList.Round_Robin_Scheduling_Algo_CLL;

public class Process {
int processId;
int burstTime;
int priority;
Process next;


public Process(int processId, int burstTime, int priority) {
    this.processId = processId;
    this.burstTime = burstTime;
    this.priority = priority;
    this.next = null;
}

@Override
public String toString() {
    return "Process ID: " + processId + ", Burst Time: " + burstTime + ", Priority: " + priority;
}
}