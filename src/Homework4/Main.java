package Homework4;

public class Main {

    public static void main(String[] args) {

        Greenhouse greenhouse = new Greenhouse();

        Blackrose blackrose = new Blackrose(1);
        blackrose.updateNationRegion("China");

        Raspberry raspberry = new Raspberry(2);
        raspberry.updateNationRegion("Canada");
        raspberry.harvest();

        Rose rose = new Rose(3);
        rose.updateType("Red rose");
        rose.flower();

        greenhouse.buyNewPlant(blackrose);
        greenhouse.buyNewPlant(raspberry);
        greenhouse.buyNewPlant(rose);

        greenhouse.waterPlants();

        greenhouse.changeTemperature(35);

        greenhouse.removeAPlant(1);

        greenhouse.retrievePlantsFromJP();
    }
}
