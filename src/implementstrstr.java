public class implementstrstr {
    public int strStr(String haystack, String needle) {
		if(haystack==null) return -1;
		if(needle==null) return -1;
		if(haystack.length()<needle.length()) return -1;
		if(haystack.contains(needle)) return haystack.indexOf(needle);
		else return -1;
    }
}