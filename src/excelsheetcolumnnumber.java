public class excelsheetcolumnnumber {
    public int titleToNumber(String s) {
    	int count = 0;
    	for(int i=0;i<s.length();i++){
    		char c = s.charAt(i);
    		count += (int)(c - 'A' + 1) * Math.pow(26, s.length()-i-1);
    	}
    	return count; 
    }
}