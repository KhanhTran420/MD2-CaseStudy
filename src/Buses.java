public abstract class Buses {
    private String Id, Code, NameOfDriver, NumberOfCar;
    private double Profit, cost;

    public Buses() {
    }

    public Buses(String id, String code, String nameOfDriver, String numberOfCar, double profit, double cost) {
        this.Id = id;                         // STT
        this.Code = code;                     // Mã số chuyến
        this.NameOfDriver = nameOfDriver;     // Tên tài xế
        this.NumberOfCar = numberOfCar;       // Biển số xe
        this.Profit = profit;                 // Doanh thu
        this.cost = cost;                     // Giá vé
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getNameOfDriver() {
        return NameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.NameOfDriver = nameOfDriver;
    }

    public String getNumberOfCar() {
        return NumberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.NumberOfCar = numberOfCar;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double profit) {
        this.Profit = profit;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Buses{" +
                "Id='" + Id + '\'' +
                ", Code='" + Code + '\'' +
                ", NameOfDriver='" + NameOfDriver + '\'' +
                ", NumberOfCar='" + NumberOfCar + '\'' +
                ", Profit=" + Profit +
                ", cost=" + cost +
                '}';
    }
}
