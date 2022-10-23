import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class TaskLoader {
    public static void loadFromCsv() {
        String path = "db.csv";
        String line = "";
        // RandomAccessFile f = new RandomAccessFile(path, "rw");
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }
                String[] values = line.split(",");

                int id = Integer.parseInt(values[0]);
                String toDo = values[1];
                String author = "Создатель";
                Date creationDate = new Date();
                Priority priority = Priority.high;
                Date deadline = creationDate;
                Task t = new Task(id, toDo, author, creationDate, deadline, priority);
                TaskCollection.tasks.add(t);
                System.out.println("ID: " + values[0] + "\ttoDo: " + values[1] + "\tdeadline: " + values[2]
                        + "\tpriority: " + values[3]);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
