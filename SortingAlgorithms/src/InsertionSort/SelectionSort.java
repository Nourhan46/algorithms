package InsertionSort;

import java.util.List;

public class SelectionSort {
   static public int [] sort(int [] nums)
    {
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            int key= nums[i];
            int j=i-1;
         while(j>-1 && nums[j]>key)
         {
             nums[j+1]=nums[j];
             j--;
         }
         nums[j+1]=key;
        }
        return nums;
    }

  public   static void main(String[] args) {
        int [] nums= new int[]{9,2,10,0,5,3,90,85 , 2,1,5};
        sort(nums);
        for(int num : nums)
            System.out.println(num);
    }
}
