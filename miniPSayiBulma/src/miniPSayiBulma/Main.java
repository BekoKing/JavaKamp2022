package miniPSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
        int aranacak = 10;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur.");
        } else {
            System.out.println("Sayı mevcut değildir.");
        }

        System.out.println("-----------------");

        for (int j = 0; j < sayilar.length; j++) {
            if (aranacak == sayilar[j]) {
                varMi = true;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur.");
        } else {
            System.out.println("Sayı mevcuttur değildir.");
        }
	}

}
