package model;

import java.time.LocalDate;

public class ExtrovertBuses extends Buses {
    private String local;              // Nơi đến
    private double dayTravel;          // Số ngày đi

    public ExtrovertBuses(){

    }

    public ExtrovertBuses(String local, double dayTravel) {
        this.local = local;
        this.dayTravel = dayTravel;
    }

    public ExtrovertBuses(String id, LocalDate time, String nameOfDriver, String numberOfCar, double cost, String local, double dayTravel) {
        super(id, time, nameOfDriver, numberOfCar, cost);
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
        return "Chuyến xe ngoại thành: " +
                super.toString()+
                ", Địa điểm: " + local +
                ", thời gian chuyến đi: " + dayTravel
                  ;
    }
}
