// class Rotate contains code to rotate an integer array n values to the left
import java.util.InputMismatchException;
import java.util.Scanner; // Import the scanner class to obtain user input

public class Rotate {

    // Rotate an array n positions to the left
    // Time Complexity: O(N * ARRAY_SIZE)
    // Space Complexity: O(1)
    public void rotateLeft(int arr[], int n, int array_size) {

        for (int i = 0; i < n; i++){
            rotateLeftByOne(arr, array_size);
        }
        
        printArray(arr, array_size);
    }

    // Rotate an array one position to the left
    public void rotateLeftByOne(int arr[], int array_size) {
        // Initalize i to store final position
        int i;
        int tempVal = arr[0];

        for (i = 0; i < array_size - 1; i++){
            arr[i] = arr[i + 1];
        }

        // Set the final equal to the previous first value
        arr[i] = tempVal;
    }

    // Print the rotated array
    public void printArray(int arr[], int array_size) {

        for (int i = 0; i < array_size; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    // Driver code
    public static void main(String[] args){

        // Create an instance of a Rotate object named 'result'
        Rotate result = new Rotate();

        // Initialize a Scanner object to obtain user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an array and rotation value
        System.out.println(">>> Please enter the integer length of your array:");
        int userArraySize = 0;

        do {
            try {
                userArraySize = scanner.nextInt();
                if (userArraySize <= 0) {
                    throw new IllegalArgumentException();
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException|IllegalArgumentException e){
                System.err.println(">>> Not a valid integer. Please try again");
                scanner.nextLine();
            }
        }
        while(true);

        int arr[] = new int[userArraySize];
        int i = 0;
        do {
            try {
                System.out.println(">>> Please enter integers one at a time:");
                while (i < userArraySize){
                    int userArrayResponse = scanner.nextInt();
                    if (userArrayResponse < 0){
                        throw new IllegalArgumentException();
                    }
                    arr[i] = userArrayResponse;
                    i += 1;
                }
                
                break;
            }
            catch(InputMismatchException|IllegalArgumentException e){
                System.out.println(">>> Please enter only integer values");
                scanner.nextLine();
            }
        }
        while(true);
        
        int userRotationResponse = 0;
          System.out.println(">>> Please enter the number of positions to rotate the array to the left: ");

        do{
            try{
                userRotationResponse = scanner.nextInt();
                if (userRotationResponse < 0) {
                    throw new IllegalArgumentException();
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException|IllegalArgumentException e){
                System.err.println(">>> Not a valid integer. Please try again");
                scanner.nextLine();
            }
        }
        while(true);

        System.out.println(">>> The rotated array is: ");
        result.rotateLeft(arr, userRotationResponse, userArraySize);

        scanner.close();
        }  
    }