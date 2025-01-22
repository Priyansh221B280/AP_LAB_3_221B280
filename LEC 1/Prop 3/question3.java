class Mother {
    //no static
    void show() {
        System.out.println("Hello World");
    }

    // static in mother
    // static void show() {
    //     System.out.println("Hello World");
    // }

    // static in child
    // void show() {
    //     System.out.println("Hello World");
    // }
}
class Child extends Mother {
    // no static
    void show() {
        System.out.println("Hello JUET");
    }

    // static in mother
    // void show() {
    //      System.out.println("Hello JUET");
    // }

    // static in child
    // static void show() {
    //     System.out.println("Hello World");
    // }
}

public class question3 {
    public static void main(String[] args) {
        Mother m1=new Child ();
        m1.show(); //Hello JUET
        // m1.show(); //show() in Child cannot override show() in Mother overridden method is static
        // m1.show(); // show() in Child cannot override show() in Mother

    }
}
