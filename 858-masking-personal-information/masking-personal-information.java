class Solution {
    public String maskPII(String s) {

        if (s.indexOf('@') != -1) {
            s = s.toLowerCase();

            int at = s.indexOf('@');

            return s.charAt(0) + "*****" + s.charAt(at - 1) + s.substring(at);
        }

        String digits = "";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits += ch;
            }
        }

        int n = digits.length();
        String local = "***-***-" + digits.substring(n - 4);

        if (n == 10) {
            return local;
        }

        String country = "+";

        for (int i = 0; i < n - 10; i++) {
            country += "*";
        }

        country += "-";

        return country + local;
    }
}