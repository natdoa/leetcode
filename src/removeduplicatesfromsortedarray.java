import java.util.ArrayList;
import java.util.List;

public class removeduplicatesfromsortedarray {
    public int removeDuplicates(int[] A) {
    	if(A==null){
    		return 0;
    	}
    	
    	List<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<A.length;i++){
    		if(i==A.length-1){
    			if(list.contains(A[i])){
    				break;
    			}
    			else{
    				list.add(A[i]);
    				break;
    			}
    		}
    		if(A[i]!=A[i+1]){
    			list.add(A[i]);
    		}
    	}
        
    	return list.size();
    }
}