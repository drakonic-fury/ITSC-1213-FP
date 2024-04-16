public class AcousticGuitar extends Guitar
{
    private String stringType = new String();

    public AcousticGuitar(String name, String brand, int SKU, double price, int stock, int numStrings, int numFrets, String stringType)
    {
        super(name, brand, SKU, price, stock, numStrings, numFrets);
        this.stringType = stringType;
    }
}
