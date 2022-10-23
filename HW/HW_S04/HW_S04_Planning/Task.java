import java.util.Date;

/**
 * Task
 */
public class Task {
    int id;
    String toDo, author;
    Date creationDate, deadline;
    Priority priority;
    Status status;

    public Task(int iD, String td, String au, Date cd, Date dl, Priority pr){
        id = iD;
        toDo = td;
        author = au;
        creationDate = cd;
        deadline = dl;
        priority = pr;
        status = Status.needToDo;
    }

    public int getId() {
        return id;
    }
    public String getToDo() {
        return toDo;
    }
    public String getAuthor() {
        return author;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Date getDeadline() {
        return deadline;
    }
    public Priority getPriority() {
        return priority;
    }
    public Status getStatus() {
        return status;
    }
}

enum Priority{
    high,
    medium,
    low
}

enum Status{
    needToDo,
    completed
}