public class Aloe extends Plants{
    public Aloe(String name, int timeLive, Color color) {
        super(name, timeLive, color);
    }

    @Override
    public void print() {
        System.out.println("Aloe{" +
                "\nname='" + getName() +
                "\ntimeLive="  + getTimeLive()+
                "\ncolor=" + getColor() +
                '}');
    }
}
