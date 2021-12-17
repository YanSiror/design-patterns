package prototypeMode.manual;

public class Cloth {
    private String type;
    private String size;

    public Cloth clone(){
        Cloth cloth = new Cloth();
        cloth.type = this.type;
        cloth.size = this.size;
        return cloth;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
