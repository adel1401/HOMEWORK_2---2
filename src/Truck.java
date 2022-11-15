public class Truck extends Transport{
    public Truck(String name, String model, int data, Color color) {
        super(name, model, data, color);
    }

    @Override
    public void print() {
        System.out.println("Truck{" +
                "\nname='" + getName() +
                "\nmodel= " + getModel() +
                "\ndata=" + getData()+
                "\ncolor=" + getColor()+
                '}');

    }
}
