public class Decorator extends Offering{
    Offering offering;
    public Decorator(Offering offering) {
        this.offering = offering;
    }
    public int getPrice(){
        return offering.getPrice();
    }    
    public String getName(){
        return offering.getName();
    }
}
