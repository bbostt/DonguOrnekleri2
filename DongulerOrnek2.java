import java.util.Scanner;
public class DongulerOrnek2 {

	public static void main(String[] args) {
		// Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve 
		// girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz.
		
		Scanner input = new Scanner(System.in);
		int sayi;
		int total = 0;
		do {
			System.out.print("Say� giriniz : ");
			sayi = input.nextInt();
			if((sayi % 2 == 0) && (sayi % 4 == 0)) {
				total = total + sayi;
			}
			
		}while(sayi % 2 == 0);
		
		System.out.println(total);

	}

}
