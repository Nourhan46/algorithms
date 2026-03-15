package SelectionSort;

public class SelectionSort {
 static    public int [] sort(int [] nums)
    {
        int n= nums.length;
        for(int i=0;i<n-1;i++)
        {
            int idx = i;
            for(int j=i+1;j<n;j++)
            {
                  if(nums[j]<nums[idx])
                  {

                      idx=j;
                  }
            }
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;

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
