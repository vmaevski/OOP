public class App {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(10);
        System.out.println(sq.getArea());

        Rectangle rect = new Rectangle();
        rect.setHeight(20);
        rect.setWidth(30);
        System.out.println(rect.getArea());
    }
}
