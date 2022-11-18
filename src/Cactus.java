public class Cactus extends Plants{
    public Cactus(String name, int timeLive, Color color) {
        super(name, timeLive, color);
    }

    @Override
    public void print() {
        System.out.println("Cactus{" +
                "\nname=" + getName() +
                "\ntimeLive="  + getTimeLive()+
                "\ncolor=" + getColor() +
                '}');
    }
}
