package agh.po.lab4;

public class Codingbat {
    public int[] makePi() {
            int[] makePi = {3,1,4};
            return makePi;
    }
    public boolean has23(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                return true;
            }
        }
        return false;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length - 2); i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] arg){
        Codingbat codingbat = new Codingbat();
    }
}
