import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // TaskCollection tc = new TaskCollection();
        // InitCSV.inLoader("db.csv");
        TaskLoader.loadFromCsv();
        String text = "\nВыберите действие:\n1 - посмотреть список задач\n2 - создать новую задачу\nдругая цифра - выход из программы\n";
        while (true) {
            int answer = dialog(text);
            if (answer == 1) {
                TaskCollection.printTasks(TaskCollection.tasks);
            } else {
                if (answer == 2) {
                    TaskCollection.addTask(); 
                    System.out.println("OK");                   
                    TaskWriter.writeToCSV(TaskCollection.stringDB());
                } else {
                    break;
                }
            }
        }
            
    }


    public static int dialog(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextInt();
    }
}
