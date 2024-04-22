public class StringArrayExample {

  public static void main(String[] args) {
    // Declare and initialize the string array
    String[] fruits = {"one", "two", "three", "four", "five"};

    // Loop through the array and print each element
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }

    // Determine and print the length of the array
    int arrayLength = fruits.length;
    System.out.println("The length of the array is: " + arrayLength);
  }
}