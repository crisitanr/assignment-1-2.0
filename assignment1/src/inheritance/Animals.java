package inheritance;

public class Animals {
    String name;
    String breed;
    public Animal(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public Animals(String name, String breed) {
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }


}
