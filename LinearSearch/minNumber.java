    package LinearSearch;

    // TO FIND THE MINIMUM NUMBER IN A LIST
    public class minNumber {
        public static void main(String[] args) {
            int[] numbers = {10, 2, 30, 0, 10, 21};
            System.out.println("\nThe minimum number is: " + minNumber(numbers));
        }

            static int minNumber(int[] numbers) {
                if(numbers.length == 0) {
                    return -1;
                }
                int i = 0;
                int ans = numbers[i];
                for (int j : numbers) {
                    if (j < ans) {
                        ans = j;
                    }
            }
            return ans;
        }
    }
