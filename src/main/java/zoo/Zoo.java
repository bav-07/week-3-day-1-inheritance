package zoo;

import animals.Animal;
import animals.Bird;
import animals.Lion;
import enclosures.Enclosure;

public class Zoo {

    private Enclosure reptileHouse;
    private Enclosure birdCage;
    private Enclosure mammalField;

    public Zoo(Enclosure reptileHouse, Enclosure birdCage, Enclosure mammalField) {
        this.reptileHouse = reptileHouse;
        this.birdCage = birdCage;
        this.mammalField = mammalField;
    }

    public int countBirdEggs(){
        int totalEggs = 0;
        for (Animal animal : this.birdCage.getAnimals()){
            Bird bird = (Bird) animal;
            totalEggs += bird.getNumberOfEggs();
        }
        return totalEggs;
    }


    public Enclosure getReptileHouse() {
        return reptileHouse;
    }

    public void setReptileHouse(Enclosure reptileHouse) {
        this.reptileHouse = reptileHouse;
    }

    public Enclosure getBirdCage() {
        return birdCage;
    }

    public void setBirdCage(Enclosure birdCage) {
        this.birdCage = birdCage;
    }

    public Enclosure getMammalField() {
        return mammalField;
    }

    public void setMammalField(Enclosure mammalField) {
        this.mammalField = mammalField;
    }

    public void addAnimalToEnclosure(Animal animal, Enclosure enclosure){
        enclosure.addAnimal(animal);
    }
}
