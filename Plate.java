package Lesson7.CatsPlates;

public class Plate {

    public int food;
    boolean full = false;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (food >= appetite){
            food -= appetite;
        }
    }
    public boolean info(int appetite) {
        if (food >= appetite) {
            full = true;
            System.out.print("plate: " + food + " ");
        }else {
            full = false;
            System.out.print("Мало еды   ");
        }
        return full;
    }
    public void addEat (int food, int appetite) {
        if (food < appetite) {
            this.food = 100;
            System.out.println("Добавили корм");
        }
    }
}
