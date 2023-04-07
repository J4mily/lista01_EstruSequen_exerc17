import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Programa para uma loja de tintas calculando desperdicio.
* Descrição:17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da 
//área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
//tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//-comprar apenas latas de 18 litros;
//-comprar apenas galões de 3,6 litros;
//-misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de 
//folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
* Data: 07/04/2023 */
public class lista01_EstruSequen_exerc17 {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual a área em M2 que será pintada? ");
    float area = entrada.nextFloat();

    double litros = area /6;
    double latas = Math.ceil(litros/18);
    double preco = latas * 80;
    double galoes = Math.ceil(litros/3.6);

    if(galoes % 3.6 != 0){
       galoes += 1;       
    }

    double preco2 = galoes * 25;

    double mistura_lata = Math.ceil(litros / 18.0);
    double mistura_galao = Math.ceil((litros - (mistura_lata * 18)) / 3.6);

    if(litros - (mistura_lata * 18) % 3.6 != 0){
    mistura_galao += 1;
    }


    System.out.println("Apenas latas de 18 litros: " + latas +"unidade e o preço equivale a " + preco);
    System.out.println("Apenas galões de 3.6 litros: " + galoes + "unidade e o preço equivale a " + preco2);
    System.out.println("Mistura: " + mistura_lata +" latas e " + mistura_galao  +" galoes = " + ((mistura_lata * 80) + (mistura_galao * 25)));

    entrada.close();
}    
}
