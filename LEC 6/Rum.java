public class Rum extends Decorator {
    public Rum(Offering offering) {
        super(offering);
    }
    public int getPrice() {
        return offering.getPrice()+100;
    }

    public String getName() {
        return offering.getName()+" with Rum";
    }

}
