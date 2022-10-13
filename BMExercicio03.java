public class BMExercicio03 {
    public static void main(String[] args) {
        final double TAXA = 0.0825;
        double produto1 = 2.95;
        double produto2 = 3.50;
        double total = produto1 + produto2;
        double taxaCalculada = total * TAXA;
        double produto1Taxa = produto1 + taxaCalculada;
        double produto2Taxa = produto2 + taxaCalculada;
        double novoCusto = produto1Taxa + produto2Taxa;
        boolean muitoCaro = (novoCusto > 10);

        System.out.println("O item 1 custa R$" + produto1 + " e o item 2 custa R$" + produto2);
        System.out.println(total);
        System.out.println(taxaCalculada);
        System.out.println(novoCusto);
        System.out.println(muitoCaro);
    }
}
