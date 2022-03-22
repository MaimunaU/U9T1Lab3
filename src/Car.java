public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut)
  {
    if (numOut < getPassengers())
    {
      setPassengers(getPassengers() - numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount()
  {
    if (electric == true && discountApplied == false)
    {
      setTollFee(getTollFee() * 0.5);
      discountApplied = true;
    }
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("\nElectric? " + electric + "\nDiscount applied? " + discountApplied);
  }

  @Override
  public double calculateTollPrice()
  {
    if (getPassengers() > 4)
    {
      return getTollFee() * 4;
    }
    else
    {
      return super.calculateTollPrice();
    }
  }
}