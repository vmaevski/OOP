package HW_S03.HW_S03_MultiArgClass;

public class App {
    public static void main(String[] args) {
        Foo foo01 = Builder.create();
        // Foo(arg2:"qweasd", arg7:"qwe");
        foo01.arg2 = "qweasd";
        foo01.arg7 = "qwe";
        System.out.println("arg1 = " + foo01.arg1);
        System.out.println("arg2 = " + foo01.arg2);
        System.out.println("arg3 = " + foo01.arg3);
        System.out.println("arg4 = " + foo01.arg4);
        System.out.println("arg5 = " + foo01.arg5);
        System.out.println("arg6 = " + foo01.arg6);
        System.out.println("arg7 = " + foo01.arg7);

    }
}
