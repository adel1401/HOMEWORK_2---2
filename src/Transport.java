public abstract class Transport implements  Printable {
    private  String name;
    private String model;
    private int data;
    private Color color;

    public Transport(String name, String model, int data, Color color) {
        this.name = name;
        this.model = model;
        this.data = data;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
