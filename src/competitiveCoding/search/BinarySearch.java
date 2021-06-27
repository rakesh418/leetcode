package competitiveCoding.search;

public class BinarySearch {

    public static void main(String[] args) {
//        int arr[] = {1,4,7,9,13,17,89,90};
        int arr[] = {90,1,4,7,9,13,17,89};
        int size=arr.length;

        System.out.println(search(arr,90));
    }

    private static int search(int[] arr, int element) {
        int start=0, end= arr.length-1;
        int pivotPoint = findPivot(arr, start, end);
        System.out.println(pivotPoint);
        if(pivotPoint==-1)
            return binarySearch(arr,start,end, element);
        else{
            if(arr[pivotPoint]==element)
                return pivotPoint;
            if(arr[start]<element)
                return binarySearch(arr,start,pivotPoint-1, element);
        }
        return binarySearch(arr,pivotPoint+1,end, element);
    }

    private static int findPivot(int[] arr, int low, int high) {
        if(high<low)
            return -1;
        int mid = (low+high)/2;
        if(mid<high && arr[mid]>arr[mid+1])
            return mid;
        if(low<mid && arr[mid]<arr[mid-1])
            return mid-1;
        if(arr[low]>=arr[mid])
            return findPivot(arr,low,mid-1);
//        else(arr[low]<=arr[mid])
            return findPivot(arr,mid+1,high);
    }

    private static int binarySearch(int[] arr, int start, int end, int element) {
        int mid = (start+end)/2;
        if(arr[mid]==element){
            return mid;
        }else if(start>=end){
               return -1;
        }else if(arr[mid]> element){
            return binarySearch(arr,start,mid-1, element);
        }else{
            return binarySearch(arr,mid+1,end, element);
        }
    }
}
