package sg.kristjan.ctci.ch03.ex3_6;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.NoSuchElementException;

class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        animal.setArrived();
        if (animal.getClass() == Dog.class) {
            dogs.add((Dog) animal);
        } else if (animal.getClass() == Cat.class) {
            cats.add((Cat) animal);
        } else {
            throw new NotImplementedException();
        }
    }

    public Animal dequeueAny() {
        if (dogs.size() != 0 && cats.size() != 0) {
            if (dogs.peek().getArrivalTime().compareTo(cats.peek().getArrivalTime()) < 0) {
                return dogs.removeFirst();
            } else {
                return cats.removeFirst();
            }
        } else if (dogs.size() != 0) {
            return dogs.removeFirst();
        } else if (cats.size() != 0) {
            return cats.removeFirst();
        } else {
            throw new NoSuchElementException();

        }
    }

    public Dog dequeueDog() {
        return (Dog) dequeueAnimal(dogs);
    }

    public Cat dequeueCat() {
        return (Cat) dequeueAnimal(cats);
    }

    private Animal dequeueAnimal(LinkedList animals) {
        if (animals.size() == 0) {
            throw new NoSuchElementException();
        }
        return (Animal) animals.removeFirst();
    }
}

