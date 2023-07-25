package Homework5;

public class Blackrose extends HousePlant implements Trimmable {

    public Blackrose(int id) {
        super(id, "Rose", "TR");
    }

    @Override
    public void trim() {
        System.out.println("Blackrose is trimmed.");
    }
}
