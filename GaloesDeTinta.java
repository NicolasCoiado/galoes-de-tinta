import java.util.Scanner;

public class GaloesDeTinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 17");
        System.out.println("Digite o tamanho (m²) da área a ser pintada:");
        double area = Double.parseDouble(scanner.next());
        double litros = area/6;
        double latas = litros/18;
        double galoes = litros/3.6;
        double precoLatas =  latas*80;
        double precoGaloes = galoes*25;
        double combinacao = (litros/18) * 80 + (((litros % 18)/3.6)*25);
        System.out.println("O preço somente em latas é de: "+ precoLatas);
        System.out.println("O preço somente em galões é de: "+ precoGaloes);
        System.out.println("O preço econômico em combinações é de: R$"+ combinacao);
        System.out.println("=====================================");
    }
}
