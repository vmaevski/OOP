import java.util.Scanner;
import java.util.Date;

public class TaskMaker {

    public static String getString(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextLine();
    }

    public static int getInt(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // public void print(String data, String title) {
    //     System.out.printf("%s %s\n", title, data);
    // }

    public static Task newTask() {
        int id = getInt("Задайте id: \n");
        String toDo = getString("Что предстоит сделать:\n");
        String author = "Создатель";
        Date creationDate = new Date();
        Priority priority = Priority.high;
        Date deadline = creationDate;
        Task t = new Task(id, toDo, author, creationDate, deadline, priority);
        return t;
    }
}
