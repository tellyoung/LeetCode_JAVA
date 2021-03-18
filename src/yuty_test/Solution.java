package yuty_test;

class Solution {
    public static void main(String[] args) {
        String res = "";
        String str = "cbbd";
        for (int i=0; i<str.length()-1; i++){
            for (int j= i+1;j<=str.length();j++){
                String s = str.substring(i, j);
                int p1 = 0, p2 = s.length()-1;
                while(p1 < p2){
                    if (s.charAt(p1) != s.charAt(p2)){
                        break;
                    }
                    p1+=1;
                    p2-=1;
                }
                if (p1>=p2 && s.length() > res.length()){
                    res = s;
                }
            }
        }
        System.out.println(res.toString());
    }
}
