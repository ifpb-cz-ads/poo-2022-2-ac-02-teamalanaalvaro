
/**
 Crie um programa que elabore o orçamento de uma construtora 
para o cálculo do valor total de construção de uma piscina. O valor 
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00, 
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no 
programa para ver se está tudo funcionando corretamente.
 **/
public class CBBAtividadePratica4
{
  public static void main(String[] args) {
        double altura = 1.65;
        double largura = 3;
        double comprimento = 5;
        double cubagem = altura * largura * comprimento;
        double preco = 100;
        double precoTotal = cubagem * preco;
        System.out.println("O preço total da piscina é: R$" + precoTotal);
    }
}
