package Lesson7.CatsPlates;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[7];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Vasyan", 10);
        cats[2] = new Cat("Semen", 20);
        cats[3] = new Cat("Kolyan", 25);
        cats[4] = new Cat("Mashka", 10);
        cats[5] = new Cat("Dushka", 15);
        cats[6] = new Cat("Belka", 15);

        for (Cat cat : cats) {
            if (!plate.info(cat.appetite)) {
                System.out.println(cat.name + " не поел");
                plate.addEat(plate.food, cat.appetite);
                plate.info(plate.food);
            }
            System.out.println("  " + cat.name + " наелся");
            cat.eat(plate);
        }
    }
}
