// DO/WHILE, DIFERENTEMENTE DO WHILE, FUNCIONA DA SEGUINTE FORMA: 

public class DoWhile {
	public static void main (String [] args) {
		//definir  o parametro antes da estrutura 
		int i = 0;
		//executar o bloco de comando
		do {
			System.out.println("Valor de i ="+ i);
			i++;
		} while(i <= 10); //definir a expressão depois
	}
}

//observe que o bloco de comando é executado antes da expressão.
