package ilkproje;

import java.util.Scanner;

public class ilkprojeREV1 {//class baþlangýç

	public static void main(String[] args) {//main baþlangýç
		
		anamenu();

	}//main bitiþ
	
	public static void anamenu() {//ana menu baþlangýç
		
       Scanner sc = new Scanner(System.in);
		
		
		//Giriþ Metni
					
		System.out.println("***********************************************");
		System.out.println("Aþýrý Harika Ýnteraktif Uygulamaya Hoþ Geldiniz");
		System.out.println("***********************************************");
		System.out.println("");
		
		System.out.println("Lütfen yapmak istediðiniz iþlemin baþýndaki deðeri girerek Enter tuþuna basýnýz.");
		System.out.println("");
		System.out.println("1-Cast iþlemini göster");
		System.out.println("2-Deðiþken tipleri");
		System.out.println("3-Sayý tahmin oyunu");
		System.out.println("");
		System.out.print("Yapmak istediðiniz iþlemin numarasýný girin:");
		
		byte ana_menu = sc.nextByte();
		
		if (ana_menu == 1) {//Ana menu 1
			
			castislemler();
			
		}//Ana menu 1 bitiþ
		
		if (ana_menu==2) {//Ana menu 2
			
			degiskentipleri();
			
		}//Ana menu 2 bitiþ
		
		if (ana_menu == 3) {//Ana menu 3
			
			sayidogrulama();
			
		}//Ana menu 3 bitiþ
				
		
	}//anamenu bitiþ

	
	public static void castislemler() {//castislemler baþlangç
		
		Scanner sc = new Scanner (System.in);
		
		short short_degeri = 300;
		int int_degeri = 786;
		long long_degeri = 23165456432184231L;
		float float_degeri = 12.31F;
		double double_degeri = 12654512.6541214;
		
		//Printler
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("Cast Ýþlemine Hoþ Geldiniz..");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("Short Ýçin Cast( Deðer:300 ): " + ((byte)short_degeri));
		System.out.println("Int Ýçin Cast( Deðer:786 ): " + ((byte)int_degeri));
		System.out.println("Long Ýçin Cast( Deðer:23165456432184231 ): " + ((byte)long_degeri));
		System.out.println("Float Ýçin Cast( Deðer:12.31 ): " + ((byte)float_degeri));
		System.out.println("Double Ýçin Cast( Deðer:12654512.6541214 ): " + ((byte)double_degeri));
		System.out.println("");
		System.out.println("Ana menu için lütfen 0 a basýn");
		
		byte anamenu = sc.nextByte();
		
		if (anamenu == 0) {
			for (int i = 0; i < 20; ++i) System.out.println();
			anamenu();
			
		}
		
		else {
			
			System.out.println("Yanlýþ tuþlama yaptýnýz yaptýnýz Cast iþlemi tekrar baþlatýlýyor:");
			castislemler();
			
		}
		
	}// cast iþlemler bitiþ
	
	
	
	public static void degiskentipleri() {//degisken tipleri baþlangýç
		Scanner sc = new Scanner (System.in);
		
		byte ana_menu = 0;
		byte ust_menu = 1;
		
		for (int i = 0; i < 20; ++i) System.out.println();

		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("Deðiþken tipleri menüsüne hoþ geldiniz.");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("Deðiþken tipler;");
		System.out.println("");
		System.out.println("1-Byte");
		System.out.println("2-Short");
		System.out.println("3-Int");
		System.out.println("4-Long");
		System.out.println("5-Float");
		System.out.println("6-Double");
		System.out.println("7-Char");
		System.out.println("8-String");
		System.out.println("9-Boolen");
		System.out.println("Lütfen görmek istediðiniz deðiþken tipini seçin:");
		
		byte degisken_menu = sc.nextByte();
		
		if(degisken_menu  == 1) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Byte    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Byte deðiþkeninin alabileceði maximum deðer aralýðý: -128 ile 127");
			System.out.println("Ramde kapladýðý alan = 1 byte");
			System.out.println("Örnek Çýktý (byte byte_orneknumara = 124;)");
			byte ornek_numara =124;
			System.out.println(ornek_numara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
			
		}
		
		if(degisken_menu  == 2) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Short    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Short deðiþkeninin alabileceði maximum deðer aralýðý: -32,768 ile 32,767");
			System.out.println("Ramde kapladýðý alan = 2 byte");
			System.out.println("Örnek Çýktý (short short_orneknumara = 14786;)");
			short short_numara =14786;
			System.out.println(short_numara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		if(degisken_menu  == 3) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Int    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Int deðiþkeninin alabileceði maximum deðer aralýðý: -2,147,483,648 ile 2,147,483,647");
			System.out.println("Ramde kapladýðý alan = 4 byte");
			System.out.println("Örnek Çýktý (int int_orneknumara = 1543214685;)");
			int int_numara =1543214685;
			System.out.println(int_numara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		if(degisken_menu  == 4) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Long    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Long deðiþkeninin alabileceði maximum deðer aralýðý: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807");
			System.out.println("Ramde kapladýðý alan = 8 byte");
			System.out.println("Long deðiþken atamasý yapýldýðý zaman sonuna (L) harfinin eklenmesi gerekir");
			System.out.println("Örnek Çýktý (long long_orneknumara = 54645546231654L;)");
			long long_orneknumara = 54645546231654L;
			System.out.println(long_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		if(degisken_menu  == 5) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Float    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Float deðiþkeni kýsa ondalýk sayýlar için kullanýlýr");
			System.out.println("Ramde kapladýðý alan = 4 byte");
			System.out.println("Float deðiþken atamasý yapýldýðý zaman sonuna (F) harfinin eklenmesi gerekir");
			System.out.println("Örnek Çýktý (float float_orneknumara = 24.542376F;)");
			float float_orneknumara = 24.542376F;
			System.out.println(float_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		if(degisken_menu  == 6) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Double    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Double deðiþkeni uzun ondalýk sayýlar için kullanýlýr");
			System.out.println("Ramde kapladýðý alan = 8byte");
			System.out.println("Örnek Çýktý (double double_orneknumara = 24.54237656123145;)");
			double double_orneknumara = 24.54237656123145;
			System.out.println(double_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		if(degisken_menu  == 7) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Char    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Char deðikeni tekil karakter, iþaret veya ASCII deðeri alabilir");
			System.out.println("Ramde kapladýðý alan = 2byte");
			System.out.println("Örnek Çýktý (char char_degeri = 33;)");
			char char_degeri = 33;
			System.out.println("Çýktý :" + char_degeri);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		if(degisken_menu  == 8) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     String    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("String deðiþkeni klavyeden gönderilen tüm deðerleri alabilir");
			System.out.println("Örnek Çýktý (String string_degeri = Merhaba dünya;)");
			String string_degeri = "Merhaba dünya";
			System.out.println(string_degeri);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
		
		
		if(degisken_menu  == 9) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Boolean    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Boolen deðiþkeni (true) veya (false) olarak deðer alabilir");
			System.out.println("Ramde kapladýðý alan = 1bit");
			System.out.println("Örnek Çýktý (boolean boolean_degeri = true;)");
			boolean boolean_degeri = true;
			System.out.println(boolean_degeri);
			
			System.out.println("");
			System.out.print("Ana menu için 0 bir üst menu için 1 i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
	}//deðiken tipleri bitiþ
	
	
	
	
		public static void sayidogrulama() {//sayidogrulama baþlangýç
			
			byte ana_menu = 0;
			byte ust_menu = 1;
			
			Scanner sc = new Scanner (System.in);
			
			for (int i = 0; i < 20; ++i) System.out.println();

			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("Deðer doðrulama ekrarnýna hoþ geldiniz");
			System.out.println("--------------------------------------");
			System.out.println("");
			System.out.println("Ekranda yazýlý olan deðeri lütfen console üzerine yazýn");
			int sayi = 1 + (int)(100 * Math.random());
			System.out.println("Yazmanýz gereken deðer: " +sayi);
			
			int kullanici_degeri = sc.nextInt();
			
			System.out.println(kullanici_degeri==sayi);
			
			
			System.out.println("");
			System.out.print("Ana menu için 0 tekrar etmek için 1'i tuþlayýn");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
        	   
        	   for (int i = 0; i < 20; ++i) System.out.println();
        	   sayidogrulama();
				
			}
			
		}//sayidogrulama bitiþ
	
	

}//class bitiþ
