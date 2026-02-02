public class Pigeon extends Bird {
    private static int numberOfPigeon;
    public Pigeon() {
        setWingSize(0.0);
        setWeight(0.0);
        setHeight(0.0);
        numberOfPigeon++;
    }
    public Pigeon(double wingSize, double weight, double height) {
        setWingSize(wingSize);
        setWeight(weight);
        setHeight(height);
        numberOfPigeon++;
    }
    public void eat(String food) {
        if (food.equals("worm")) {
            setWeight(getWeight() + 0.5);
        }
        else if (food.equals("seed")) {
            setWeight(getWeight() + 0.2);
        }
        else {
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public void fly() {
        if (getWeight() >= 5) {
            setWeight(getWeight() - 0.25);
            System.out.println("Fly Fly");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }
    public void landing() {
        if (getWeight() >= 5) {
            setWeight(getWeight() - 0.5);
            System.out.println("Landing");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }
    public void takeOff() {
        if (getWeight() >= 5) {
            setWeight(getWeight() - 0.5);
            System.out.println("Take Off");
        }
        else {
            System.out.println("I'm hungry.");
        }
    }
    @Override
    public String toString() {
        return "Pigeon " + getWeight() + " kg and " + getHeight() + " cm. There are " + numberOfPigeon + " pigeons.";
    }
}
