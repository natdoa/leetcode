public class lengthoflastword {
    public int lengthOfLastWord(String s) {
    	s=s.trim();
        String temp= s.substring(s.lastIndexOf(" ")+1);    
    	return temp.length();
    }
}