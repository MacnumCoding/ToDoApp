import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    Task task = new Task(0, "Start of list");

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        int newId = tasks.size() + 1;
        Task newTask = new Task(newId, description);
        tasks.add(newTask);
        System.out.println("Task added: " + description);
    }

    public void removeTask(int taskId) {
        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                System.out.println("Task removed with ID: " + taskId);
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found");
    }

    public void displayTasks() {
        if(tasks.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Task List:");
            for (Task task : tasks) {
                System.out.println("ID" + task.getId() + " - Description: " + task.getDescription() + "- Completed: " + task.isCompleted());
            }
        }
    }

    public void markAsComplete(int taskId) {
        for(Task task: tasks) {
            if(task.getId() == taskId) {
                task.setComplete(true);
                System.out.println("Task with ID " + taskId + " marked as completed.");
                return;
            }
        }
        System.out.println("Task with ID" + taskId + " was not found.");
    }
}
