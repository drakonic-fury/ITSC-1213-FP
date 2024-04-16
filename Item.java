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
        this.stock = stock;
    }

    public void restock(int num)
    {
        stock = stock + num;
    }

    public String toString()
    {
        return brand + " " + name + ": $" + price;
    }

    public String getName()
    {
        return name;
    }
    public String getBrand()
    {
        return brand;
    }
    public int getSKU()
    {
        return SKU;
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setSKU(int SKU)
    {
        this.SKU = SKU;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setStock(int stock)
    {
        this.stock = stock;
    }
}
