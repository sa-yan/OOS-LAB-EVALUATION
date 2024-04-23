

class freqOfEachElement {
    static void calcFreq(int[] arr){
        java.util.Arrays.sort(arr);
        int current = arr[0];
        int count =1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==current) {
                count++;
            }else{
                System.out.println("current elem "+current+" occurs "+count+" times");
                current=arr[i];
                count=1;
            }
        }
        System.out.println("Element " + current + " occurs " + count + " times");
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,3};
        calcFreq(arr);
    }
}
