import java.util.ArrayList;

public class Airport {

        private String name;
        private String code;
        private ArrayList<Plane> hangar;
        private ArrayList<Flight> flights;

        public Airport(String name, String code) {
            this.name = name;
            this.code = code;
            this.hangar = new ArrayList<>();
            this.flights = new ArrayList<>();
        }


        public String getName(){
            return this.name;
        }

        public String getCode(){
            return this.code;
        }


    }


