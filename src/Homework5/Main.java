package Homework5;

public class Main {

    public static void main(String[] args) {

        Greenhouse greenhouse = new Greenhouse() {
            @Override
            void changeTemperature(int temperature) {
                System.out.println("Temperature system is broken! Can not change temperature at the moment.");
            }
        };

        Blackrose blackrose = new Blackrose(1);
        blackrose.updateNationRegion("China");
        blackrose.changeWaterLevel(0.25);

        Raspberry raspberry = new Raspberry(2);
        raspberry.updateNationRegion("Canada");
        raspberry.harvest();
        raspberry.changeWaterLevel(0.5);

        Rose rose = new Rose(3);
        Rose.Thorns.addThorn();
        rose.updateType("Red rose");
        rose.flower();
        rose.changeWaterLevel(0.7);

        greenhouse.buyNewPlant(blackrose);
        greenhouse.buyNewPlant(raspberry);
        greenhouse.buyNewPlant(rose);

        greenhouse.waterPlants();

        greenhouse.changeTemperature(35);

        greenhouse.removeAPlant(1);

        greenhouse.retrievePlantsFromJP();

    }

}
