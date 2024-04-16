public class HeadAmp extends Amplifier
{
    private int outputImpedence;

    public HeadAmp(String name, String brand, int SKU, double price, int stock, int wattage, int outputImpedence)
    {
        super(name, brand, SKU, price, stock, wattage);
        this.outputImpedence = outputImpedence;
    }

    public int getOutputImpedence()
    {
        return outputImpedence;
    }
    public void setOutputImpedence(int outputImpedence)
    {
        this.outputImpedence = outputImpedence;
    }
}
