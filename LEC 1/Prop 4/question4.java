// Create a class One and make a parameterized constructor One( int x){ } inside this class.
class One{
    int x;
    One(int x)
    {
        this.x=x;
    }
}

// Create a class Two derived from One: class Two extends One { }.
class Two extends One{
    Two(int x)
    {
        // Call the constructor of the superclass using super() method and pass the value of x to it.
        super(x);
    }
}


public class question4 {
    public static void main(String[] args) {
        Two t = new Two(10);
        System.out.println(t.x);
    }
}
