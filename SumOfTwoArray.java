public class SumOfTwoArray {
    public static void main(String[] args) {
     int[] arr = new int[]{2,7,4};
     int[] arr1 = new int[]{2,7,4};
     int[] result= new int[3];
     for ( int i=0;i<arr.length;i++){
        for(int j=0;j<arr1.length;j++)
        {
            result[3]= arr[i]+arr[j];
        }
     }
     for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
     }
    }
}
