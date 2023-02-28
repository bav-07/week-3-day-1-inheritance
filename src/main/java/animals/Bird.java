package animals;

// a concrete class is a class which we can instantiate
// bird in this case is abstract because we don't want to instantiate it
public abstract class Bird extends Animal{

    private int numberOfEggs;

    public Bird(String name, int numberOfEggs){
        super(name);
        this.numberOfEggs = numberOfEggs;
    }

    // we want to get the number of eggs
    public int getNumberOfEggs(){
        return this.numberOfEggs;
        // the this. keyword clearly states where this property comes from (i.e. it is a property of the object you are in currently)
        // it is not mandatory, but a useful thing to have
    }

}
