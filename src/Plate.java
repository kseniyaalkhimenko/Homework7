public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("Food amount: " + food + ".");
    }

    public void decreaseFood(int appetite){
    food -= appetite;
    }

    public void increaseFood(){
        food += 50;
    }

}
