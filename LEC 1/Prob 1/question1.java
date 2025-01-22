// Make a class Mother with int x and void show ( ) as its members. Now create another
// class Child that is derived from the Mother class. Create another class Application to
// test the inheritance. 

class Mother {
    int x;
    public void show() {    
        System.out.println("This is Mother class");
        }
    }
class Child extends Mother {       
}


public class question1 {
    public static void main(String[] args) {
        Mother m=new Mother();
        Child c=new Child();
        c.show();
    }
}