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
            print("\t4. Exit Program");
    
            int choice = 0;
            int choice2 = 0;
            int choice3 = 0;
            boolean done = false;
            while(!done)
            {
                try
                {
                    choice = scanner.nextInt();
                    if((choice < 1)||(choice > 4))
                    {
                        throw new IllegalArgumentException();
                    }
                    done = true;
                }
                catch(IllegalArgumentException exp)
                {
                    print("Please enter one of the selections shown.");
                }
                catch(InputMismatchException exp)
                {
                    print("Please enter a number.");
                    scanner.nextLine();
                }
            }
            
            switch(choice){
                case 1:
                    print("These are the items currently in stock!");
                    
                    for(int i = 0; i < inv.size(); i++)
                    {
                        print((i+1) + ": " + inv.get(i));
                    }

                    print("Please enter the number of the product you would like to add to your cart!");

                    done = false;
                    while(!done)
                    {
                        try
                        {
                            choice2 = scanner.nextInt();
                            if((choice2 < 1)||(choice2 > 10))
                            {
                                throw new IllegalArgumentException();
                            }
                            done = true;
                        }
                        catch(IllegalArgumentException exp)
                        {
                            print("Please enter one of the selections shown.");
                        }
                        catch(InputMismatchException exp)
                        {
                            print("Please enter a number.");
                        }
                    }

                    print("Please enter the quantity you would like to add to your cart.");

                    done = false;
                    while(!done)
                    {
                        try
                        {
                            choice3 = scanner.nextInt();
                            if(choice3 < 1)
                            {
                                throw new IllegalArgumentException();
                            }
                            else if(choice3 > inv.get(choice2 - 1).getStock())
                            {
                                throw new Exception("Not enough stock!");
                            }
                            done = true;
                        }
                        catch(IllegalArgumentException exp)
                        {
                            print("Please enter a number greater than 0.");
                        }
                        catch(InputMismatchException ex)
                        {
                            print("Please enter a number.");
                        }
                        catch(Exception e)
                        {
                            print("Not enough in stock!");
                        }
                    }
                    store.addToCart(inv.get(choice2 - 1).getSKU(), choice3);
                    break;
                case 2:
                    ArrayList<String> cartNames = store.getCartNames();
                    ArrayList<String> cartBrands = store.getCartBrands();
                    ArrayList<Double> cartPrices = store.getCartPrices();
                    ArrayList<Integer> cartQuants = store.getCartQuantities();
                    double grandTotal = 0;
                    print("Cart:");
                    for(int i = 0; i < cartNames.size(); i++)
                    {
                        print("Item: " + cartBrands.get(i) + " " + cartNames.get(i) + " | Quantity: " + cartQuants.get(i) + " | Subtotal: $" + (cartPrices.get(i) * cartQuants.get(i)));
                    }
                    for(int i = 0; i < cartNames.size(); i++)
                    {
                        grandTotal = grandTotal + (cartPrices.get(i)*cartQuants.get(i));
                    }

                    print("\n Your grand total is: $" + (Math.round(grandTotal * 100.0) / 100.0));
                    break;
                case 3:
                    print("Which item would you like to restock?");
                        for(int i = 0; i < inv.size(); i++)
                        {
                            print((i + 1) + " " + inv.get(i));
                        }
                    
                    done = false;
                    while(!done)
                    {
                        try
                        {
                            choice2 = scanner.nextInt();
                            if((choice2 < 1)||(choice2 > (inv.size() + 1)))
                            {
                                throw new IllegalArgumentException();
                            }
                            done = true;
                        }
                        catch(IllegalArgumentException exp)
                        {
                            print("Please enter a number corresponding to one of the items listed.");
                        }
                        catch(InputMismatchException ex)
                        {
                            print("Please enter a number.");
                        }
                    }
                    choice2 = choice2 - 1;
                    int SKU = inv.get(choice2).getSKU();
                    int stock = inv.get(choice2).getStock();
                    String name = inv.get(choice2).getName();
                    //print("There are currently " + stock + " " + inv.get(choice2).getName() + " in stock.");
                    print("Current " + name + " stock: " + stock);
                    print("How many would you like to add?");
                    
                    int num = 0;
                    done = false;
                    while(!done)
                    {
                        try
                        {
                            num = scanner.nextInt();
                            if(num < 1)
                            {
                                throw new IllegalArgumentException();
                            }
                            done = true;
                        }
                        catch(IllegalArgumentException exp)
                        {
                            print("Please enter a number greater than 0.");
                        }
                        catch(InputMismatchException ex)
                        {
                            print("Please enter a number.");
                        }
                    }
                    store.restockItem(SKU, num);
                    print("Updated " + name + " stock: " + inv.get(choice2).getStock());
                    break;
                case 4:
                    break;
                default:
                    print("You must select from the shown options, please try again!");
            }

            print("Would you like to return to the main menu?");
            print("\t1. Yes");
            print("\t2. No");

            done = false;
            while(!done)
            {
                try
                {
                    choice = scanner.nextInt();
                    if((choice < 1)||(choice > 2))
                    {
                        throw new IllegalArgumentException();
                    }
                    done = true;
                }
                catch(IllegalArgumentException exp)
                {
                    print("Please enter one of the selections shown.");
                }
                catch(InputMismatchException exp)
                {
                    print("Please enter a number.");
                }
            }

            switch(choice)
            {
                case 1:
                    runStore = true;
                    break;
                case 2:
                    runStore = false;
                    break;
            }
        }
        scanner.close();
    }
    
    public static void print(Object o)
    {
        System.out.println(o);
    }
}