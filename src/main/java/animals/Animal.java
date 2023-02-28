package animals;

public abstract class Animal { // we use the abstract keyword to make sure that animals cannot be instantiated as a class itself, but it can still be inherited from
    // in this case, as we can no longer make animal objects, we cannot test for them, so we delete the AnimalTest

    protected String name;
    private boolean healthy;

    public Animal(String name) {
        this.name = name;
        this.healthy = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public abstract String makeNoise();
    // we have made this method abstract, so the body has to be removed
        //return String.format("Hello, my name is %s.", this.name);
        // this.name replaces %s in the string using String.format()
        // you can add multiple different strings using multiple %s in the string, and separating out the additional strings using a comma
        // for example, String.format("%s is a %s.", "Simba", "lion") will give "Simba is a lion."

    public String makeNoise(String noise){
        return String.format("Hello, my name is %s, and I go: %s", this.name, noise);
    }

    public String eat(){
        return "Mmm, that was tasty!";
    }
}
