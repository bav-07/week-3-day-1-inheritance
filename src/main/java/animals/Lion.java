package animals;

// Use the extends keyword to inherit the Animal class
// Makes this class, Lion, a subclass of Animal, the superclass
// The subclass inherits all properties and methods from the superclass, but can also declare separate properties and
public class Lion extends Animal {

    // this is an instance variable (an instance === object instantiated from a class)
    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing){
        // Use super(parameter1, parameter2, ...) to inherit the constructor from the superclass
        super(name); // === new Animal("Simba, "lion");
        this.canWaitToBeKing = canWaitToBeKing;
    }

    public Lion(){
        super("Simba");
        this.canWaitToBeKing = true;
    }

    // the @Override annotation is obsolete because IntelliJ already indicates that a method is overriden.
    // @Override
    public String makeNoise(){
        return String.format("ROAR!");
    }

    // we don't always have to have getters and setters for everything, only when we actually need them (i.e. if you need to access these property values outside the Lion class)
    // when we get to Spring, we will kind of need one for everything

    public String eat(String meat){
        return String.format("Chewing on some %s", meat);
    }

    public String eat(Animal animal){
        return String.format("Whoopsie, ate poor little %s", animal.getName());
    }

    /*public int eat(int a){
        return a;
    }*/
}
