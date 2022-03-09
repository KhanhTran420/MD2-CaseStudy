public class ExtrovertBuses extends Buses{
    private String Local;              // Nơi đến
    private double DayTravel;          // Số ngày đi

    public ExtrovertBuses(){

    }

    public ExtrovertBuses(String local, double dayTravel) {
        this.Local = local;
        this.DayTravel = dayTravel;
    }

    public ExtrovertBuses(String id, String code, String nameOfDriver, String numberOfCar, double profit, double cost, String local, double dayTravel) {
        super(id, code, nameOfDriver, numberOfCar, profit, cost);
        this.Local = local;
        this.DayTravel = dayTravel;
    }

    @Override
    public String toString() {
        return "ExtrovertBuses{" +
                "Local='" + Local + '\'' +
                ", DayTravel=" + DayTravel +
                "} " + super.toString();
    }
}
