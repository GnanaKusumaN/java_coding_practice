public class SumAndAverage {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        float avg = (int)sum/arr.length;
        System.out.println(avg);
    }
    
}
