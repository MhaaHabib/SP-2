public class Main {
    public static void main(String[] args) {

        FleetOfCars foc = new FleetOfCars();

        Car car1 = new GasolineCar(" OI908374 ", " BMW ", " X1 ", 5, 58);
        Car car2 = new DieselCar (" KL3039484 "," Skoda ", " Karoq ", 5, 17, true);
        Car car3 = new ElektricCar(" DJ294858 ", " Tesla" , " model3 ", 5, 100, 614);

        foc.addFLeetOfCars(car1);
        foc.addFLeetOfCars (car2);
        foc.addFLeetOfCars (car3);

        System.out.println(foc);
        System.out.println("registrations fee for the fleet is: " + foc.getTotalRegistrationFeeForFleet());







    }
}



