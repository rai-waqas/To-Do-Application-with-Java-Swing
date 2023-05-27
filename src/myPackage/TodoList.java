package myPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TodoList {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.markAsCompleted();
    }

    public void updateTaskPriority(Task task, int newPriority) {
        task.setPriority(newPriority);
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public void sortTasksByPriority() {
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return Integer.compare(task1.getPriority(), task2.getPriority());
            }
        });
    }

}