class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}