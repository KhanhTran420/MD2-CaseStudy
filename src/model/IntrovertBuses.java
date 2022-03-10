package model;

public class IntrovertBuses extends Buses {
    private String busStop;         // Số tuyến
    private double numberKm;        // Số km đi dc

    public IntrovertBuses(){

    }

    public IntrovertBuses(String busStop, double numberKm) {
        this.busStop = busStop;
        this.numberKm = numberKm;
    }

    public IntrovertBuses(String id, String nameOfDriver, String numberOfCar, double profit, double cost, String busStop, double numberKm) {
        super(id, nameOfDriver, numberOfCar, profit, cost);
        this.busStop = busStop;
        this.numberKm = numberKm;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }

    public double getNumberKm() {
        return numberKm;
    }

    public void setNumberKm(double numberKm) {
        this.numberKm = numberKm;
    }

    @Override
    public String toString() {
        return "model.IntrovertBuses{" +
                "busStop='" + busStop + '\'' +
                ", numberKm=" + numberKm +
                "} " + super.toString();
    }
}
