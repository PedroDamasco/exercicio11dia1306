import java.util.Scanner;

public class Comentarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando scanner basico
		Scanner sc = new Scanner(System.in);
		
		// criacao de dados
		int l,c, Matriz[][] = new int [16][16];
		
		//criando 2 ciclos para linhas e colunas.
		for (c=0 ;c<16;c++) {
			for (l=0;l<16;l++) {		
				
		// solicitando para que o cliente coloque a cor desejada
			System.out.print("Para pintar a matriz de 16x16 utilize: \n0 -> Branco\n1 -> preto\n2-> bege\n3-> vermelho");
			Matriz[c][l] =sc.nextInt();
			}}
		// sistema de imprimir a matriz
		for (c=0; c<16;c++) {
			System.out.print("\n");
			for(l=0;l<16;l++)
				System.out.printf(" "+ Matriz[c][l]);
				System.out.println();
		}}}