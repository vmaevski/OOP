public class SumModel extends CalcModel {

    @Override
    public String result() {
        String res = "";
        if (super.calcVariant == 1) {
            int numerator = x1 * y2 + y1 * x2;
            int denominator = x2 * y2;
            res = Integer.toString(numerator) + " / " + Integer.toString(denominator);
            return res;
        } else{
            int res1 = x1 + y1;
            int res2 = x2 + y2;
            res = Integer.toString(res1) + " + " + Integer.toString(res2) + "i";
            return res;
        }
    }

    // @Override
    // public String getEvent() {
    //     String event = ""; // записать текущие дату, время и 
    //     return event;
    // }

    @Override
    public void setCalcVariant(int value) {
        super.calcVariant = value;
    }

    @Override
    public void setX1(int value) {
        super.x1 = value;
    }

    @Override
    public void setX2(int value) {
        super.x2 = value;
    }

    @Override
    public void setY1(int value) {
        super.y1 = value;
    }

    @Override
    public void setY2(int value) {
        super.y2 = value;
    }
}
