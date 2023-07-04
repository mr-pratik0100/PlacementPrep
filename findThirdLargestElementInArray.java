class Solution {
    public int thirdMax(int[] nums) {
        
        Integer max1 =null;
        Integer max2 =null;
        Integer max3 =null;

        for(Integer ele : nums){
            if(ele.equals(max1) || ele.equals(max2) || ele.equals(max3)) continue;

            if(max1 ==null || ele>max1){
                max3=max2;
                max2 =max1;
                max1 =ele;
            }
            else if(max2 ==null || ele>max2){
                max3=max2;
                max2=ele;
            }
            else if(max3==null || ele>max3){
                max3 =ele;
            }
        }

       return max3==null ?max1 : max3;

    }

}
