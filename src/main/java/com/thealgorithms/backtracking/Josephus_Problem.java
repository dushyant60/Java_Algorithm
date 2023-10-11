// Author - Dushyant Singh
// Github - https://github.com/dushyant60/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    // Function to return the safe position
    public static void josephus(List<Integer> numbers, int k, int startpos) {
        if (numbers.size() == 1) {
            // Base case
            System.out.println(numbers.get(0));
            return;
        }
        // To find the first number to be removed
        startpos = (startpos + k) % numbers.size();
        // Removing the number
        numbers.remove(startpos);
        // Recursive call with updated arguments
        josephus(numbers, k, startpos);
    }

    // Driver Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for n, k, and starting position:");

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int startpos = scanner.nextInt();

        k--; // Decrement k as in the C++ code
        scanner.close();

        // Declaring a list
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Calling the function that calculates the safe position
        josephus(numbers, k, startpos);
    }
}
