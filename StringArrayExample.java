public class StringArrayExample {

  public static void main(String[] args) {
    // Declare and initialize the string array
    String[] numbersArray = {"one", "two", "three", "four", "five"};

    // Loop through the array and print each element
    for (int i = 0; i < numbersArray.length; i++) {
      System.out.println(numbersArray[i]);
    }

    // Determine and print the length of the array
    int arrayLength = numbersArray.length;
    System.out.println("The length of the array is: " + arrayLength);
  }
}