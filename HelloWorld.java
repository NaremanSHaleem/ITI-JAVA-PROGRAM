import java.util.Arrays;

class HelloWorld {
    public static void main(String a[]) {

        //Exercise 01
//        System.out.println("Hello World!");
//        int num = 3;
//        byte by = 127;
//        System.out.println(num);
//        System.out.println(by);
//
//        int input_number = Integer.parseInt(System.console().readLine("Enter a number: "));
//        String input_text = System.console().readLine("Enter a letter: ");
//
//        for(int i=0; i<input_number; i++){
//            System.out.println(input_text);
//        }

        //Exercise 02 01

        int numbers_array[];
        numbers_array = new int[1000];
        for (int j = 0; j < numbers_array.length; j++) {
            numbers_array[j] = (int) (Math.random() * 1000);
        }
//        numbers_array = new int[]{5,50,130,12,0,23};
        int min = numbers_array[0];
        int max = numbers_array[0];
        long startTime = System.nanoTime();
        for (int i = 1; i < numbers_array.length; i++) {
            if (numbers_array[i] < min) {
                min = numbers_array[i];
            }

            if (numbers_array[i] > max) {
                max = numbers_array[i];
            }
        }
        long endTime = System.nanoTime();

        System.out.println("Min number = " + min);
        System.out.println("Max nyumber= " + max);
        System.out.println("Time: " + (endTime - startTime));

        Arrays.sort(numbers_array);
        for (int i = numbers_array.length - 1; i >= 0; i--) {
            System.out.println("sorted " + numbers_array[i]);
        }
    }

//    public static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (arr[mid] < target) {
////                left = mid + 1;
//            } else {
////                right = mid - 1;
//            }
//        }
//        //return -1; // TO DO;
//    }

}
