public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int calcVariant = view.getVariant("Какие числа будем складывать?\n1 - рациональные числа\n2 - комплексные\n");
        int x1 = view.getValue("x1: ");
        int x2 = view.getValue("x2: ");            
        int y1 = view.getValue("y1: ");
        int y2 = view.getValue("x2: ");   
        
        model.setCalcVariant(calcVariant);
        model.setX1(x1);
        model.setX2(x2);
        model.setY1(y1);
        model.setY2(y2);        
        String result = model.result();
        // String event = model.getEvent();
        view.print(result, "Sum: ");
    }
}
