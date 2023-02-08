package sr.unasat.service;

import sr.unasat.designpatterns.builder.Table;
import sr.unasat.entities.Tafels;

import java.util.List;

public class TafelService {
    private static List<Tafels> tafelsList;

    public static List<Tafels> findAll() {
        return tafelsList;
    }
}
