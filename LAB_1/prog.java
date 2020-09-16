import java.lang.Math;
    class prog{
        public static void main(String[] args) {
            int x, n, sum=0;
             x = Integer.parseInt(args[0]);
             n = Integer.parseInt(args[1]);
            sum+=1;
            for (int i=2;i<=n;i++){
                sum+=x*i;
            }
            System.out.println("The Sum is : "+sum);
            
        }
    }