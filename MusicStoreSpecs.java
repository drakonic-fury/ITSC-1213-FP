import java.util.*;
public interface MusicStoreSpecs
{
    public ArrayList<Item> inventory = new ArrayList<Item>();
    public ArrayList<String> cartNames = new ArrayList<String>();
    public ArrayList<String> cartBrands = new ArrayList<String>();
    public ArrayList<Double> cartPrics = new ArrayList<Double>();
    public ArrayList<Integer> cartQuantities = new ArrayList<Integer>();

    public void restockItem(int SKU, int num);
    public void addToCart(int SKU, int num);
}