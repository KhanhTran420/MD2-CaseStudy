package model;

import java.time.LocalDate;

public class ExtrovertBuses extends Buses {
    private String local;              // Nơi đến
    private double dayTravel;          // Số ngày đi
    private int quantity;              // số lượng người

    public ExtrovertBuses(){
    }

    public ExtrovertBuses(String local, double dayTravel, int quantity) {
        this.local = local;
        this.dayTravel = dayTravel;
        this.quantity = quantity;
    }

    public ExtrovertBuses(String id, LocalDate time, String nameOfDriver, String numberOfCar, double cost, String local, double dayTravel, int quantity) {
        super(id, time, nameOfDriver, numberOfCar, cost);
        this.local = local;
        this.dayTravel = dayTravel;
        this.quantity = quantity;

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

    public double getProfit(){
        double result = getCost()*quantity;
        return  result;
    }

    @Override
    public String toString() {
        return "Chuyến xe ngoại thành: " +
                super.toString()+
                ", Địa điểm: " + local +
                ", thời gian chuyến đi: " + dayTravel +
                ", Số lượng hành khách: " + quantity
                  ;
    }
}
