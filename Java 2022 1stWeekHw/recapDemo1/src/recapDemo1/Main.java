package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		//RecapDemo baştan sona yaptıklarımızın bir demosu olacak
		
		int sayi1=365;
		int sayi2=52;
		int sayi3=2022;
		
		int enBuyuk=sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük=" + enBuyuk);
	}

}
