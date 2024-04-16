import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        MusicStore store = new MusicStore();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> inv = store.getInventory();
        
        boolean runStore = true;
        while(runStore == true) {
        
            print("Welcome to the Volkov Music Store!\n");
            print("Please select from the following options!");
            
            print("\t1. Browse Products");
            print("\t2. View Cart");
            print("\t3. Restock Items");
            print("\t4. Checkout");
            print("\t5. Exit Program");
    
            int choice = 0;
        
             choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    print("Which item would you like to restock?");
                        for(int i = 0; i < inv.size(); i++)
                        {
                            print((i) + " " + inv.get(i));
                        }
                    int second = scanner.nextInt();
                    int SKU = inv.get(second).getSKU();
                    int stock = inv.get(second).getStock();
                    print("There are currently " + stock + " in stock.");
                    print("How many would you like to add to the stock?");
                    int num = scanner.nextInt();
                    store.restockItem(SKU, num);
                    print("There are now " + inv.get(second).getStock() + " " + inv.get(second).getName() + " in stock.");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    print("You must select from the shown options, please try again!");
            }
            runStore = false;
        }
        scanner.close();
    }
    
    public static void print(Object o)
    {
        System.out.println(o);
    }
}