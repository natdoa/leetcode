import java.util.HashMap;
import java.util.Map;

public class romantointeger {
    public int romanToInt(String s) {
    	Map<Character, Integer> roman = new HashMap<Character, Integer>();
    	roman.put('I', 1);
    	roman.put('V', 5);
    	roman.put('X', 10);
    	roman.put('L', 50);
    	roman.put('C', 100);
    	roman.put('D', 500);
    	roman.put('M', 1000);
    	char[] cs = s.toCharArray();
    	int num = 0;
    	int val;
    	for(int i = 0; i < cs.length ; i++){
    		val = roman.get(cs[i]);
    		//System.out.println(val);
    		if(i == cs.length - 1 || roman.get(cs[i+1])<=val){
    			num += val;
    		}
    		else{
    			num -=val;
    		}
    	}
		return num;  
    }
}