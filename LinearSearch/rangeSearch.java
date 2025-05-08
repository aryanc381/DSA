package LinearSearch;


// TO CHECK WHETEHR THE CHARACTER EXISTS IN STRING WITH RANGE
public class rangeSearch {
    public static void main(String[] args) {
        String name = "Aryan";
        char target = 'A';
        int start = 2;
        int end = 3;
        System.out.println("\nThe character " + target + " is found: " + checker(name, start, end, target));
    }

    static boolean checker(String str, int start, int end, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = start; i <=end; i++) {
            int element = str.charAt(i);
            if(target == element) {
                return true;
            }
        }
        return false;
    }
}
