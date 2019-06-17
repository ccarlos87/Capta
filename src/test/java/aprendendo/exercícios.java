package aprendendo;

public class exercícios {
	
// contando até 300
	public static void main(String[] args) {
		int contador = 5;
		while (contador < 300) {
			contador = contador + 1;
			System.out.println(contador);

			// duplicando o valor até 300
			while (contador < 300) {
				int soma = contador + ++contador;
				System.out.println(soma);

			}
		}
	}
}