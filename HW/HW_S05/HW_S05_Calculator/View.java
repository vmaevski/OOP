import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public int getVariant(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(String data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
