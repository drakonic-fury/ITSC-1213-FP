public class Pedal extends Item
{
    private String effectType = new String();

    public Pedal(String name, String brand, int SKU, double price, int stock, String effectType)
    {
        super(name, brand, SKU, price, stock);
        this.effectType = effectType;
    }
}
