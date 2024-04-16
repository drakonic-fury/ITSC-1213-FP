import java.util.*;
public class MusicStore implements MusicStoreSpecs {
    public ArrayList<Item> inventory = new ArrayList<Item>();
    public ArrayList<String> cartNames = new ArrayList<String>();
    public ArrayList<String> cartBrands = new ArrayList<String>();
    public ArrayList<Double> cartPrices = new ArrayList<Double>();
    public ArrayList<Integer> cartQuantities = new ArrayList<Integer>();

    public MusicStore()
    {
        createInventory();
    }

    private void createInventory()
    {
        ElectricGuitar eg1 = new ElectricGuitar("Snakebyte", "ESP", 77123, 1499.99, 1, 6, 22, "HH");
        ElectricGuitar eg2 = new ElectricGuitar("Majesty", "Ernie Ball Music Man", 49832, 3249.99, 1, 7, 24, "HH");
        AcousticGuitar ag1 = new AcousticGuitar("DG1", "Martin", 12345, 999.99, 4, 6, 21, "Nylon");
        AcousticGuitar ag2 = new AcousticGuitar("TE-10", "Ibanez", 98765, 599.99, 3, 6, 24, "Steel");
        HeadAmp ha1 = new HeadAmp("Ironheart", "Laney", 33344, 1299.99, 2, 60, 16);
        HeadAmp ha2 = new HeadAmp("Rockerverb", "Orange", 11111, 2499.99, 1, 100, 16);
        ComboAmp ca1 = new ComboAmp("Mark V: 25", "Mesa/Boogie", 22222, 1899.99, 2, 25, 12, 1);
        ComboAmp ca2 = new ComboAmp("Origin 50", "Marshall", 44444, 799.99, 6, 50, 12, 1);
        Pedal p1 = new Pedal("HM-2", "Boss", 88888, 249.99, 10, "Distortion");
        Pedal p2 = new Pedal("Green Russian", "Electro Harmonix", 99999, 99.99,  7, "Fuzz");


        inventory.add(eg1);
        inventory.add(eg2);
        inventory.add(ag1);
        inventory.add(ag2);
        inventory.add(ha1);
        inventory.add(ha2);
        inventory.add(ca1);
        inventory.add(ca2);
        inventory.add(p1);
        inventory.add(p2);
    }

    public void restockItem(int SKU, int num)
    {
        for(int i = 0; i < inventory.size(); i++)
        {
            if(inventory.get(i).getSKU() == SKU)
            {
                inventory.get(i).restock(num);
            }
        }
    }

    public void addToCart(int SKU, int num)
    {
        for(int i = 0; i < inventory.size(); i++)
        {
            if(inventory.get(i).getSKU() == SKU)
            {
                cartNames.add(inventory.get(i).getName());
                cartBrands.add(inventory.get(i).getBrand());
                cartPrices.add(inventory.get(i).getPrice());
                cartQuantities.add(num);
            }
        }
    }

    public ArrayList<Item> getInventory()
    {
        return inventory;
    }
    public ArrayList<String> getCartNames()
    {
        return cartNames;
    }
    public ArrayList<String> getCartBrands()
    {
        return cartBrands;
    }
    public ArrayList<Double> getCartPrices()
    {
        return cartPrices;
    }
    public ArrayList<Integer> getCartQuantities()
    {
        return cartQuantities;
    }
}
