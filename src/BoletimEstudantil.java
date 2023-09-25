// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
	public static void main(String[] args) {
//o valor atribuido a variavel 'mediaFinal' define
//o que será exibido no terminal, pois não tem
//comando para que o usuário digite as notas
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}