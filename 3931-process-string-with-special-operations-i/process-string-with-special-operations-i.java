class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*' && str.length() > 0){
                str.deleteCharAt(str.length() - 1);
            }else
            if(ch == '#'){
                str.append(str.toString());
            }else
            if(ch == '%'){
                str.reverse();
            }else
            if(ch >= 'a' && ch <= 'z'){
                str.append(ch);
            }
        }
        return str.toString();
    }
}