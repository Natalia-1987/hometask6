public class Task1 {
    public static <T> void interchange(T[] args, int i, int j){
        T temp = args[i];
        args[i] = args[j];
        args[j] = temp;
    }
}
