public class Task {
    private int id;
    private String description;
    private boolean isComplete;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}