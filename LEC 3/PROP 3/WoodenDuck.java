class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}