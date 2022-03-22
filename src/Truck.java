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

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("\nNumber of Axles: " + axles + "\nHas trailer? " + hasTrailer);
  }

  @Override
  public double calculateTollPrice()
  {
    double toll = getTollFee() * axles;
    if (hasTrailer)
    {
      toll *= 2;
    }
    return toll;
  }
}