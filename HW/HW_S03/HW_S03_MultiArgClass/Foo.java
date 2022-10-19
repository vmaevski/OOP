package HW_S03.HW_S03_MultiArgClass;

public class Foo{
    int arg1;
    String arg2;
    double arg3;
    int arg4;
    String arg5;
    int arg6;
    String arg7;

    public Foo(
        int arg1,
        String arg2,
        double arg3,
        int arg4,
        String arg5,
        int arg6,
        String arg7
    ){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
        this.arg6 = arg6;
        this.arg7 = arg7;
    }


}

// new Foo(arg1:1);
// new Foo(arg1:1, arg2:"qwe");
// new Foo(arg1:1, arg7:"qwe");
// new Foo(arg2:"qweasd", arg7:"qwe");