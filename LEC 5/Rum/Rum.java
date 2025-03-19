package Rum;
public class Rum {
    private void Pour(){
        System.out.println("Add 60ml of Rum");
    }
    private void Add_Condiments(){
        System.out.println("Add 40ml of Soda");
    }
    private void Add_Ice(){
        System.out.println("Ice is being added");
    }
    private void Stir(){
        System.out.println("The drink is being stirred");
    }
    private void Serve(){
        System.out.println("Serve the drink through waiter");
    }
    public void Template(){
        Pour();
        Add_Condiments();
        Add_Ice();
        Stir();
        Serve();
    }
}
