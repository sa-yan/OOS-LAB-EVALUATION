/*
 * Generic java class “Frequency” to print the frequency of each element of the array and count the unique elements of the array. Use Scanner class to take input.
*/

import java.util.Scanner;

class Q5_lab_oos <T extends Comparable<T>> {
    void freqOfelem(T arr[]){
        java.util.Arrays.sort(arr);
        T currentElem = arr[0];
        int count =1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(currentElem)==0){
                count++;
            }else{
                if (count==1) {
                    System.out.println(currentElem+" is the unique elemenet");
                }
                System.out.println("The element "+currentElem+" Occurs "+count+" times");
                currentElem=arr[i];
                count=1;
            }
        }

        

        System.out.println("The element "+currentElem+" Occurs "+count+" times");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        Integer intArray[] = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            intArray[i]=sc.nextInt();
        }

        Q5_lab_oos ob = new Q5_lab_oos<>();
        ob.freqOfelem(intArray);
        
    }
}
