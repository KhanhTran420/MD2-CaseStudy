public class IntrovertBuses extends Buses{
    private String BusStop;         // Số tuyến
    private double numberKm;        // Số km đi dc

    public IntrovertBuses(){

    }

    public IntrovertBuses(String busStop, double numberKm) {
        this.BusStop = busStop;
        this.numberKm = numberKm;
    }

    public IntrovertBuses(String id, String code, String nameOfDriver, String numberOfCar, double profit, double cost, String busStop, double numberKm) {
        super(id, code, nameOfDriver, numberOfCar, profit, cost);
        this.BusStop = busStop;
        this.numberKm = numberKm;
    }

    public String getBusStop() {
        return BusStop;
    }

    public void setBusStop(String busStop) {
        this.BusStop = busStop;
    }

    public double getNumberKm() {
        return numberKm;
    }

    public void setNumberKm(double numberKm) {
        this.numberKm = numberKm;
    }

    @Override
    public String toString() {
        return "IntrovertBuses{" +
                "BusStop='" + BusStop + '\'' +
                ", numberKm=" + numberKm +
                "} " + super.toString();
    }
}
