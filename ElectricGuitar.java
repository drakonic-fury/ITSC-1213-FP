public class ElectricGuitar extends Guitar
{
    private String pickupConfig = new String();

    public ElectricGuitar(String name, String brand, int SKU, double price, int stock, int numStrings, int numFrets, String pickupConfig)
    {
        super(name, brand, SKU, price, stock, numStrings, numFrets);
        this.pickupConfig = pickupConfig;
    }
}
