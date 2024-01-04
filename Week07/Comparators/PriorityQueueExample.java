package Week07.Comparators;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    
    public static void main(String[] args) {
        PriorityQueue<Task> todo = new PriorityQueue<>(new TaskComparator());
        todo.offer(new Task("Study Java"));
        todo.offer(new Task("Get Groceries"));
        todo.offer(new Task("Go for a walk"));
        todo.offer(new Task("Clean the bathroom"));
        System.out.println("\nPrioritizing todo list:");
        while(!todo.isEmpty()) {
            System.out.println(todo.poll().getName());
        }
    }
}

class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.getName().contains("Clean"))
            return 1;
        else if (o1.getName().contains("Groceries"))
            return -1;
        return 0;
    }
}