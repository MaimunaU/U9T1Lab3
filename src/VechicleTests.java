public class VechicleTests
{
  public static void main(String[] args)
  {
    // -------------- LAB PART 1 -----------------
    /*
    Vehicle vehicle1 = new Vehicle("MC56WQ", 10.75, 5);
    System.out.println(vehicle1.calculateTollPrice());

    Car car1 = new Car("KXN73F", 8.50, 2, true);
    System.out.println(car1.calculateTollPrice());

    car1.printCar();

    Truck truck1 = new Truck("3K9JMX", 24.75, 4, 6, true);
    System.out.println(truck1.calculateTollPrice());

    truck1.printTruck();
    */

    // ------------ LAB PART 2 ---------------
    /*
    Taxi taxi1 = new Taxi("8KM23Z", 9.25, 3, true, 5.00);

    taxi1.printTaxi();

    System.out.println(taxi1.getLicensePlate());
    System.out.println(taxi1.getPassengers());
    System.out.println(taxi1.getTollFee());
    System.out.println(taxi1.isElectric());
    System.out.println(taxi1.isDiscountApplied());
    System.out.println(taxi1.calculateTollPrice());
    taxi1.printCar();

    System.out.println(taxi1 instanceof Taxi);
    System.out.println(taxi1 instanceof Car);
    System.out.println(taxi1 instanceof Vehicle);
    */


    // ------------ LAB PART 3 ---------------
    /*
    System.out.println("--- Testing method on a Car object ---");
    Car testCar1 = new Car("KXN73F", 8.50, 5, true);
    System.out.println(testCar1.getPassengers());
    System.out.println("-----------");
    boolean success = testCar1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testCar1.getPassengers());
    System.out.println("-----------");
    success = testCar1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testCar1.getPassengers());
    System.out.println("--- Testing method on a Taxi object ---");
    Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");
    success = testTaxi1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");
    success = testTaxi1.dropOffPassengers(2);
    System.out.println(success);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");
    */
    System.out.println("--- Testing method on a Car object ---");
    Car testCar1 = new Car("KXN73F", 8.50, 5, true);
    testCar1.applyDiscount();
    System.out.println(testCar1.isDiscountApplied());
    System.out.println(testCar1.getTollFee());
    System.out.println("-----------");
    testCar1.applyDiscount(); // try applying again
    System.out.println(testCar1.isDiscountApplied());
    System.out.println(testCar1.getTollFee());
    System.out.println("--- Testing method on Taxi objects ---");
    Taxi testTaxi1 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
    testTaxi1.applyDiscount();
    System.out.println(testTaxi1.isDiscountApplied());
    System.out.println(testTaxi1.getTollFee());
    System.out.println("-----------");
    Taxi testTaxi2 = new Taxi("ABC645", 12.0, 3, true, 5.0);
    testTaxi2.applyDiscount();
    System.out.println(testTaxi2.isDiscountApplied());
    System.out.println(testTaxi2.getTollFee());
    System.out.println("-----------");
  }
}