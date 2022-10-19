package HW_S03.HW_S03_MultiArgClass;

public class Builder {
        static int arg1 = 111;
        static String arg2 = "Dva";
        static double arg3 = 333;
        static int arg4 = 444;
        static String arg5 = "Pyat'";
        static int arg6 = 666;
        static String arg7 = "Sem'";
        
        public static Foo create() {
            return new Foo(
                arg1 ,
                arg2,
                arg3,
                arg4,
                arg5,
                arg6,
                arg7
                );
        }
}

