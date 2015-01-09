import java.util.ArrayList;
import java.util.Arrays;

public class majorityelement {
    public int majorityElement(int[] num) {
/*    	int count=0;
    	int tempcount=0;
    	int res=0;
		for(int i=0; i<num.length; i++){
			for(int j=i+1; j<num.length; j++){
				if(num[i]==num[j]) tempcount++;
			}
			if(tempcount>count){
				count = tempcount;
				res = num[i];
			}
		}
    	return res;*/
    	Arrays.sort(num);
    	return num[num.length/2];
    }
    
}