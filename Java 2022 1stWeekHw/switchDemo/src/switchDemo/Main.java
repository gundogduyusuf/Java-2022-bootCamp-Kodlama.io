package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		
		case 'A':
			System.out.println("Mükemmel : Geçtiniz ");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi : Geçtiniz ");
			break;
		case 'D':
			System.out.println("Fena değil : Geçitiniz ");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}

	}

}
