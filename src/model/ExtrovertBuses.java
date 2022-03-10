package model;

public class ExtrovertBuses extends Buses {
    private String local;              // Nơi đến
    private double dayTravel;          // Số ngày đi

    public ExtrovertBuses(){

    }

    public ExtrovertBuses(String local, double dayTravel) {
        this.local = local;
        this.dayTravel = dayTravel;
    }

    public ExtrovertBuses(String id, String nameOfDriver, String numberOfCar, double profit, double cost, String local, double dayTravel) {
        super(id, nameOfDriver, numberOfCar, profit, cost);
        this.local = local;
        this.dayTravel = dayTravel;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getDayTravel() {
        return dayTravel;
    }

    public void setDayTravel(double dayTravel) {
        this.dayTravel = dayTravel;
    }

    @Override
    public String toString() {
        return "model.ExtrovertBuses{" +
                "Local='" + local + '\'' +
                ", DayTravel=" + dayTravel +
                "} " + super.toString();
    }
}
