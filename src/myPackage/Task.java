package myPackage;


class Task {
    private String description;
    private boolean isCompleted;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public void setDescription(String desc){
        this.description = desc;
    }
    
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}