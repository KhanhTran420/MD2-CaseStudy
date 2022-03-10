package view;

import controller.BusesManager;
import model.Buses;
import model.ExtrovertBuses;
import model.IntrovertBuses;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private static ArrayList<Buses> busesListClient = BusesManager.busesList;

    public static void main(String[] args) {
//        model.Buses[] buses = new model.Buses[3];
//        buses[0] = new model.IntrovertBuses("ND01", "Long", "29-MD2335", 5000000, 15000, "16", 1500);
//        buses[1] = new model.IntrovertBuses("ND02", "hoang", "29-MD2457", 4000000, 15000, "16", 1400);
//        buses[2] = new model.ExtrovertBuses("NT01", "hai", "18D-3468", 10000000, 50000, "Hanoi", 1);


        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách thông tin các xe");
            System.out.println("2. thêm thông tin xe");
            System.out.println("3. Sửa thông tin xe");
            System.out.println("4. xóa thông tin xe khỏi danh sách");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                showAllEmployee();
                    break;
                case 2:
                Buses newBuses = creatNewBuses();
                BusesManager.addNewBuses(newBuses);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chưa nhập lựa chọn!");
            }
        }
    }

    public static void showAllEmployee(){
        for (Buses e : busesListClient){
            System.out.println(e);
        }
    }


    public static Buses creatNewBuses() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        Buses newBuses = null;
        System.out.println("1. Thêm mới thông tin xe nội địa");
        System.out.println("2. Thêm mới thông tin xe ngoại địa");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        if (choice == 1) {
            newBuses = creatNewIntrovertBuses();
        }
        if (choice == 2) {
            newBuses = creatNewExtrovertBuses();
        }
        return newBuses;
    }



    public static Buses creatNewIntrovertBuses(){
        Scanner inputIDND = new Scanner(System.in);
        System.out.println("Nhập ID xe nội địa: ");
        String idND = inputIDND.nextLine();


        Scanner inputNameDriverND = new Scanner(System.in);
        System.out.println("Nhập tên người lái xe nội địa: ");
        String nameDriverND = inputNameDriverND.nextLine();

        Scanner inputNumberCarND = new Scanner(System.in);
        System.out.println("Nhập biển số xe chạy nội địa: ");
        String numberCarND = inputNumberCarND.nextLine();

        Scanner inputProfitOfMonthND = new Scanner(System.in);
        System.out.println("Nhập lợi nhuận 1 tháng: ");
        double  profitND = inputProfitOfMonthND.nextDouble();

        Scanner inputCostND = new Scanner(System.in);
        System.out.println("Nhập giá vé xe: ");
        double costND = inputCostND.nextDouble();

        Scanner inputBusStop = new Scanner(System.in);
        System.out.println("Nhập số điểm dừng xe: ");
        String busStop = inputBusStop.nextLine();

        Scanner inputNumberKm = new Scanner(System.in);
        System.out.println("Nhập số km đi dc: ");
        double numberKm = inputNumberKm.nextDouble();

        Buses newBuses = new IntrovertBuses(idND,nameDriverND,numberCarND,profitND,costND, busStop, numberKm);
        return newBuses;
    }

    public static Buses creatNewExtrovertBuses(){
        Scanner inputIDNT = new Scanner(System.in);
        System.out.println("Nhập ID xe ngoại thành: ");
        String idNT = inputIDNT.nextLine();


        Scanner inputNameDriverNT = new Scanner(System.in);
        System.out.println("Nhập tên người lái xe ngoại thành: ");
        String nameDriverNT = inputNameDriverNT.nextLine();

        Scanner inputNumberCarNT = new Scanner(System.in);
        System.out.println("Nhập biển số xe ngoại thành: ");
        String numberCarNT = inputNumberCarNT.nextLine();

        Scanner inputProfitOfMonthNT = new Scanner(System.in);
        System.out.println("Nhập lợi nhuận 1 tháng: ");
        double  profitNT = inputProfitOfMonthNT.nextDouble();

        Scanner inputCostNT = new Scanner(System.in);
        System.out.println("Nhập giá vé xe: ");
        double costNT = inputCostNT.nextDouble();

        Scanner inputLocal = new Scanner(System.in);
        System.out.println("Nhập biển số xe ngoại thành: ");
        String local = inputLocal.nextLine();

        Scanner inputKm = new Scanner(System.in);
        System.out.println("Nhập giá vé xe: ");
        double km = inputKm.nextDouble();

        Buses newBuses = new ExtrovertBuses(idNT,nameDriverNT,numberCarNT,profitNT,costNT,local,km);
        return newBuses;

    }
}
