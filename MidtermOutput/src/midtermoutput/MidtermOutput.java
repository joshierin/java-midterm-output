package midtermoutput;
import java.util.ArrayList;
import java.util.Scanner;
public class MidtermOutput{
    public static void main(String[] args){
        ArrayList<Person> nameData = new ArrayList<Person>();
        getMenu(nameData);
    }
    public static void getMenu(ArrayList<Person> nameData){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("+x+x+x+x+Options+x+x+x+x+");
        System.out.println("1. Add entry");
        System.out.println("2. Delete entry");
        System.out.println("3. View entries");
        System.out.println("4. Update entry");
        System.out.println("0. Exit");
        System.out.println("-------------------------");
        System.out.print("Select an option: ");
        int option = in.nextInt();
        System.out.println();
        
        switch(option){
            case 1:
                addEntry(nameData);
                break;
            case 2:
                deleteEntry(nameData);
                break;
            case 3:
                viewEntry(nameData);
                break;
            case 4:
                updateEntry(nameData);
                break;
            case 0:
                System.exit(0);
        }
    }
    public static void addEntry(ArrayList<Person> nameData){
        Scanner in = new Scanner(System.in);
        char add = 'Y';
        do{
            System.out.println("+x+x+x+x+Add Entry/ies+x+x+x+x+");
            System.out.println("-------------------------------");
            Person newPerson = new Person(null, null);
            System.out.print("Enter name: ");
            newPerson.setName(in.next());
            System.out.print("Enter age: ");
            newPerson.setAge(in.next());

            nameData.add(newPerson);
            
            System.out.println("-------------------------------");
            System.out.print("Add another entry? (Y/N): ");
                    String word = in.next();
                    word = word.toUpperCase();
                    add = word.charAt(0);
            System.out.println();
        } while(add == 'Y');
        
        getMenu(nameData);
    }
    public static void deleteEntry(ArrayList<Person> nameData){
        char delete = 'Y';
        Scanner in = new Scanner(System.in);
        System.out.println("+x+x+x+x+Delete Entry/ies+x+x+x+x+");
        System.out.println("----------------------------------");
        System.out.println("What would you like to delete?");
        System.out.println("1. Delete an entry");
        System.out.println("2. Delete all entries");
        System.out.println("----------------------------------");
        System.out.print("Select choice: ");
        int choice = in.nextInt();
        System.out.println();
        
        switch(choice){
            case 1:
                do{
                    System.out.println("~~~~~~~Your List of Entries~~~~~~~");
                    int i = 0;
                    for(Person p : nameData){
                        System.out.println(i+1 + ". " + p.getName() + " is " + p.getAge());
                        i++;
                    }
                    System.out.println("----------------------------------");
                    System.out.print("Enter number to delete: ");
                    int index = in.nextInt() - 1;

                    nameData.remove(index);
                    
                    System.out.println();
                    System.out.println("You have successfully delete an entry");
                    System.out.println();
                    System.out.println("----------------------------------");
                    System.out.print("Delete another entry? (Y/N): ");
                            String word = in.next();
                            word = word.toUpperCase();
                            delete = word.charAt(0);
                    System.out.println();
                }while(delete == 'Y');     
                break;
            case 2:
                nameData.clear();
                
                System.out.println("You have successfully cleared all entries!");
                break;
        }
        getMenu(nameData);
    }
    public static void viewEntry(ArrayList<Person> nameData){
        System.out.println("+x+x+x+x+View Entries+x+x+x+x+");
        System.out.println("------------------------------");
        int i = 0;
        for(Person p : nameData){
            System.out.println(i+1 + ". " + p.getName() + " is " + p.getAge());
            i++;
        }
        getMenu(nameData);
    }
    public static void updateEntry(ArrayList<Person> nameData){
        Scanner in = new Scanner(System.in);
        char update = 'Y';
        do{
            System.out.println("+x+x+x+x+Update Entry/ies+x+x+x+x+");
            System.out.println("~~~~~~~Your List of Entries~~~~~~~");
            
            int i = 0;
            for(Person p : nameData){
                System.out.println(i+1 + ". " + p.getName() + " is " + p.getAge());
                i++;
            }
            System.out.println("----------------------------------");
            System.out.print("Who do you want to change? (Enter the number): ");
            int index = in.nextInt() - 1;
            System.out.println("----------------------------------");
            System.out.print("Enter new name: ");
            nameData.get(index).setName(in.next());
            System.out.print("Enter new age: ");
            nameData.get(index).setAge(in.next());
            
            System.out.println("----------------------------------");
            System.out.print("Update another entry? (Y/N): ");
                        String word = in.next();
                        word = word.toUpperCase();
                        update = word.charAt(0);
            System.out.println();
        }while(update == 'Y');
        getMenu(nameData);
    }
}