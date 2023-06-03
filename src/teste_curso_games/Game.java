package teste_curso_games;

public class Game {

	public static void main(String[] args) {
		
		Player player = new Player();
		Elfinimigo elf = new Elfinimigo(10);
		
		elf.tomarDano();
		
		System.out.println(elf.getVida());
		
	}
	
}
