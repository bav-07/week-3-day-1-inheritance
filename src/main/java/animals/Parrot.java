package animals;

public class Parrot extends Bird {

    public Parrot(String name, int numberOfEggs){
        super(name, numberOfEggs);
    }

    // because the makeNoise method has been declared as abstract in the parent class, every subclass must have an implementation of that method
    public String makeNoise(){
        return "Squawk!";
    }

}
