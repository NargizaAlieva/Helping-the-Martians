import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cargosLocations = new int[3];
        cargosLocations[0] = 1;
        cargosLocations[1] = 3;
        cargosLocations[2] = 5;

        int[] inputtedLocations = new int[3];
        System.out.print("Please enter the first cargo's expected location: ");
        inputtedLocations[0] = scanner.nextInt();
        System.out.print("Please enter the second cargo's expected location: ");
        inputtedLocations[1] = scanner.nextInt();
        System.out.print("Please enter the third cargo's expected location: ");
        inputtedLocations[2] = scanner.nextInt();

        while (!Arrays.equals(cargosLocations, inputtedLocations)) {
            System.out.println("Unfortunately, you indicated the locations wrong.\n" +
                    "Now cargo's legs carried the cargo to another place");

            System.out.print("Please enter the first cargo's expected location: ");
            inputtedLocations[0] = scanner.nextInt();
            System.out.print("Please enter the second cargo's expected location: ");
            inputtedLocations[1] = scanner.nextInt();
            System.out.print("Please enter the third cargo's expected location: ");
            inputtedLocations[2] = scanner.nextInt();
        }
    }
}
