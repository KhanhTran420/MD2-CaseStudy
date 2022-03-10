package storage;

import model.Buses;

import java.io.IOException;
import java.util.ArrayList;

public interface IEbusesData {
    ArrayList<Buses> readFile();
    void writeFile(ArrayList<Buses> arrayList) throws IOException;
}
