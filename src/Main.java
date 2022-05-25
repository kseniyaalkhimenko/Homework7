public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 100, false);
        cat[1] = new Cat("Tom", 15, false);
        cat[2] = new Cat("Garfild", 60, false);

        Plate plate = new Plate(100);

        System.out.println("You have three cats: " + cat[0].getName() + " with appetite " + cat[0].getAppetite() + ", " + cat[1].getName() + " with appetite " + cat[1].getAppetite() + ", " + cat[2].getName() + " with appetite " + cat[2].getAppetite() + ".");
        System.out.println("Food amount before feeding: " + plate.getFood() + ".");

        for (int i = 0; i < cat.length; i++) {
            if (cat[i].satiety == false && cat[i].getAppetite() < plate.getFood()){
                cat[i].eat(plate);
                cat[i].satiety = true;
                System.out.println("Cat " + cat[i].getName() + " is satiety!");
            } else {
                System.out.println("Not enough food for cat " + cat[i].getName() + "! (" + plate.getFood() + ")");
                System.out.println("Let's add some food (50) in the plate to make all our cats satiety!");
                plate.increaseFood();
                System.out.println("Food amount in the plate now is " + plate.getFood() + ".");
                cat[i].eat(plate);
                cat[i].satiety = true;
                System.out.println("Cat " + cat[i].getName() + " is satiety!");
            }
        }

        System.out.println("Food amount in the plate after feeding: " + plate.getFood() + ".");

    }

}
