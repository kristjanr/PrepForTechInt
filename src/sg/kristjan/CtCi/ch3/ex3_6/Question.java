package sg.kristjan.CtCi.ch3.ex3_6;


public class Question {
    public static void main(String[] args) {
        Dog fluffy = new Dog("Fluffy");
        Dog rocky = new Dog("Rocky");
        Cat cherry = new Cat("Cherry");
        AnimalShelter as = new AnimalShelter();
        as.enqueue(fluffy);
        as.enqueue(rocky);
        as.enqueue(cherry);

        System.out.println(as.dequeueAny());
        System.out.println(as.dequeueCat());
        System.out.println(as.dequeueAny());

        as.enqueue(cherry);
        as.enqueue(rocky);
        System.out.println(as.dequeueCat());
        System.out.println(as.dequeueAny());

        // must throw exception:
        //System.out.println(as.dequeueAny());

    }
}
