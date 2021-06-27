package competitiveCoding.array;

/*
Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8
 */
public class SearchSortedRotated {
    public static void main(String[] args) {
//        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] arr = {10,11,12,1, 2, 3,4,5,6};
        int key =5;

//        int pivotPoint = findPivot(arr);
        int pivotPoint = findPivotBinary(arr,0,arr.length-1);
//        System.out.println(pivotPoint);
        System.out.println(pivotPoint);
        int index =-1;
        if(pivotPoint==-1){
            index = binarySearch(arr,0, arr.length-1, key);
        }
        else if(key>arr[0]){
            index = binarySearch(arr,0,pivotPoint-1, key);
        }else{
            index = binarySearch(arr,pivotPoint,arr.length-1,key);
        }
        System.out.println(index);
    }

    public static int findPivotBinary(int[] arr, int low, int high){
//        {5, 6, 7, 8, 9, 10, 1, 2, 3};
        if(high<low){
            return -1;
        }

        int mid =(low+high)/2;

        if(mid<high && arr[mid]>arr[mid+1]){
            return mid+1;
        }
        if(low<mid && arr[mid]<arr[mid-1]){
            return mid;
        }
        if(arr[low]<arr[mid]){
            return findPivotBinary(arr, mid+1,high );
        }
        return findPivotBinary(arr, low,mid-1 );
    }

    public static int binarySearch(int[] arr, int low, int high, int key){
        if(high<low){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            return binarySearch(arr, mid+1, high,key);
        }else{
            return binarySearch(arr, low, mid-1,key);
        }
    }

    public  static int findPivot(int[] arr){
        int i=0;
        int pivot=0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]) {
                pivot = i + 1;
                break;
            }
            i++;
        }
        return pivot;
    }
}
