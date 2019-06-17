package aprendendo;

/*
 * O trecho dentro do bloco do while será executado até o momento em que a condição idade <
18 passe a ser falsa. E isso ocorrerá exatamente no momento em que idade == 18 , o que não o fará
imprimir 18
*/

public class While {
	public static void main(String[] args) {

		// enquanto a idade for menor que 30 à partir de 15, será impresso na tela até
		int idade = 15;
		while (idade < 30) {
			idade = idade + 1; 
			System.out.println(idade);

			// neste caso, será impresso na tela a contagem de 0 a 10
			int i = 0;
			while (i < 10) {
				i = i + 1;
				System.out.println(i);
				
				// outro comando parecido com o While é o FOR onde as condições são tratadas detro da variável
				for (int valor = 0; i < 10; i = i + 1) {
					System.out.println("olá!");

					//neste caso, a variável b valerá 6 (5+1)
				int a = 5;
				int b = ++a;
				System.out.println(b);
				

				}

			}
		}
	}
}