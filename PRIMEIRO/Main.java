import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Func func1 = new Func();

        //System.out.println("PRIMEIRA QUESTAO: ");
        //System.out.println("Versao nao recursiva: "+ func1.comb(4,3));
        //System.out.println("Versao recursiva: "+ func1.comb2(4,3));

        //System.out.println("SEGUNDA QUESTAO: ");
        //System.out.println("Digite quantos termos voce deseja dentro do vetor");
        //int n = prompt.nextInt();
        //int [] V = new int[n];
        //for (int i =0;i<n;i++){
            //System.out.println("Digite o elemento no local: "+i);
            //V [i] = prompt.nextInt();
        //}
        //System.out.println("Maior termo é: "+ func1.max(V,V.length));

        System.out.println("TERCEIRA QUESTAO: ");
        System.out.println("Os valores de F(3) e F(7)");
        System.out.println("F(3): "+func1.func(3));
        System.out.println("F(7): "+func1.func(7));

        System.out.println("QUARTA QUESTAO: ");
        System.out.println("RESPOSTA DO EXERCICIO: "+ func1.RaizQ(13, 3.2, 0.001));

        System.out.println("QUINTA QUESTAO: ");
        System.out.println("RESPOSTA DO EXERCICIO DE ACKERMAN COM A(1,2): "+ func1.A(1,2));




    }
}