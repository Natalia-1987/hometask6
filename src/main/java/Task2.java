import java.util.ArrayList;
import java.util.List;

//public static <T extends Comparable<? super T>>
//    T max(List<? extends T> list, int begin, int end) //Option1
//
//public static <T extends Comparable<T>>
//    T max(List<? extends T> list, int begin, int end) //Option2


public class Task2 {

    public static <T extends Comparable<T>> T max(List<? extends T> list, int begin, int end){

        T maxElem = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(maxElem) > 0) {
                maxElem = elem1;
            }
        }
        return maxElem;
    }





    public static void test(){
        List<String> l = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        Integer res = max(l2, 1,2);
    }
}

//    public static <T extends Comparable> T maximalElement (List<T> list, int from, int to) {
//        T max = list.get(from);
//        for (int i = from + 1; i < to; i++) {
//            T elem1 = list.get(i);
//            if (elem1.compareTo(max) > 0) {
//                max = elem1;
//            }
//        }
//        return max;
//    }

//    public static <T extends Object & Comparable<? super T>>
//    T max (List<? extends T> list, int begin, int end) {
//
//        T maxElem = list.get(begin);
//
//        for (++begin; begin < end; ++begin) {
//            if (maxElem.compareTo(list.get(begin)) < 0) maxElem = list.get(begin);
//        }
//        return maxElem;
//    }