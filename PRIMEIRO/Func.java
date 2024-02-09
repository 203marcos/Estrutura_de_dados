import javax.swing.plaf.PanelUI;

public class Func {
    public int fatorialAux(int n) {
        if(n==1)
            return 1;
        else
            return n*fatorialAux(n-1);

    }

    public int comb(int n, int k){
        return fatorialAux(n) / (fatorialAux(k)*(fatorialAux(n-k) ) );



    }

    public int comb2(int n, int k){
        if(k==1)
            return n;
        if(k==n)
            return 1;
        if(1< k && k < n)
           return comb2(n-1,k-1) + comb2(n-1,k);

        return 0;
    }

    public int max(int [] array, int maxT){
        if(maxT == 1)
            return array[0];

        int aux =max(array,maxT-1);

        if (array[maxT-1] > aux)
            return array[maxT-1];
        else
            return aux;
    }

    public int func(int n){
        if(n<4)
            return 3*n;
        else
            return 2 * func(n-4)+5;

    }

    public  double RaizQ(double x, double x0, double e) {
        if (Math.abs(x0*x0 - x) <= e)
            return x0;
        else
            return RaizQ(x, (x0*x0+x)/(2*x0), e);
    }

    public int A (int m, int n){
        if(m==0)
            return 0;
        else if( m > 0 && n == 0)
            return A(m-1,1); //AQUI ESTA ERRADO NO EXERCICIO!!
        else if (m > 0 && n > 0)
            return A(m-1, A(m, n-1));

        return 0;

    }

    public int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }




}
