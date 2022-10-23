import java.util.ArrayList;

public abstract class TaskCollection implements Init {
    static ArrayList<Task> tasks = new ArrayList<Task>();

    public static void addTask() {
        tasks.add(TaskMaker.newTask());
    }

    public static String stringDB() {
        String str = "";
        // String str = "id,toDo,deadline,priority\n";
        for (Task task : tasks) {
            if (str.length() != 0) {
                str += "\n";
            }
            str += task.id + "," + task.toDo + "," + task.deadline + "," + task.priority;
        }
        return str;
    }

    public static void printTasks(ArrayList<Task> tasks) {
        // Task tasks = tasks;
        if (tasks.size() != 0) {
            System.out.println("Список задач:");
        } else {
            System.out.println("Список задач пуст!");
        }

        for (Task task : tasks) {
            System.out.println(task.toDo);
        }
    }

}
