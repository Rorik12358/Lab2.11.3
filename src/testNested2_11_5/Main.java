package testNested2_11_5;

/**
 * Created by R2-D2 on 12.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test();
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        MyTestClass testClass = myStaticNested.createMyTestClass();
    }

}
