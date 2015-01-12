public class excelcolumnsheettitle {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while(n>0){
            n--;
            int remainder = n%26;
            str.insert(0,(char)('A'+(remainder)));
            n = n/26;
        }
        return str.toString();
    }
}