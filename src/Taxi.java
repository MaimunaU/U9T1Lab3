public class Taxi extends Car {

    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Total Fare: " + fareCollected);
    }

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        int riders = getPassengers() - 1;
        fareCollected = riders * farePerRider;
        return dropOffPassengers(riders);
    }
}
