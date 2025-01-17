package bobi.task;

import java.time.LocalDateTime;

/**
 * To-Do class inherits from Task class.
 * A To-Do object encapsulates the task name and status.
 *
 * @author ruo-x
 */
public class ToDo extends Task {
    /**
     * Constructor of a To-Do Object.
     *
     * @param isDone Status of task.
     * @param taskName Name of task.
     */
    public ToDo(boolean isDone, String taskName) {
        super(isDone, taskName);
    }

    /**
     * @inheritDoc
     */
    @Override
    public LocalDateTime getTaskDue() {
        return null;
    }

    /**
     * Returns a string format of a To-Do object to be displayed to the user.
     */
    @Override
    public String toString() {
        if (this.getStatus()) {
            return "[T]" + "[X] " + this.getName();
        } else {
            return "[T]" + "[ ] " + this.getName();
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toStoreString() {
        if (this.getStatus()) {
            return "T/@/1/@/" + this.getName();
        } else {
            return "T/@/0/@/" + this.getName();
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toUpdateString(int newStatus) {
        return "T/@/" + newStatus + "/@/" + this.getName();
    }
}
