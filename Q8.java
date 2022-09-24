public class Q8 {

    public static void main(String[] args) {
        int p;
        for (int i=2;i<=19;i++){
            p=0;
            for (int n=2;n<=i;n++){
                if (i%n==0)
                    p=1;
                if (p==0)
                    System.out.println(i);
            }
        }
    }





}
