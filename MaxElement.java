//2. Find the Maximum Element
public class MaxElement {
    public static void main(String[] args) {
        int [] arr2 = new int[]{5,8,9,6,4,13};
        int max =arr2[0];
        for(int i =0;i<arr2.length;i++)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
           
        }
         System.out.println(max);
        
    }
    
}
