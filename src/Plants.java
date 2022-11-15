public abstract class Plants implements  Printable {
    private String name;
    private int timeLive;
    private Color color;

    public Plants(String name, int timeLive, Color color) {
        this.name = name;
        this.timeLive = timeLive;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeLive() {
        return timeLive;
    }

    public void setTimeLive(int timeLive) {
        this.timeLive = timeLive;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    }

