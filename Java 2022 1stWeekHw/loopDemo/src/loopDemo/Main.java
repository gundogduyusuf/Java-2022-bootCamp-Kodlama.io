package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);

		}

		System.out.println("FOR Döngüsü Bitti!");

		// While
		int i = 2;

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("WHILE Döngüsü Bitti!");

		// DO-WHILE : Program satır satır ilerler do çalışır sysO çalışır şart sağlanmıyorsa ilk işlemde durur
		int j = 100;
		do {
			System.out.println("Loglandı");
			
			System.out.println(j);
			j += 2;

		} while (j < 10);
		System.out.println("DO-WHILE Döngüsü Bitti!");
	}

}
