public class Uniqnumber {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, 6, 4, 8,8,1 };

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true; // Moved inside the loop to reset for each element

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break; // No need to continue checking if a duplicate is found
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
