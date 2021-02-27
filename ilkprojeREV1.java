package ilkproje;

import java.util.Scanner;

public class ilkprojeREV1 {//class ba�lang��

	public static void main(String[] args) {//main ba�lang��
		
		anamenu();

	}//main biti�
	
	public static void anamenu() {//ana menu ba�lang��
		
       Scanner sc = new Scanner(System.in);
		
		
		//Giri� Metni
					
		System.out.println("***********************************************");
		System.out.println("A��r� Harika �nteraktif Uygulamaya Ho� Geldiniz");
		System.out.println("***********************************************");
		System.out.println("");
		
		System.out.println("L�tfen yapmak istedi�iniz i�lemin ba��ndaki de�eri girerek Enter tu�una bas�n�z.");
		System.out.println("");
		System.out.println("1-Cast i�lemini g�ster");
		System.out.println("2-De�i�ken tipleri");
		System.out.println("3-Say� tahmin oyunu");
		System.out.println("");
		System.out.print("Yapmak istedi�iniz i�lemin numaras�n� girin:");
		
		byte ana_menu = sc.nextByte();
		
		if (ana_menu == 1) {//Ana menu 1
			
			castislemler();
			
		}//Ana menu 1 biti�
		
		if (ana_menu==2) {//Ana menu 2
			
			degiskentipleri();
			
		}//Ana menu 2 biti�
		
		if (ana_menu == 3) {//Ana menu 3
			
			sayidogrulama();
			
		}//Ana menu 3 biti�
				
		
	}//anamenu biti�

	
	public static void castislemler() {//castislemler ba�lang�
		
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
		System.out.println("Cast ��lemine Ho� Geldiniz..");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("Short ��in Cast( De�er:300 ): " + ((byte)short_degeri));
		System.out.println("Int ��in Cast( De�er:786 ): " + ((byte)int_degeri));
		System.out.println("Long ��in Cast( De�er:23165456432184231 ): " + ((byte)long_degeri));
		System.out.println("Float ��in Cast( De�er:12.31 ): " + ((byte)float_degeri));
		System.out.println("Double ��in Cast( De�er:12654512.6541214 ): " + ((byte)double_degeri));
		System.out.println("");
		System.out.println("Ana menu i�in l�tfen 0 a bas�n");
		
		byte anamenu = sc.nextByte();
		
		if (anamenu == 0) {
			for (int i = 0; i < 20; ++i) System.out.println();
			anamenu();
			
		}
		
		else {
			
			System.out.println("Yanl�� tu�lama yapt�n�z yapt�n�z Cast i�lemi tekrar ba�lat�l�yor:");
			castislemler();
			
		}
		
	}// cast i�lemler biti�
	
	
	
	public static void degiskentipleri() {//degisken tipleri ba�lang��
		Scanner sc = new Scanner (System.in);
		
		byte ana_menu = 0;
		byte ust_menu = 1;
		
		for (int i = 0; i < 20; ++i) System.out.println();

		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("De�i�ken tipleri men�s�ne ho� geldiniz.");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("De�i�ken tipler;");
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
		System.out.println("L�tfen g�rmek istedi�iniz de�i�ken tipini se�in:");
		
		byte degisken_menu = sc.nextByte();
		
		if(degisken_menu  == 1) {
		     
			for (int i = 0; i < 20; ++i) System.out.println();
			
			
			System.out.println("*************");
			System.out.println("     Byte    ");
			System.out.println("*************");
			System.out.println("");
			System.out.println("Byte de�i�keninin alabilece�i maximum de�er aral���: -128 ile 127");
			System.out.println("Ramde kaplad��� alan = 1 byte");
			System.out.println("�rnek ��kt� (byte byte_orneknumara = 124;)");
			byte ornek_numara =124;
			System.out.println(ornek_numara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Short de�i�keninin alabilece�i maximum de�er aral���: -32,768 ile 32,767");
			System.out.println("Ramde kaplad��� alan = 2 byte");
			System.out.println("�rnek ��kt� (short short_orneknumara = 14786;)");
			short short_numara =14786;
			System.out.println(short_numara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Int de�i�keninin alabilece�i maximum de�er aral���: -2,147,483,648 ile 2,147,483,647");
			System.out.println("Ramde kaplad��� alan = 4 byte");
			System.out.println("�rnek ��kt� (int int_orneknumara = 1543214685;)");
			int int_numara =1543214685;
			System.out.println(int_numara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Long de�i�keninin alabilece�i maximum de�er aral���: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807");
			System.out.println("Ramde kaplad��� alan = 8 byte");
			System.out.println("Long de�i�ken atamas� yap�ld��� zaman sonuna (L) harfinin eklenmesi gerekir");
			System.out.println("�rnek ��kt� (long long_orneknumara = 54645546231654L;)");
			long long_orneknumara = 54645546231654L;
			System.out.println(long_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Float de�i�keni k�sa ondal�k say�lar i�in kullan�l�r");
			System.out.println("Ramde kaplad��� alan = 4 byte");
			System.out.println("Float de�i�ken atamas� yap�ld��� zaman sonuna (F) harfinin eklenmesi gerekir");
			System.out.println("�rnek ��kt� (float float_orneknumara = 24.542376F;)");
			float float_orneknumara = 24.542376F;
			System.out.println(float_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Double de�i�keni uzun ondal�k say�lar i�in kullan�l�r");
			System.out.println("Ramde kaplad��� alan = 8byte");
			System.out.println("�rnek ��kt� (double double_orneknumara = 24.54237656123145;)");
			double double_orneknumara = 24.54237656123145;
			System.out.println(double_orneknumara);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Char de�ikeni tekil karakter, i�aret veya ASCII de�eri alabilir");
			System.out.println("Ramde kaplad��� alan = 2byte");
			System.out.println("�rnek ��kt� (char char_degeri = 33;)");
			char char_degeri = 33;
			System.out.println("��kt� :" + char_degeri);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("String de�i�keni klavyeden g�nderilen t�m de�erleri alabilir");
			System.out.println("�rnek ��kt� (String string_degeri = Merhaba d�nya;)");
			String string_degeri = "Merhaba d�nya";
			System.out.println(string_degeri);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
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
			System.out.println("Boolen de�i�keni (true) veya (false) olarak de�er alabilir");
			System.out.println("Ramde kaplad��� alan = 1bit");
			System.out.println("�rnek ��kt� (boolean boolean_degeri = true;)");
			boolean boolean_degeri = true;
			System.out.println(boolean_degeri);
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 bir �st menu i�in 1 i tu�lay�n");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
				
				degiskentipleri();
				
			}
			
			
		}
		
	}//de�iken tipleri biti�
	
	
	
	
		public static void sayidogrulama() {//sayidogrulama ba�lang��
			
			byte ana_menu = 0;
			byte ust_menu = 1;
			
			Scanner sc = new Scanner (System.in);
			
			for (int i = 0; i < 20; ++i) System.out.println();

			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("De�er do�rulama ekrarn�na ho� geldiniz");
			System.out.println("--------------------------------------");
			System.out.println("");
			System.out.println("Ekranda yaz�l� olan de�eri l�tfen console �zerine yaz�n");
			int sayi = 1 + (int)(100 * Math.random());
			System.out.println("Yazman�z gereken de�er: " +sayi);
			
			int kullanici_degeri = sc.nextInt();
			
			System.out.println(kullanici_degeri==sayi);
			
			
			System.out.println("");
			System.out.print("Ana menu i�in 0 tekrar etmek i�in 1'i tu�lay�n");
			
			byte degisken_scanner = sc.nextByte();
			
			if (degisken_scanner == ana_menu) {
				
				for (int i = 0; i < 20; ++i) System.out.println();
				anamenu();
				
			}
			
           if (degisken_scanner == ust_menu) {
        	   
        	   for (int i = 0; i < 20; ++i) System.out.println();
        	   sayidogrulama();
				
			}
			
		}//sayidogrulama biti�
	
	

}//class biti�
