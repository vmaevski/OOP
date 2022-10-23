import java.io.*;
// import java.io.FileWriter;
// import java.io.PrintWriter;

public class TaskWriter {
   public static void writeToCSV(String str) {
      String logFile = "db.csv";
      String event = str;      


      try(FileWriter writer = new FileWriter(logFile, false))
      {
         // запись всей строки
          String text = event;
          writer.write(text);
          // запись по символам
         //  writer.append('\n');
           
          writer.flush();
      }
      catch(IOException ex){
           
          System.out.println(ex.getMessage());
      } 
 }
}  


