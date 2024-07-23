import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imrpimindo o número: " + i);
		}
	}
}