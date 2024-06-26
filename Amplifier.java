public abstract class Amplifier extends Item
{
    private int wattage;

    public Amplifier(String name, String brand, int SKU, double price, int stock, int wattage)
    {
        super(name, brand, SKU, price, stock);
        this.wattage = wattage;
    }

    public int getWattage()
    {
        return wattage;
    }
    public void setWattage(int wattage)
    {
        this.wattage = wattage;
    }
}
