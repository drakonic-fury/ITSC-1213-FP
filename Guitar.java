public abstract class Guitar extends Item
{
    private int numStrings;
    private int numFrets;

    public Guitar(String name, String brand, int SKU, double price, int stock, int numStrings, int numFrets)
    {
        super(name, brand, SKU, price, stock);
        this.numStrings = numStrings;
        this.numFrets = numFrets;
    }

    public int getNumStrings()
    {
        return numStrings;
    }
    public int getNumFrets()
    {
        return numFrets;
    }
    public void setNumStrings(int numStrings)
    {
        this.numStrings = numStrings;
    }
    public void setNumFrets(int numFrets)
    {
        this.numFrets = numFrets;
    }
}
