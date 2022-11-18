public class Main {
    public static void main(String[] args) {

        Transport Car = createObject("Car");
        System.out.println(Car);
        Car.print();
        System.out.println();
        Transport Bike = createObject("Bike");
        System.out.println(Bike);
        Bike.print();
        System.out.println();
        Transport Truck = createObject("Truck");
        System.out.println(Truck);
        Truck.print();
        System.out.println();





    }private static Transport createObject(String className){
        switch (className){
            case "Car":
                return new Car("Toyota", "Corolla", 2019, Color.GRAY);
            case "Bike":
                return new Bike("FateBike", "Alton", 2020, Color.BLACK);
            default:
                return new Truck("Camaz", "43255", 2005, Color.PINK);
        }
    }


    }



