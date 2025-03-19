package Bar;
abstract class Beverage {
    protected  void Pour(int quantity,String name){
        System.out.println("Pour "+quantity+" ml of "+name+" in a glass");
    };
    protected abstract void Add_Condiments();
    protected void Stir(){};
    private void serve(){
        System.out.println("Serve the drink");
    }
    public void template(int quantity,String name){
        Pour(quantity,name);
        Add_Condiments();
        Stir();
        serve();
    }
}