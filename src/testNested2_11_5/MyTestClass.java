package testNested2_11_5;

/**
 * Created by R2-D2 on 12.03.2016.
 */
public class MyTestClass {
    public void test() {
        int i = 5;
        class MyLocal {
            private int b = i;

            public MyLocal(int c) {
                b += c;
            }
        }
        MyLocal local = new MyLocal(9);
        System.out.println(local.b);
    }

    public static class MyStaticNested {
        public MyTestClass createMyTestClass() {
            return new MyTestClass();
        }
    }
}
