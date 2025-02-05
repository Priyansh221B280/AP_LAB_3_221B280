class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a Lake Duck.");
    }
}