/*

 */

import java.util.*;
public class Main {

       static int[] findTwoElement(int arr[], int n) {
            // code here
            int[] res = new int[2];

            // Create a temporary array to store the frequency of each element.
            int[] freq = new int[n + 1];

            // Traverse the input array and update the frequency of each element.
            for (int i = 0; i < n; i++) {
                freq[arr[i]]++;
            }

            // Find the repeating number.
            for (int i = 1; i <= n; i++) {
                if (freq[i] > 1) {
                    res[0] = i;
                    break;
                }
            }

            // Find the missing number.
            for (int i = 1; i <= n; i++) {
                if (freq[i] == 0) {
                    res[1] = i;
                    break;
                }
            }

            return res;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        findTwoElement(array , length);
    }
}