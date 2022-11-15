public class Rose extends  Plants{
    public Rose(String name, int timeLive, Color color) {
        super(name, timeLive, color);
    }

    @Override
    public void print() {
        System.out.println("Rose{" +
                "\nname='" + getName() +
                "\ntimeLive="  + getTimeLive()+
                "\ncolor=" + getColor() +
                '}');

    }
}
