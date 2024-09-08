import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ToDoList toDoList = new ToDoList();
        Scanner userInput = new Scanner(System.in);
        String input = "";

        while(!input.equals("4")) {
            System.out.println("Choose an option:");
            System.out.println("1: Add a task\n2: Mark a tast as complete\n3: Remove a task\n4: Exit");
            input = userInput.nextLine();

            switch(input) {
                case "1":
                    System.out.println("Enter a task to add:");
                    String taskDescription = userInput.nextLine();
                    toDoList.addTask(taskDescription);
                    break;
                case "2":
                    System.out.println("Enter a task id to mark as completed:");
                    int Completed = Integer.parseInt(userInput.nextLine());
                    toDoList.markAsComplete(Completed);
                    break;
                case "3":
                    System.out.println("Enter a task id to remove:");
                    int removeTaskWithId = Integer.parseInt(userInput.nextLine());
                    toDoList.removeTask(removeTaskWithId);
                    break;
                case "4":
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
            toDoList.displayTasks();
        }
        userInput.close();
    }
}

