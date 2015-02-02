public class stringtointeger {
    public int atoi(String str) {
    	char[] temp=str.replaceAll("\\s+","").toCharArray();
		int cnt=0;
		for(char c : temp){
			cnt+=(int)c;
		}
    	
    	return cnt;
    }
}