
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int num:nums1)list1.add(num);
        for(int num:nums2)list2.add(num);

        for(int num:nums1){
            if(list2.contains(num)){
                if(!list3.contains(num)){
                    list3.add(num);
                }
            }
        }
        int ans[]=new int [list3.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list3.get(i);
        }
        return ans;
    
    }

   
}
