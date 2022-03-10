package model;

import java.io.Serializable;

public abstract class Buses implements Serializable {
    private String id, nameOfDriver, numberOfCar;
    private double profit, cost;

    public Buses() {
    }

    public Buses(String id, String nameOfDriver, String numberOfCar, double profit, double cost) {
        this.id = id;                         // STT

        this.nameOfDriver = nameOfDriver;     // Tên tài xế
        this.numberOfCar = numberOfCar;       // Biển số xe
        this.profit = profit;                 // Doanh thu
        this.cost = cost;                     // Giá vé
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "model.Buses{" +
                "Id='" + id + '\'' +

                ", NameOfDriver='" + nameOfDriver + '\'' +
                ", NumberOfCar='" + numberOfCar + '\'' +
                ", Profit=" + profit +
                ", cost=" + cost +
                '}';
    }
}
