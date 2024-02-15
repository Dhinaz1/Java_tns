public class LargestNumber {
    public static void main(String[] args) {
        String input = "250-55-190-346-212";
        String[] numbers = input.split("-");
        int max = Integer.MIN_VALUE;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The largest number is: " + max);
    }
}
