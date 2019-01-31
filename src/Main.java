/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car defaultCar = new Car();
        defaultCar.printAttributes();

        Car audi = new Car("Audi A4", "BG-1234");
        audi.printAttributes();
        audi.setWeight(1400);
        audi.setConsumption(10);
        audi.printAttributes();

        Car bmw = new Car("BMW", 200, 1300, "BMW-54567", 0, 0, 100, 15);
        bmw.fuelUp();
        bmw.printAttributes();

        bmw.travel(4);
        bmw.printAttributes();

        bmw.travel(6);
        bmw.printAttributes();

    }

}
