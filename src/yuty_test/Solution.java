package yuty_test;

class Solution {
    public static void main(String[] args) {
        String s = "cbbd";
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String max = "";
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int i = len-1; i >=0 ; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(j) == s.charAt(i)){
                    if (j-i<2){
                        if (max.length() < j-i+1) max = s.substring(i, j+1);
                        dp[i][j] = true;
                    }else {
                        if (dp[i+1][j-1]){
                            if (max.length() < j-i+1) max = s.substring(i, j+1);
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(max);


    }
}
