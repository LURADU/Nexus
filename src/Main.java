// Driver Class
class Main {
    // array declared
    static int arr[] = {10, 324, 45, 90, 9808};

    // Method to find maximum in arr[]
    static int largest()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length-1; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }



    public static void main(String[] args) {
        // Java Program to find maximum in arr[]

        System.out.println("Largest in given array is " + largest());

            // Driver method

        }

    }
