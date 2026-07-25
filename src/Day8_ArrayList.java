import java.util.ArrayList;
import java.util.Scanner;

public class Day8_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter how many names to add
        int count = 0;
        while(true) {
            System.out.println("How many names you add? (1-10): ");
            try{
                count = sc.nextInt();
                if( count <= 0 || count > 10) {
                    System.out.println("Please enter the valid number. ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter an integer. ");
                sc.next();
            }
        }
        // Step 2: Add names to ArrayList
        ArrayList<String> names = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < count; i++){
            System.out.println("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
        // Step 3: Print all names
        System.out.println("=== Name List ===");
        for (String name: names) {
            System.out.println(name);
        }
        // Step 4: Search for a name
        System.out.println("Enter a name to search: ");
        String target = sc.nextLine();
        if (names.contains(target)) {
            System.out.println(target + " is in the list.");
        } else {
            System.out.println(target + "is not in the list.");
        }

        // Step 5: Remove a name
        System.out.println("Enter a name to remove: ");
        String toRemove = sc.nextLine();
        if (names.contains(toRemove)) {
            names.remove(toRemove);
            System.out.println(toRemove + " has been removed.");
        } else {
            System.out.println(toRemove + " is not in the list.");
        }

        // Step 6: Print final list
        System.out.println("=== Final list ===");
        System.out.println("Total: " +names.size());
        for (String name: names) {
            System.out.println(name);
        }
    }
}