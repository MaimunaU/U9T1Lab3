public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee()
            + "\nPassengers: " + getPassengers() + "\nNumber of Axles: " + axles + "\nHas trailer? " + hasTrailer);
  }
}