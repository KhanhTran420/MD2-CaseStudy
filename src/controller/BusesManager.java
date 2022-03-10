package controller;

import model.Buses;
import storage.BusesFromFileBinary;
import storage.IEbusesData;

import java.io.IOException;
import java.util.ArrayList;

public class BusesManager {

    public static IEbusesData busesData = new BusesFromFileBinary();
    public static ArrayList<Buses> busesList = busesData.readFile();

//   public static void  displayBuses(model.Buses[] buses){
//       for (model.Buses e: buses){
//           System.out.println(e);
//       }
//   }
//
//   public static model.Buses[] addNewBuses(model.Buses[] buses, model.Buses newBuses){
//       model.Buses[] newBusesList = new model.Buses[buses.length+1];
//       for (int i = 0; i < buses.length ; i++) {
//           newBusesList[i] = buses[i];
//       }
//       newBusesList[buses.length] = newBuses;
//       return newBusesList;
//   }

    public static void addNewBuses(Buses buses) {
        busesList.add(buses);
        try {
            busesData.writeFile(busesList);

        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static void removeBusesByIndex (int index) {
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

}
