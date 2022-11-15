public class Car extends Transport{
    public Car(String name, String model, int data, Color color) {
        super(name, model, data, color);
    }


    @Override
    public void print() {
        System.out.println("Car{" +
                "\nname='" + getName() +
                "\nmodel= " + getModel() +
                "\ndata=" + getData()+
                "\ncolor=" + getColor()+
                '}');

    }
}
