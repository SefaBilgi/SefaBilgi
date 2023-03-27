public class homework_TwoSum{
    public static void main(String[] args) {
      int target = 7;
      int [] nums = {1,2,3,4};
      int n = nums.length;
      int sum = 0;
      for (int i =0; i<n; i++){
          for(int j = i+1;j<n; j++){
              if (nums[i] + nums[j] == target){
                  System.out.println("["+i+","+j+"]");

              }

          }
      }
    }
}