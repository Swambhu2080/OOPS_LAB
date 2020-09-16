public class GCD {

    public static void main(String[] args) {

        int n1, n2 , g=1;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                g = i
        }

        System.out.println("G.C.D of is : "+g);
    }
}