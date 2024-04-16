public class Item
{
    private String name = new String();
    private String brand = new String();
    private int SKU;
    private double price;
    private int stock;

    public Item(String name, String brand, int SKU, double price, int stock)
    {
        this.name = name;
        this.brand = brand;
        this.SKU = SKU;
        this.price = price;
    }

}
