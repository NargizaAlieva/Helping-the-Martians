import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this array identifies cargos' location at the beginning
        int[] cargosLocations = new int[3];
        cargosLocations[0] = 1;
        cargosLocations[1] = 3;
        cargosLocations[2] = 5;

        // this array gets values of cargos' expected location from user
        int[] inputtedLocations = new int[3];
        System.out.print("Please enter the first cargo's expected location: ");
        inputtedLocations[0] = scanner.nextInt();
        System.out.print("Please enter the second cargo's expected location: ");
        inputtedLocations[1] = scanner.nextInt();
        System.out.print("Please enter the third cargo's expected location: ");
        inputtedLocations[2] = scanner.nextInt();

        // while loop works until user inout correct locations
        while (!Arrays.equals(cargosLocations, inputtedLocations)) {
            System.out.println("Unfortunately, you indicated the locations wrong.\n" +
                    "Now cargo's legs carried the cargo to another place");
            changeCargosLocations(cargosLocations);

            System.out.print("Please enter the first cargo's expected location: ");
            inputtedLocations[0] = scanner.nextInt();
            System.out.print("Please enter the second cargo's expected location: ");
            inputtedLocations[1] = scanner.nextInt();
            System.out.print("Please enter the third cargo's expected location: ");
            inputtedLocations[2] = scanner.nextInt();
        }
    }
    // this method changes cargos' locations (cargosLocations array)
    public static int[] changeCargosLocations(int[] cargosLocations)
    {
        Random random = new Random();
        int max = 6;
        int min = 1;
        cargosLocations[0] = random.nextInt(max + 1 - min) + min;
        cargosLocations[1] = random.nextInt(max + 1 - min) + min;
        cargosLocations[2] = random.nextInt(max + 1 - min) + min;
        return cargosLocations;
    }
}
