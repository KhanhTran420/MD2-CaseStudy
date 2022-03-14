package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Buses implements Serializable {
    private String id, nameOfDriver, numberOfCar;
    private double cost;
    public LocalDate time;


    public Buses() {
    }

    public Buses(String id,LocalDate time, String nameOfDriver, String numberOfCar, double cost) {
        this.id = id;                         // STT
        this.time = time;                     // ngày xuất vé
        this.nameOfDriver = nameOfDriver;     // Tên tài xế
        this.numberOfCar = numberOfCar;       // Biển số xe

        this.cost = cost;                     // Giá vé
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(int year, int month, int day) {
        this.time = LocalDate.of(year,month,day);
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

//    public abstract double getProfit();

    @Override
    public String toString() {
        return "Chuyến xe: " +
                ",Id= " + id  +
                ", Tên của tài xế: " + nameOfDriver  +
                ", Biển số xe: " + numberOfCar  +
                ", Giá xe: " + cost +
                ", Ngày đi: " + time
                ;
    }
}
