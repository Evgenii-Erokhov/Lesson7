package Lesson7.CatsPlates;

public class Cat {
    public String name;
    public int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

