package lesson6;

public class HomeWork {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();

        for (Animal participant : participants) {
            participant.run(300);
            participant.swim(20);
        }
        System.out.println("Количество созданных животных " + Animal.getCount());
    }
    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(400, 30),
                new Dog(100, 3),
                new Cat(400, 2),
                new Cat(200, 10)

        };
    }
}
