package container.LearnString;

public class LearnString001 {
    public static void filed (int x){
        x = 8;
    }
    public static void main(String[] args) {
        StringBuilder strbu = new StringBuilder("abc");
        strbu.append("d");
        System.out.println(strbu);
        int x = 9;
        System.out.println(x);
        filed(x);
        System.out.println(x);
    }
}
