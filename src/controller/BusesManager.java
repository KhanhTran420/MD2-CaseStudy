package controller;

import model.Buses;
import model.IntrovertBuses;
import storage.BusesFromFileBinary;
import storage.IEbusesData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusesManager {

    public static IEbusesData busesData = new BusesFromFileBinary();
    public static ArrayList<Buses> busesList = busesData.readFile();


    public static void addNewBuses(Buses buses) {
        busesList.add(buses);
        try {
            busesData.writeFile(busesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void removeBusesByIndex(int index) {
        busesList.remove(index);
        try {
            busesData.writeFile(busesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findBusesIndexById(String BusesId) {
        int index = -1;
        for (int i = 0; i < busesList.size(); i++) {
            Buses currentBuses = busesList.get(i);
            String currentBusesId = currentBuses.getId();
            if (currentBusesId.equals(BusesId)) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static int findBusesIndexByName(String searchName) {
        int index = -1;
        for (int i = 0; i < busesList.size(); i++) {
            Buses currentBuses = busesList.get(i);
            String currentBusesName = currentBuses.getNameOfDriver();
            if (currentBusesName.equals(searchName)) {
                index = i;
                return index;
            }
        }
        return index;
    }


    public static void editBusesByIndex(int index, Buses buses) {
        busesList.set(index, buses);
        try {
            busesData.writeFile(busesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void findBuses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên Tài xế bạn muốn tìm: ");
        String nameDriver = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < busesList.size(); i++) {
//             nameDriver = busesList.get(i).getNameOfDriver();
            if (busesList.get(i).getNameOfDriver().equals(nameDriver)) {
                System.out.println(busesList.get(i).toString());
                check = true;
                break;
            }
        }
            if (!check){
                System.out.println("Ò!!! không tìm thấy ông tài xế nào");
            }
        }




    public static void buyTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên người mua: ");
        String buyName = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int day = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập Tháng: ");
        int month = scanner1.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = scanner1.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Nhập chuyến xe muốn đi: ");
        String name = scanner4.nextLine();
    }
}