package animals;

public class Seagull extends Bird{

    public Seagull(String name, int numberOfEggs){
        super(name, numberOfEggs);
    }

    public String makeNoise(){
        return String.format("%s: Mine!Mine!Mine!", this.name);
        // need to set the property name to protected instead of private in the Animal class
        // otherwise, you could use the name getter (see the lecture again for more: 21/11/22)
    }

}
