public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(){}

    public Boots( int id, String productName, int price, int weight, String color, int productCount, int size, boolean isNaturalSkin){
       super(id, productName, price, weight,color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
