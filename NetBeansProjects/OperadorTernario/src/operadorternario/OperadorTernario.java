package operadorternario;
public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2,n3,n4 ,r;
        n1 = 14;
        n2 = 18;
        n3 = 40;
        n4 = 40;
        
        r = (n2 > n1 && n3 > n2 && n3 >= n4) ? 1:0;
        System.out.println(r);
    }
}
