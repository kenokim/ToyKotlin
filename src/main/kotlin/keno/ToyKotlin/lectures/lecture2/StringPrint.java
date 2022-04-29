package keno.ToyKotlin.lectures.lecture2;

public class StringPrint {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "candy"};
        int choice = 1;
        String yourChoice;
        if (choice < 0) {
            yourChoice = arr[0];
        } else {
            yourChoice = arr[2];
        }
        System.out.println("This is your choice: " + yourChoice);
    }
}
