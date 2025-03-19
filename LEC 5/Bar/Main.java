package Bar;

public class Main {
    public static void main(String[] args) {
       Beverage b = new Beer();
        b.template(90,"beer");
        b = new Whiskey();
        b.template(40,"whiskey");
    }
}
