import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1,num2;
		
		try {
		System.out.print("Digite o primeiro numero: ");
		num1 = Integer.parseInt(in.nextLine());

		System.out.print("Digite o segundo numero: ");
		num2 = Integer.parseInt(in.nextLine());
		
		contar(num1, num2);

		}
		catch (NumberFormatException e){
			System.out.printf("\nValor digitado invalido%n");
		}
		catch (ParametrosInvalidosException e) {
			System.out.println(e);
		}
		
		in.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		if (parametroDois <= parametroUm ){
			throw new ParametrosInvalidosException(parametroUm, parametroDois);
		}
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número "+ i);
		}
	}
	
	
}