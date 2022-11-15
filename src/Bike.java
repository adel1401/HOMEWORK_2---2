public class Bike extends  Transport{
    public Bike(String name, String model, int data, Color color) {
        super(name, model, data, color);
    }

    @Override
    public void print() {
        System.out.println("Bike{" +
                "\nname='" + getName() +
                "\nmodel= " + getModel() +
                "\ndata=" + getData()+
                "\ncolor=" + getColor()+
                '}');

    }
}
