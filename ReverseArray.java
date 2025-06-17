public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int[]{8,9,7,6,5};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);
        }
    }
    
}
