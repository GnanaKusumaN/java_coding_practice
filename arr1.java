public class arr1 {
    public static void main(String [] args)
    {
        int [] arr = new int[]{1,2,6,9,6};
        //Using for loop
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(i+":"+arr[i]);
        }
        //  Using for-each loop

        for(int num:arr)
        {
            System.out.println(num);
        }
    }
    
}
