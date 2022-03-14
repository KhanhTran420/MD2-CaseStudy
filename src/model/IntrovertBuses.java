package model;

import java.time.LocalDate;

public class IntrovertBuses extends Buses {
    private String busStop;         // Chặng đường
    private double numberKm;        // Số km đi dc

    public IntrovertBuses(){

    }

    public IntrovertBuses(String busStop, double numberKm) {
        this.busStop = busStop;
        this.numberKm = numberKm;
    }

    public IntrovertBuses(String id, LocalDate time, String nameOfDriver, String numberOfCar, double cost, String busStop, double numberKm) {
        super(id, time, nameOfDriver, numberOfCar, cost);
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
        return "Chuyến xe nội thành: " +
                super.toString()+
                ", Số trạm dừng: " + busStop  +
                ", Số km đi được: " + numberKm
                ;
    }
}
