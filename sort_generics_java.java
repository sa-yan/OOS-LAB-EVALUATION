class BubbleSort  <T extends Comparable<T>>{
    void bubbleSortGenerics(T arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(T integer: arr){
            System.out.print(integer+" ");
        }
    }

}

class sort_generics_java{
    public static void main(String[] args) {
       BubbleSort<Integer> ob_int = new BubbleSort<Integer>();

       Integer intArray[] = {21,312,2121,221,2465};
       ob_int.bubbleSortGenerics(intArray);

       System.out.println();

       BubbleSort<Double> ob_double = new BubbleSort<Double>();

       Double doubleArray[] = {23.65,768.8, 65.8, 45.08, 44.8};
       ob_double.bubbleSortGenerics(doubleArray);
       
        
    }
}
