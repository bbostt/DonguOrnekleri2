import java.util.Scanner;
public class DongulerOrnek2 {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve 
		// girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz.
		
		Scanner input = new Scanner(System.in);
		int sayi;
		int total = 0;
		do {
			System.out.print("Sayý giriniz : ");
			sayi = input.nextInt();
			if((sayi % 2 == 0) && (sayi % 4 == 0)) {
				total = total + sayi;
			}
			
		}while(sayi % 2 == 0);
		
		System.out.println(total);

	}

}
