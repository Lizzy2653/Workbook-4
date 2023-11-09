import java.util.ArrayList;
import java.util.List;

public class Dealership {

    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory = new ArrayList <> ();



            public Vehicle(String make, String model, int year, double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return year + " " + make + " " + model + " - $" + price;
        }
    }

    class Dealership {
        private String name;
        private String address;
        private List<Vehicle> vehicles;

        public Dealership(String name, String address) {
            this.name = name;
            this.address = address;
            this.vehicles = new ArrayList<>();
        }

        public void addVehicle(Vehicle vehicle) {
            vehicles.add(vehicle);
        }

        public void removeVehicle(Vehicle vehicle) {
            vehicles.remove(vehicle);
        }

        public List<Vehicle> searchVehiclesByMake(String make) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getMake().equalsIgnoreCase(make)) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }

        public List<Vehicle> searchVehiclesByModel(String model) {
            List<Vehicle> matchingVehicles = new ArrayList<>();
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equalsIgnoreCase(model)) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }

        public List<Vehicle> getAllVehicles() {
            return vehicles;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }
    }

    public class DealershipDemo {
        public static void main(String[] args) {
            Dealership dealership = new Dealership("ABC Motors", "123 Main St");

            Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2022, 25000.0);
            Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2021, 22000.0);
            Vehicle vehicle3 = new Vehicle("Ford", "F-150", 2022, 35000.0);

            dealership.addVehicle(vehicle1);
            dealership.addVehicle(vehicle2);
            dealership.addVehicle(vehicle3);

            System.out.println("Vehicles at " + dealership.getName() + ":");
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                System.out.println(vehicle);
            }

            System.out.println("Searching for Honda vehicles:");
            List<Vehicle> hondaVehicles = dealership.searchVehiclesByMake("Honda");
            for (Vehicle vehicle : hondaVehicles) {
                System.out.println(vehicle);
            }

            dealership.removeVehicle(vehicle1);
            System.out.println("After removing a vehicle:");
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                System.out.println(vehicle);
            }
        }
    }
