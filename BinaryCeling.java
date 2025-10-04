public class BinaryCeling {
    public static void main(String[] args) {
        int[]array={1,2,3,4,7,12,14,16,18};
        int target=6;
        int ans=celing(array,target);
    System.out.println(ans);

    }

    public static int celing(int[]array,int target){
        if(target>array[array.length-1]){
            return-1;
        }
        int start=0;
       int end=array.length-1;
         while(start<=end){
            int mid=start+(end-start)/2;

            if(target<array[mid]){
                end=mid-1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else{
                return array[target];
            }
         }

      return array[start];
    }
}
