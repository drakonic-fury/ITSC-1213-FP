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

    public int getSpeakerSize()
    {
        return speakerSize;
    }
    public int getNumSpeakers()
    {
        return numSpeakers;
    }
    public void setSpeakerSize(int speakerSize)
    {
        this.speakerSize = speakerSize;
    }
    public void setNumSpeakers(int numSpeakers)
    {
        this.numSpeakers = numSpeakers;
    }
}
