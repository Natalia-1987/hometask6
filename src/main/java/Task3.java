import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void method1(List<? super Number> arg){

    }

    public static void method2(List<? extends Number> arg){

    }

    public static void main(String[] args) {
//        List<Integer> i = new ArrayList<>();
//        method1(i);
//        method2(i);
//
//        List<Object> o = new ArrayList<>();
//        method1(o);
//        method2(o);

        List<Number> n = new ArrayList<>();
        method1(n);
        method2(n);
    }
}
