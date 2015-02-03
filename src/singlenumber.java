import java.util.Arrays;

public class singlenumber {
    public int singleNumber(int[] A) {
    	/*if(A.length==0){
    		return 0;
    	}
    	if(A.length==1){
    		return A[0];
    	}
    	Arrays.sort(A);
    	for(int i=0;i<A.length;i=i+2){
    		if(A[i]!=A[i+1]){
    			return A[i];
    		}
    	}
		return 0;*/
		
        int x=0;
        for(int a: A){
            x = x ^ a;
        }
        return x;
    }
}