class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("MuteQuack...");
    }
}

class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("Swimming...");
    }
}