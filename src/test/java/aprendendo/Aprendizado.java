
/*
 Aprendendo a definir e variáveis
 */

package aprendendo;

class Aprendizado {
	public static void main(String[] args) {
		System.out.println("Mensagem alterada 1");
		System.out.println("");
		System.out.println("Mensagem alterada 2");

		int idade;
		int idade2;
		idade = 15;
		idade2 = 20;
		/*
		 * System.out.println(idade); System.out.println(idade2);
		 * System.out.println(idade + idade2);
		 */
		int novaidade = idade + 1;
		System.out.println(novaidade);
		int novaidade2 = 1;
		System.out.println(novaidade2);
		System.out.println(idade * idade2 + novaidade - novaidade2);
		int um = idade % novaidade; // o operador % pega o resto da divisão inteira
		System.out.println(um);

		double valor = idade * 8;
		System.out.println(valor);
		System.out.println(valor / idade2);

		boolean menorDeIdade = idade2 < 18;
		System.out.println(menorDeIdade);

		boolean menorDeIdade2 = idade2 < 30;
		System.out.println(menorDeIdade2);
		
		char letra = 'a';
		System.out.println(letra);
		System.out.println (idade / valor);
		int i = (int) valor; //CASTING serve para arredondar valores - neste caso: valor=120.0 para i=120
		System.out.println(i);
		
		long x = 100000;
		int a = (int) x; //CASTING também serve para que varíavel com numero longo seja adequada para impressão e não perca valor
		
		System.out.println(a);
		
		
		
		
	}
}