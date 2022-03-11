package view;

import controller.BusesManager;
import model.Buses;
import model.ExtrovertBuses;
import model.IntrovertBuses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private static ArrayList<Buses> busesListClient = BusesManager.busesList;

    public static void main(String[] args) {


        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách thông tin các xe");
            System.out.println("2. thêm thông tin xe");
            System.out.println("3. Sửa thông tin xe");
            System.out.println("4. xóa thông tin xe khỏi danh sách");
            System.out.println("5. tìm thông tin chuyến xe");
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
                case 3:
                    editBuses();
                    break;
                case 4:
                    deleteBuses();
                    break;
                case 5:
                   BusesManager.findBook();
                   break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chưa nhập lựa chọn!");
            }
        }
    }

    public static void showAllEmployee() {
        for (Buses e : busesListClient) {
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


    public static Buses creatNewIntrovertBuses() {
        Scanner inputIDND = new Scanner(System.in);
        System.out.println("Nhập ID xe nội địa: ");
        String idND = inputIDND.nextLine();


        Scanner inputNameDriverND = new Scanner(System.in);
        System.out.println("Nhập tên người lái xe nội địa: ");
        String nameDriverND = inputNameDriverND.nextLine();

        Scanner inputNumberCarND = new Scanner(System.in);
        System.out.println("Nhập biển số xe chạy nội địa: ");
        String numberCarND = inputNumberCarND.nextLine();

        Scanner inputDayND = new Scanner(System.in);
        System.out.println("Nhập ngày chạy: ");
        int day = inputDayND.nextInt();

        Scanner inputMonthND = new Scanner(System.in);
        System.out.println("Nhập tháng chạy: ");
        int month = inputMonthND.nextInt();

        Scanner inputYearND = new Scanner(System.in);
        System.out.println("Nhập năm chạy: ");
        int year = inputYearND.nextInt();

        Scanner inputCostND = new Scanner(System.in);
        System.out.println("Nhập giá vé xe: ");
        double costND = inputCostND.nextDouble();

        Scanner inputBusStop = new Scanner(System.in);
        System.out.println("Nhập số điểm dừng xe: ");
        String busStop = inputBusStop.nextLine();

        Scanner inputNumberKm = new Scanner(System.in);
        System.out.println("Nhập số km đi dc: ");
        double numberKm = inputNumberKm.nextDouble();

        Buses newBuses = new IntrovertBuses(idND, LocalDate.of(year,month,day), nameDriverND, numberCarND, costND, busStop, numberKm);
        return newBuses;
    }

    public static Buses creatNewExtrovertBuses() {
        Scanner inputIDNT = new Scanner(System.in);
        System.out.println("Nhập ID xe ngoại thành: ");
        String idNT = inputIDNT.nextLine();


        Scanner inputNameDriverNT = new Scanner(System.in);
        System.out.println("Nhập tên người lái xe ngoại thành: ");
        String nameDriverNT = inputNameDriverNT.nextLine();

        Scanner inputNumberCarNT = new Scanner(System.in);
        System.out.println("Nhập biển số xe ngoại thành: ");
        String numberCarNT = inputNumberCarNT.nextLine();

        Scanner inputDayNT = new Scanner(System.in);
        System.out.println("Nhập ngày chạy: ");
        int day = inputDayNT.nextInt();

        Scanner inputMonthNT = new Scanner(System.in);
        System.out.println("Nhập tháng chạy: ");
        int month = inputMonthNT.nextInt();

        Scanner inputYearNT = new Scanner(System.in);
        System.out.println("Nhập năm chạy: ");
        int year = inputYearNT.nextInt();


        Scanner inputCostNT = new Scanner(System.in);
        System.out.println("Nhập giá vé xe: ");
        double costNT = inputCostNT.nextDouble();

        Scanner inputLocal = new Scanner(System.in);
        System.out.println("Nhập địa điểm đến xe ngoại thành: ");
        String local = inputLocal.nextLine();

        Scanner inputKm = new Scanner(System.in);
        System.out.println("Nhập số km đi được: ");
        double km = inputKm.nextDouble();

        Buses newBuses = new ExtrovertBuses(idNT, LocalDate.of(year,month,day), nameDriverNT, numberCarNT, costNT, local, km);
        return newBuses;

    }

    public static void deleteBuses() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("1. Xóa thông tin xe theo mã: ");
        System.out.println("2. Xóa thông tin theo tên tài xế: ");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        if (choice == 1) {
            deleteBusesByID();
        }
        if (choice == 2) {
            deleteBusesByName();
        }
    }

    public static void deleteBusesByID() {
        Scanner inputID = new Scanner(System.in);
        System.out.println(" Nhập ID thông tin xe muốn xóa: ");
        String ID = inputID.nextLine();

        int deleteIndex = BusesManager.findBusesIndexById(ID);
        BusesManager.removeBusesByIndex(deleteIndex);
    }

    public static void deleteBusesByName() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Nhập tên tài xế bạn muốn xóa");
        String name = inputName.nextLine();

        int deleteName = BusesManager.findBusesIndexByName(name);
        BusesManager.removeBusesByIndex(deleteName);
    }

    public static void editBuses() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("1. Sửa thông tin xe theo id: ");
        System.out.println("2. Sửa thông tin xe theo tên tài xế: ");
        choice = input.nextInt();
        if (choice == 1) {
            editBusesByID();
        }
        if (choice == 2) {
            editBusesByName();
        }

    }


    public static void editBusesByID() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID thông tin xe bạn muốn sửa: ");
        String editID = input.nextLine();

        Buses editBuses = creatNewBuses();
        int editIndex = BusesManager.findBusesIndexById(editID);
        BusesManager.editBusesByIndex(editIndex, editBuses);
    }

    public static void editBusesByName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thông tin tài xế xe bạn muốn sửa: ");
        String editName = input.nextLine();

        Buses editBuses = creatNewBuses();
        int editIndex = BusesManager.findBusesIndexByName(editName);
        BusesManager.editBusesByIndex(editIndex, editBuses);
    }


//public static int findBuses(Buses[] buses, String inputName){
//    int index = -1;
//    for (int i = 0; i < buses.length ; i++) {
//        String nameDriver = buses[i].getNameOfDriver();
//        if(nameDriver.equals(inputName)){
//            index = i;
//        }
//    }
//    if (index>=0){
//        System.out.println(inputName + " price: " + buses[index].getCost());
//    }
//    else {
//        System.out.println(inputName +" Not found");
//    }
//    return index;
//}
}
