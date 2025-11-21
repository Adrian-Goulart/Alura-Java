package Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toddy", 6);

        Animal animal = (Animal) cachorro;

        if ( animal instanceof Cachorro ){
            System.out.println(animal.nome);
        }
    }
}