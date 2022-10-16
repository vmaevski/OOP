import java.io.*;


public class Logger {

    int x1, x2, y1, y2, calcVariant; 
    String res;

    // public String getEvent() {
    //     // Date date = new Date();
    //     // String event = date.toString() + ": ";
    //     // if (calcVariant == 1) {
    //     //     event += Integer.toString(x1) + "/" + Integer.toString(x2) + " + " + Integer.toString(y1) + "/"
    //     //             + Integer.toString(y2) + " = " + result();
    //     // } else{
    //     //     event += Integer.toString(x1) + " + " + Integer.toString(x2) + "i + " + Integer.toString(y1) + " + "
    //     //             + Integer.toString(y2) + "i = " + result();
    //     // }
    //     // return event;
    //     return null;
    // }

    public void recordEvent(String value) {
        String logFile = "log.txt";
        String event = value;      


        try(FileWriter writer = new FileWriter(logFile, true))
        {
           // запись всей строки
            String text = event;
            writer.write(text);
            // запись по символам
            writer.append('\n');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

    } 

}
