package sr.unasat.service;


import sr.unasat.entities.Klanten;

import java.util.List;

public class KlantenService {

    private static List<Klanten> klantenList;
    private static Long klantenId;

   public List<Klanten> findAll(){
       return klantenList;
   }


}
