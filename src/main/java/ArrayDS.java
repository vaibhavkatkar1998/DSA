import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ArrayDS {

    public static void main(String[] args) {

/*         // Print extremes
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;

        while(true) {
            if(start>end) {
                break;
            }

            if(start == end){
                System.out.print(arr[start] + " ");
            } else{
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }

            start ++;
            end --;
        }

        // reverse the array
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }

       //Unique element
        ArrayList<Integer> vr = new ArrayList<>();
        vr.add(1);
        vr.add(1);
        vr.add(2);
        vr.add(3);
        vr.add(3);
        int ans = 0;
        for (int i = 0; i < vr.size(); i++) {
        // using XOR for our unique element
            ans = ans ^ vr.get(i); // XOR keyword
        }
        System.out.println("Unique element "+ans);

   // ********************************************************

        //Union of two array
        ArrayList<Integer> arr1 = new ArrayList<>();
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {6,7,8};

        for (int i = 0; i < arr2.length; i++) {
        // adding arr2 in arr1 of arrayList
            arr1.add(arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
        // adding arr3 in arr1 of arrayList
            arr1.add(arr3[i]);
        }

        System.out.println("Union of Array "+arr1);

    // ********************************************************

        //Intersection of two arrays
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        int arr5[] = {1,2,3,3,4,4,5};
        int arr6[] = {1,5,3,8};

        for (int i = 0; i < arr5.length; i++) {
        // If same number is already present in arr5, then will not add
            if(!arr4.contains(arr5[i])) {
                arr4.add(arr5[i]);
            }
        }

        for (int i = 0; i < arr6.length; i++) {
        // to find same number, if it is already present in arr4 then will add result in ans1
           if(arr4.contains(arr6[i])) {
               ans1.add(arr6[i]);
           }
        }

        System.out.println("Insertion " + ans1);

    // ********************************************************

        //Pair sum
        int arr1[] = {1,2,3,4,5};
        int sum = 9;
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            // for i+1 one value to be compared from i
            for (int j = i+1; j < arr1.length; j++) {
                if(sum == arr1[i] + arr1[j]) {
                    // to add in array in format of pair.
                    ar.add("("+arr1[i] + "," + arr1[j]+")");
                }
            }
        }
        // printing the array
        System.out.println("Pair sum " +ar);

    // ********************************************************

        //Triplet Sum
        int arr1[] = {1,2,3,4,5};
        int sum = 9;
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            // for i+1 one vale to be compared from i
            for (int j = i+1; j < arr1.length; j++) {
                // k can be j+1 and i+2 also
                for (int k = j+1; k < arr1.length; k++) {
                    if(sum == arr1[i] + arr1[j] + arr1[k]) {
                        // to add in array in format of pair.
                        ar.add("("+arr1[i] + "," + arr1[j]+ "," + arr1[k] +")");
                    }
                }

            }
        }
        // printing the array
        System.out.println("Pair sum " +ar);

    // ********************************************************

        //Sort 0's and 1's from array
        int temp,arr[] = {0,1,1,0,1,0,1,1,0,0,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // logic to sort the array
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + " ");
        }*/

        // Left rotate an Array by element
        // Majority element in array
        // Buy and sell stock - level 1


    }
}
