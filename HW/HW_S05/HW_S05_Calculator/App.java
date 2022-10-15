/**
 * Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в неё систему логирования.

 */
public class App {   
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
    }    
}