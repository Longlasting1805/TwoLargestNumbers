import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int largestCount = 1;

        while (largestCount <= 10){
            System.out.print("Enter number " + largestCount + ": ");
            int currentNumber = input.nextInt();

            if (currentNumber > largest){
                secondLargest = largest;
                largest = currentNumber;

            } else if (currentNumber > secondLargest) {
                secondLargest = currentNumber;
            }
            largestCount += 1;

        }
        System.out.println("The largest is: "+ secondLargest);
        System.out.printf("the second largest is: %d", largest);
    }
}
