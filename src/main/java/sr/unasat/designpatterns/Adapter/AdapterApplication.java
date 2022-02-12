package sr.unasat.designpatterns.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApplication {
    public static void main(String[] args) {

            List<Werknemer> werknemerList = getAllWerknemer();
            System.out.println(werknemerList);

        }
        private  static List<Werknemer> getAllWerknemer()
        {
            List<Werknemer> allWerknemers = new ArrayList<>();
            WerknemersDatabase werknemersDatabase = new WerknemersDatabase(1,"mark", "shivan",
                    "dkkdkd","wa",239232,"ft002"
            );
            allWerknemers.add(werknemersDatabase);

            LelydorpWerknemers lelydorpWerknemers = new LelydorpWerknemers(1,"sdas","asdas",
                    "sdsa","wanoca",93883,"343"
            );
            allWerknemers.add(new lelydorpAdapter(lelydorpWerknemers));

            MeerzorgWerknemers meerzorgWerknemers = new MeerzorgWerknemers(23,"sdas","asdas",
                    "sdfsdf","wanoca",93883,"343"
            );
            allWerknemers.add(new MeerzorgAdapter(meerzorgWerknemers));








            return allWerknemers;}

}
