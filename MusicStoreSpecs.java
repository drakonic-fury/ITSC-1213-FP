import java.util.*;
public interface MusicStoreSpecs
{
    public ArrayList<Item> inventory = new ArrayList<Item>();
    public ArrayList<Item> shoppingCart = new ArrayList<Item>();

    public void restockItem(int SKU, int num);
    public void addToCart(int SKU, int num);
    public void checkOut();
}