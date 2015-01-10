public class palindromenumber {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0 || x % 10 == 0) return false;
        
        int length = String.valueOf(x).length();
        int[] arr=new int[length];

        for(int i=0;i<length;i++){
        	arr[i]=(int) (x / Math.pow(10, length-i-1));
        	x%=Math.pow(10, length-i-1);
        }
        
        for(int i=0;i<length;i++){
        	if(arr[i]!=arr[length-i-1])return false;
        }
    	return true;
    }
}