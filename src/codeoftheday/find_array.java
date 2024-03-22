package codeoftheday;
public class find_array {

    // Brute Force Method
    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate Element: " + inputArray[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 2, 7, 4};
        findDuplicatesUsingBruteForce(arrayOne);
    }
}