package HiEarth;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		ArrayList<Otomobil> otomobiller = new ArrayList();
		ArrayList<Ucak> ucaklar = new ArrayList();
		ArrayList<Bisiklet> bisikletler = new ArrayList();
		ArrayList<Gemi> gemiler = new ArrayList();
		ArrayList<CUcanGemi> ucanGemiler = new ArrayList();
		File file = new File("AracKayit.txt");
		Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler,file);
		
		
		
		

	}//main()
	private static void Arayuz1(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int myCase;
		System.out.println("Yapmak Ýstediðiniz Ýþlemi Seçiniz:");
		System.out.println("1: Veri Giriþinde Bulun");
		System.out.println("2: Veri Listele");
		System.out.println("3: Veri Güncelle");
		System.out.println("Çýkýþ");
		myCase = scanner.nextInt();
		switch(myCase) {
		case 1:
			VeriGirisi(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler,file);
			break;
		case 2:
			VeriListele(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler,file);
			break;
		case 3:
			VeriGüncelle(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler,file);
			break;
		default:  break;
		}
	}
	private static void VeriGirisi(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		String marka;
		String yakýtTürü;
		int hýz;
		int yolcuSayýsý;
		int tekerlekSayisi;
		Double fiyat;
		int üretimYýlý;
		String renk;
		String ID;
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
	    //writer.write("ID\tHýz\tRenk\tTekerlek Sayisi\tYakýtTürü\tYolcu Sayýsý\tÜretim Yýlý\tFiyat");
	    writer.newLine();
		Scanner scanner = new Scanner(System.in);
		int myCase;
		System.out.println("Veri giriþinde bulunacaðýnýz aracý seçiniz");
		System.out.println("1. Otomobil");
		System.out.println("2. Bisiklet");
		System.out.println("3. Gemi");
		System.out.println("4. Uçak");
		System.out.println("5. Uçan Gemi");
		System.out.println("Bir önceki menüye geri dön");
		System.out.println("Çýkýþ");
		myCase = scanner.nextInt();
		scanner.nextLine();
		int hýzDegisimi;
		int hýzSecimi;
		switch(myCase) {
		case 1://Otomobil
			System.out.println("Otomobil Ýçin Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yakýt Türü:");
			yakýtTürü = scanner.nextLine();
			System.out.println("Hýz:");
			hýz = scanner.nextInt();
			System.out.println("Yolcu Saysýný Giriniz:");
			yolcuSayýsý = scanner.nextInt();
			tekerlekSayisi = 4;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("Üretim Yýlý Giriniz:");
			üretimYýlý = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "otomobil"+Integer.toString(otomobiller.size()+1);
			System.out.println();
			otomobiller.add(new Otomobil(marka, yakýtTürü, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID));
			System.out.println("1. Yavaþla");
			System.out.println("2. Hýzlan");
			System.out.println("3. Dur");
			System.out.println("Çýkýþ");
			hýzSecimi =scanner.nextInt();
			scanner.nextLine();
			if(hýzSecimi == 1) {
				System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				otomobiller.get(otomobiller.size()-1).yavasla(hýzDegisimi);
			}
			else if(hýzSecimi == 2) {
				System.out.println("Ne kadar Hýzlanmak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				otomobiller.get(otomobiller.size()-1).hýzlan(hýzDegisimi);
			}
			else if(hýzSecimi == 3) {
				otomobiller.get(otomobiller.size()-1).dur();
			}
			writer.write(otomobiller.get(otomobiller.size()-1).getID()+"  "+otomobiller.get(otomobiller.size()-1).getHýz()+"  "+otomobiller.get(otomobiller.size()-1).getRenk()+"  "+otomobiller.get(otomobiller.size()-1).getTekerlekSayisi()+"  "+otomobiller.get(otomobiller.size()-1).getYakýtTürü()+"  "+otomobiller.get(otomobiller.size()-1).getYolcuSayýsý()+"  "+otomobiller.get(otomobiller.size()-1).getÜretimYýlý()+"  "+otomobiller.get(otomobiller.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 2://Bisiklet
			
			System.out.println("Bisiklet Ýçin Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Hýz:");
			hýz = scanner.nextInt();
			System.out.println("Yolcu Saysýný Giriniz:");
			yolcuSayýsý = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("Üretim Yýlý Giriniz:");
			üretimYýlý = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "bisiklet"+Integer.toString(bisikletler.size()+1);
			System.out.println();
			bisikletler.add(new Bisiklet(marka, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID));
			System.out.println("1. Yavaþla");
			System.out.println("2. Hýzlan");
			System.out.println("3. Dur");
			System.out.println("Çýkýþ");
			hýzSecimi =scanner.nextInt();
			scanner.nextLine();
			if(hýzSecimi == 1) {
				System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				bisikletler.get(bisikletler.size()-1).yavasla(hýzDegisimi);
			}
			else if(hýzSecimi == 2) {
				System.out.println("Ne kadar Hýzlanmak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				bisikletler.get(bisikletler.size()-1).hýzlan(hýzDegisimi);
			}
			else if(hýzSecimi == 3) {
				bisikletler.get(bisikletler.size()-1).dur();
			}
			writer.write(bisikletler.get(bisikletler.size()-1).getID()+"  "+bisikletler.get(bisikletler.size()-1).getHýz()+"  "+bisikletler.get(bisikletler.size()-1).getRenk()+"  "+bisikletler.get(bisikletler.size()-1).getTekerlekSayisi()+"  "+bisikletler.get(bisikletler.size()-1).getYakýtTürü()+"  "+bisikletler.get(bisikletler.size()-1).getYolcuSayýsý()+"  "+bisikletler.get(bisikletler.size()-1).getÜretimYýlý()+"  "+bisikletler.get(bisikletler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 3://Gemi
			
			System.out.println("Gemi Ýçin Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yakýt Türü:");
			yakýtTürü = scanner.nextLine();
			System.out.println("Hýz:");
			hýz = scanner.nextInt();
			System.out.println("Yolcu Saysýný Giriniz:");
			yolcuSayýsý = scanner.nextInt();
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("Üretim Yýlý Giriniz:");
			üretimYýlý = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "gemi"+Integer.toString(gemiler.size()+1);
			System.out.println();
			gemiler.add(new Gemi(marka, yakýtTürü, hýz, yolcuSayýsý, fiyat, üretimYýlý, renk, ID));
			System.out.println("1. Yavaþla");
			System.out.println("2. Hýzlan");
			System.out.println("3. Dur");
			System.out.println("Çýkýþ");
			hýzSecimi =scanner.nextInt();
			scanner.nextLine();
			if(hýzSecimi == 1) {
				System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				gemiler.get(gemiler.size()-1).yavasla(hýzDegisimi);
			}
			else if(hýzSecimi == 2) {
				System.out.println("Ne kadar Hýzlanmak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				gemiler.get(gemiler.size()-1).hýzlan(hýzDegisimi);
			}
			else if(hýzSecimi == 3) {
				gemiler.get(gemiler.size()-1).dur();
			}
			writer.write(gemiler.get(gemiler.size()-1).getID()+"  "+gemiler.get(gemiler.size()-1).getHýz()+"  "+gemiler.get(gemiler.size()-1).getRenk()+"  "+gemiler.get(gemiler.size()-1).getTekerlekSayisi()+"  "+gemiler.get(gemiler.size()-1).getYakýtTürü()+"  "+gemiler.get(gemiler.size()-1).getYolcuSayýsý()+"  "+gemiler.get(gemiler.size()-1).getÜretimYýlý()+"  "+gemiler.get(gemiler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 4://Ucak
			
			System.out.println("Ucak Ýçin Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yakýt Türü:");
			yakýtTürü = scanner.nextLine();
			System.out.println("Hýz:");
			hýz = scanner.nextInt();
			System.out.println("Yolcu Saysýný Giriniz:");
			yolcuSayýsý = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("Üretim Yýlý Giriniz:");
			üretimYýlý = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "Uçak"+Integer.toString(ucaklar.size()+1);
			System.out.println();
			ucaklar.add(new Ucak(marka, yakýtTürü, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID));
			System.out.println("1. Yavaþla");
			System.out.println("2. Hýzlan");
			System.out.println("3. Dur");
			System.out.println("Çýkýþ");
			hýzSecimi =scanner.nextInt();
			scanner.nextLine();
			if(hýzSecimi == 1) {
				System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucaklar.get(ucaklar.size()-1).yavasla(hýzDegisimi);
			}
			else if(hýzSecimi == 2) {
				System.out.println("Ne kadar Hýzlanmak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucaklar.get(ucaklar.size()-1).hýzlan(hýzDegisimi);
			}
			else if(hýzSecimi == 3) {
				if(ucaklar.get(ucaklar.size()-1).getHýz() > 300) {
					System.out.println("Bu Hýzda Duramazsýnýz Lütfen Önce Yavaþlayýn.(Durmak için azami hýz =300 km/h)");
					System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
					hýzDegisimi =scanner.nextInt();
					scanner.nextLine();
					ucaklar.get(ucaklar.size()-1).yavasla(hýzDegisimi);
				}
				else
					ucaklar.get(ucaklar.size()-1).dur();
			}
			writer.write(ucaklar.get(ucaklar.size()-1).getID()+"  "+ucaklar.get(ucaklar.size()-1).getHýz()+"  "+ucaklar.get(ucaklar.size()-1).getRenk()+"  "+ucaklar.get(ucaklar.size()-1).getTekerlekSayisi()+"  "+ucaklar.get(ucaklar.size()-1).getYakýtTürü()+"  "+ucaklar.get(ucaklar.size()-1).getYolcuSayýsý()+"  "+ucaklar.get(ucaklar.size()-1).getÜretimYýlý()+"  "+ucaklar.get(ucaklar.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 5://Ucan Gemi
			
			System.out.println("Uçan Gemi Ýçin Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yakýt Türü:");
			yakýtTürü = scanner.nextLine();
			System.out.println("Hýz:");
			hýz = scanner.nextInt();
			System.out.println("Yolcu Saysýný Giriniz:");
			yolcuSayýsý = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("Üretim Yýlý Giriniz:");
			üretimYýlý = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "Uçan Gemi"+Integer.toString(ucanGemiler.size()+1);
			System.out.println();
			ucanGemiler.add(new CUcanGemi(marka, yakýtTürü, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID));
			System.out.println("1. Yavaþla");
			System.out.println("2. Hýzlan");
			System.out.println("3. Dur");
			System.out.println("Çýkýþ");
			hýzSecimi =scanner.nextInt();
			scanner.nextLine();
			if(hýzSecimi == 1) {
				System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucanGemiler.get(ucanGemiler.size()-1).yavasla(hýzDegisimi);
			}
			else if(hýzSecimi == 2) {
				System.out.println("Ne kadar Hýzlanmak Ýstersiniz:");
				hýzDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucanGemiler.get(ucanGemiler.size()-1).hýzlan(hýzDegisimi);
			}
			else if(hýzSecimi == 3) {
				if(ucanGemiler.get(ucanGemiler.size()-1).getHýz() > 300) {
					System.out.println("Bu Hýzda Duramazsýnýz Lütfen Önce Yavaþlayýn. (Durmak için azami hýz =300 km/h)");
					System.out.println("Ne kadar Yavaþlamak Ýstersiniz:");
					hýzDegisimi =scanner.nextInt();
					scanner.nextLine();
					ucanGemiler.get(ucanGemiler.size()-1).yavasla(hýzDegisimi);
				}
				else
					ucanGemiler.get(ucanGemiler.size()-1).dur();
			}
			writer.write(ucanGemiler.get(ucanGemiler.size()-1).getID()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getHýz()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getRenk()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getTekerlekSayisi()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getYakýtTürü()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getYolcuSayýsý()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getÜretimYýlý()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 6://Önceki Menü
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			break;
		default:  break;
		}
		writer.close();
	}
	private static void VeriListele(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int myCase;
		System.out.println("Listelemek Ýstediðiniz Veri Tipini Seçiniz");
		System.out.println("1. Kara Taþýtlarý");
		System.out.println("2. Deniz Taþýtlarý");
		System.out.println("3. Hava Taþýtlarý");
		System.out.println("Bir önceki menüye geri dön");
		System.out.println("Çýkýþ");
		myCase = scanner.nextInt();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String cumle;
		switch(myCase) {
		case 1://KaraTasitlarý
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("otomobil") || cumle.contains("bisiklet")){
					System.out.println(cumle);
				}
			}
			break;
		case 2://DenizTasitlarý
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("Uçan") || cumle.contains("gemi")){
					System.out.println(cumle);
				}
			}
			
			break;
		case 3:
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("Uçan") || cumle.contains("Uçak"))
					System.out.println(cumle);
			}
			
			break;
		case 4:
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			break;
		default:  break;
		}
	}
	private static void VeriGüncelle(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		File temp = new File("tempFile.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp,true));
		BufferedReader reader = new BufferedReader(new FileReader(file));
		//BufferedWriter writers = new BufferedWriter(new FileWriter(file,true));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellemek Ýstediðiniz Verinin ID'sini Giriniz:");
		String ID = scanner.nextLine();
		String cumle;
		String[] splitString;
		int MyCase;
		int counter = 0;
		while(reader.readLine()!=null) {
			counter++;
			cumle = reader.readLine();
			splitString = cumle.split(" ");
			char[] index= new char[1];
			if(splitString[0].equals(ID)) {
				if(splitString[0].contains("otomobil")) {
					System.out.println("Güncellemek Ýstediðiniz Veriyi Seçiniz:");
					System.out.println("1. Hýz");
					System.out.println("2. Renk");
					System.out.println("3. YakýtTürü");
					System.out.println("4. Yolcu Sayýsý");
					System.out.println("5. Üretim Yýlý");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//Hýz
							System.out.println("Güncel Hýzý Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("Güncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yakýt
							System.out.println("Güncel Yakýt Türünü Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("Güncel Yolcu Sayýsný Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//Üretim yýlý
							System.out.println("Güncel Üretim Yýlýný Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("Güncel Fiyatý Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
					//System.out.println(otomobiller.get(Integer.parseInt(splitString[0].substring(8))).getID());
				}
				else if(splitString[0].contains("bisiklet")){
					System.out.println("Güncellemek Ýstediðiniz Veriyi Seçiniz:");
					System.out.println("1. Hýz");
					System.out.println("2. Renk");
					System.out.println("3. Yolcu Sayýsý");
					System.out.println("4. Üretim Yýlý");
					System.out.println("5. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//Hýz
							System.out.println("Güncel Hýzý Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("Güncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 5:{//Yolcu
							System.out.println("Güncel Yolcu Sayýsný Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 6:{//Üretim yýlý
							System.out.println("Güncel Üretim Yýlýný Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 7:{//Fiyat
							System.out.println("Güncel Fiyatý Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("Uçaak")){
					System.out.println("Güncellemek Ýstediðiniz Veriyi Seçiniz:");
					System.out.println("1. Hýz");
					System.out.println("2. Renk");
					System.out.println("3. YakýtTürü");
					System.out.println("4. Yolcu Sayýsý");
					System.out.println("5. Üretim Yýlý");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//Hýz
							System.out.println("Güncel Hýzý Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("Güncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yakýt
							System.out.println("Güncel Yakýt Türünü Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("Güncel Yolcu Sayýsný Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//Üretim yýlý
							System.out.println("Güncel Üretim Yýlýný Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("Güncel Fiyatý Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("gemi")){
					System.out.println("Güncellemek Ýstediðiniz Veriyi Seçiniz:");
					System.out.println("1. Hýz");
					System.out.println("2. Renk");
					System.out.println("3. YakýtTürü");
					System.out.println("4. Yolcu Sayýsý");
					System.out.println("5. Üretim Yýlý");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//Hýz
							System.out.println("Güncel Hýzý Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("Güncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yakýt
							System.out.println("Güncel Yakýt Türünü Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("Güncel Yolcu Sayýsný Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//Üretim yýlý
							System.out.println("Güncel Üretim Yýlýný Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("Güncel Fiyatý Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("Uçan Gemi")){
					System.out.println("Güncellemek Ýstediðiniz Veriyi Seçiniz:");
					System.out.println("1. Hýz");
					System.out.println("2. Renk");
					System.out.println("3. YakýtTürü");
					System.out.println("4. Yolcu Sayýsý");
					System.out.println("5. Üretim Yýlý");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//Hýz
							System.out.println("Güncel Hýzý Giriniz:");
							splitString[1]="";
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("Güncel Rengi Giriniz:");
							splitString[2]="";
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yakýt
							System.out.println("Güncel Yakýt Türünü Giriniz:");
							splitString[4]="";
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("Güncel Yolcu Sayýsný Giriniz:");
							splitString[5]="";
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//Üretim yýlý
							System.out.println("Güncel Üretim Yýlýný Giriniz:");
							splitString[6]="";
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("Güncel Fiyatý Giriniz:");
							splitString[7]="";
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				cumle = "";
				for (int i = 0; i < splitString.length; i++) {
					cumle += splitString[i];
					cumle +=" ";
				}
				writer.write(cumle);
				writer.newLine();
			}
			else {
				writer.write(cumle);
				writer.newLine();
			}
		}
		writer.close();
	}
}//Main Class
