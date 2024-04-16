public class ComboAmp extends Amplifier
{
    private int speakerSize;
    private int numSpeakers;

    public ComboAmp(String name, String brand, int SKU, double price, int stock, int wattage, int speakerSize, int numSpeakers)
    {
        super(name, brand, SKU, price, stock, wattage);
        this.speakerSize = speakerSize;
        this.numSpeakers = numSpeakers;
    }
}
