public class Difference {
        public static void main(String[] args) {
            // Define both arrays
            int[] array0 = {1, 2, 3, 4, 5};
            int[] arrayP = {1, 2, 3, 2, 5};
            
            // Find the difference between their sums
            int difference = findSumDifference(array0, arrayP);
            
            // Print the result
            System.out.println("The difference between the sums is: " + difference);
        }
    
        public static int findSumDifference(int[] array0, int[] arrayP) {
            // Calculate the sum of array0
            int sum0 = 0;
            for (int num : array0) {
                sum0 += num;
            }
            
            // Calculate the sum of arrayP
            int sumP = 0;
            for (int num : arrayP) {
                sumP += num;
            }
            
            // Return the difference between the sums
            return sum0 - sumP;
        }
    }
    