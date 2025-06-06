public class Gin extends Decorator {
    public Gin(Offering offering) {
        super(offering);
    }
    public int getPrice() {
        return offering.getPrice()+200;
    }

    public String getName() {
        return offering.getName()+" with Gin";
    }
}
