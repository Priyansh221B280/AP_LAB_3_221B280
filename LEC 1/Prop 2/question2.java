
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {

    void show() {
        System.out.println("Hello JUET");
    }
}
public class question2 {
    public static void main(String[] args) {
        Mother obj1 = new Mother();
        obj1.show(); 

        Child obj2 = new Child();
        obj2.show(); 
    }
}
