public class BlockImp implements Block{
    String color;
    String material;
    BlockImp(String color, String material) {
        this.color = color;
        this.material = material;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
