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
        
            System.out.println("Welcome to the automated BookStore System!");
        
            System.out.println("What would you like to do?");
            System.out.println("Select from one of the following options:");
            System.out.println("\t1. Restock Product");
    
            int choice = 0;
        
             choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    print("Which product do you want to restock?");
                    for(int i = 0; i < inv.size(); i++)
                    {
                        print((i) + " " + inv.get(i));
                    }
                    int choice2 = scanner.nextInt();
                    int prodID = inv.get(choice2).getSKU();
                    int stock = inv.get(choice2).getStock();
                    print("There are currently " + stock + " in stock.");
                    print("How many copies are you adding to stock?");
                    int num = scanner.nextInt();
                    store.restockItem(prodID, num);
                    print("Congrats, there are now " + inv.get(choice2).getStock() + " copies of " + inv.get(choice2).getName());
                    break;
                default:
                    print("Invalid input, try again.");
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