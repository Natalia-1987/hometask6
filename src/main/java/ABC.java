public class ABC {
    public void display(){
        System.out.println("display() method of Parent class");
    }

    public static void main(String[] args) {
        ABC obj1 = new ABC();
        obj1.display();

        ABC obj2 = new Demo();
        obj2.display();
    }
}
