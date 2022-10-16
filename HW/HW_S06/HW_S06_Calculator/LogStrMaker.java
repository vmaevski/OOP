import java.util.Date;

public class LogStrMaker {

    int x1, x2, y1, y2, calcVariant;
    String result;
    
    public String getEvent() {
        Date date = new Date();
        String event = date.toString() + ": ";
        if (calcVariant == 1) {
            event += Integer.toString(x1) + "/" + Integer.toString(x2) + " + " + Integer.toString(y1) + "/"
                    + Integer.toString(y2) + " = ";
        } else{
            event += Integer.toString(x1) + " + " + Integer.toString(x2) + "i + " + Integer.toString(y1) + " + "
                    + Integer.toString(y2) + "i = ";
        }
        event += result;
        return event;
    }
    
    public void setCalcVariant(int value) {
        calcVariant = value;
    }

    
    public void setX1(int value) {
        x1 = value;
    }

    
    public void setX2(int value) {
        x2 = value;
    }

    
    public void setY1(int value) {
        y1 = value;
    }

    
    public void setY2(int value) {
        y2 = value;
    }

    public void setResult(String value) {
        result = value;
    }
}