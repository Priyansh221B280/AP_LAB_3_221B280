package Beer;
public class Beer {
    private void pour(){
        System.out.println("Beer is being poured");
    }
    private void Add_ice(){
        System.out.println("Add some ice");
    }
    private void Serve(){
        System.out.println("Serve the drink through waiter");
    }
    public void Template(){
        pour();
        Add_ice();
        Serve();
    }
}
