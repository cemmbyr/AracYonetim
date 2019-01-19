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
		System.out.println("Yapmak �stedi�iniz ��lemi Se�iniz:");
		System.out.println("1: Veri Giri�inde Bulun");
		System.out.println("2: Veri Listele");
		System.out.println("3: Veri G�ncelle");
		System.out.println("��k��");
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
			VeriG�ncelle(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler,file);
			break;
		default:  break;
		}
	}
	private static void VeriGirisi(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		String marka;
		String yak�tT�r�;
		int h�z;
		int yolcuSay�s�;
		int tekerlekSayisi;
		Double fiyat;
		int �retimY�l�;
		String renk;
		String ID;
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
	    //writer.write("ID\tH�z\tRenk\tTekerlek Sayisi\tYak�tT�r�\tYolcu Say�s�\t�retim Y�l�\tFiyat");
	    writer.newLine();
		Scanner scanner = new Scanner(System.in);
		int myCase;
		System.out.println("Veri giri�inde bulunaca��n�z arac� se�iniz");
		System.out.println("1. Otomobil");
		System.out.println("2. Bisiklet");
		System.out.println("3. Gemi");
		System.out.println("4. U�ak");
		System.out.println("5. U�an Gemi");
		System.out.println("Bir �nceki men�ye geri d�n");
		System.out.println("��k��");
		myCase = scanner.nextInt();
		scanner.nextLine();
		int h�zDegisimi;
		int h�zSecimi;
		switch(myCase) {
		case 1://Otomobil
			System.out.println("Otomobil ��in Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yak�t T�r�:");
			yak�tT�r� = scanner.nextLine();
			System.out.println("H�z:");
			h�z = scanner.nextInt();
			System.out.println("Yolcu Says�n� Giriniz:");
			yolcuSay�s� = scanner.nextInt();
			tekerlekSayisi = 4;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("�retim Y�l� Giriniz:");
			�retimY�l� = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "otomobil"+Integer.toString(otomobiller.size()+1);
			System.out.println();
			otomobiller.add(new Otomobil(marka, yak�tT�r�, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID));
			System.out.println("1. Yava�la");
			System.out.println("2. H�zlan");
			System.out.println("3. Dur");
			System.out.println("��k��");
			h�zSecimi =scanner.nextInt();
			scanner.nextLine();
			if(h�zSecimi == 1) {
				System.out.println("Ne kadar Yava�lamak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				otomobiller.get(otomobiller.size()-1).yavasla(h�zDegisimi);
			}
			else if(h�zSecimi == 2) {
				System.out.println("Ne kadar H�zlanmak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				otomobiller.get(otomobiller.size()-1).h�zlan(h�zDegisimi);
			}
			else if(h�zSecimi == 3) {
				otomobiller.get(otomobiller.size()-1).dur();
			}
			writer.write(otomobiller.get(otomobiller.size()-1).getID()+"  "+otomobiller.get(otomobiller.size()-1).getH�z()+"  "+otomobiller.get(otomobiller.size()-1).getRenk()+"  "+otomobiller.get(otomobiller.size()-1).getTekerlekSayisi()+"  "+otomobiller.get(otomobiller.size()-1).getYak�tT�r�()+"  "+otomobiller.get(otomobiller.size()-1).getYolcuSay�s�()+"  "+otomobiller.get(otomobiller.size()-1).get�retimY�l�()+"  "+otomobiller.get(otomobiller.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 2://Bisiklet
			
			System.out.println("Bisiklet ��in Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("H�z:");
			h�z = scanner.nextInt();
			System.out.println("Yolcu Says�n� Giriniz:");
			yolcuSay�s� = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("�retim Y�l� Giriniz:");
			�retimY�l� = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "bisiklet"+Integer.toString(bisikletler.size()+1);
			System.out.println();
			bisikletler.add(new Bisiklet(marka, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID));
			System.out.println("1. Yava�la");
			System.out.println("2. H�zlan");
			System.out.println("3. Dur");
			System.out.println("��k��");
			h�zSecimi =scanner.nextInt();
			scanner.nextLine();
			if(h�zSecimi == 1) {
				System.out.println("Ne kadar Yava�lamak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				bisikletler.get(bisikletler.size()-1).yavasla(h�zDegisimi);
			}
			else if(h�zSecimi == 2) {
				System.out.println("Ne kadar H�zlanmak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				bisikletler.get(bisikletler.size()-1).h�zlan(h�zDegisimi);
			}
			else if(h�zSecimi == 3) {
				bisikletler.get(bisikletler.size()-1).dur();
			}
			writer.write(bisikletler.get(bisikletler.size()-1).getID()+"  "+bisikletler.get(bisikletler.size()-1).getH�z()+"  "+bisikletler.get(bisikletler.size()-1).getRenk()+"  "+bisikletler.get(bisikletler.size()-1).getTekerlekSayisi()+"  "+bisikletler.get(bisikletler.size()-1).getYak�tT�r�()+"  "+bisikletler.get(bisikletler.size()-1).getYolcuSay�s�()+"  "+bisikletler.get(bisikletler.size()-1).get�retimY�l�()+"  "+bisikletler.get(bisikletler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 3://Gemi
			
			System.out.println("Gemi ��in Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yak�t T�r�:");
			yak�tT�r� = scanner.nextLine();
			System.out.println("H�z:");
			h�z = scanner.nextInt();
			System.out.println("Yolcu Says�n� Giriniz:");
			yolcuSay�s� = scanner.nextInt();
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("�retim Y�l� Giriniz:");
			�retimY�l� = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "gemi"+Integer.toString(gemiler.size()+1);
			System.out.println();
			gemiler.add(new Gemi(marka, yak�tT�r�, h�z, yolcuSay�s�, fiyat, �retimY�l�, renk, ID));
			System.out.println("1. Yava�la");
			System.out.println("2. H�zlan");
			System.out.println("3. Dur");
			System.out.println("��k��");
			h�zSecimi =scanner.nextInt();
			scanner.nextLine();
			if(h�zSecimi == 1) {
				System.out.println("Ne kadar Yava�lamak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				gemiler.get(gemiler.size()-1).yavasla(h�zDegisimi);
			}
			else if(h�zSecimi == 2) {
				System.out.println("Ne kadar H�zlanmak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				gemiler.get(gemiler.size()-1).h�zlan(h�zDegisimi);
			}
			else if(h�zSecimi == 3) {
				gemiler.get(gemiler.size()-1).dur();
			}
			writer.write(gemiler.get(gemiler.size()-1).getID()+"  "+gemiler.get(gemiler.size()-1).getH�z()+"  "+gemiler.get(gemiler.size()-1).getRenk()+"  "+gemiler.get(gemiler.size()-1).getTekerlekSayisi()+"  "+gemiler.get(gemiler.size()-1).getYak�tT�r�()+"  "+gemiler.get(gemiler.size()-1).getYolcuSay�s�()+"  "+gemiler.get(gemiler.size()-1).get�retimY�l�()+"  "+gemiler.get(gemiler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 4://Ucak
			
			System.out.println("Ucak ��in Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yak�t T�r�:");
			yak�tT�r� = scanner.nextLine();
			System.out.println("H�z:");
			h�z = scanner.nextInt();
			System.out.println("Yolcu Says�n� Giriniz:");
			yolcuSay�s� = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("�retim Y�l� Giriniz:");
			�retimY�l� = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "U�ak"+Integer.toString(ucaklar.size()+1);
			System.out.println();
			ucaklar.add(new Ucak(marka, yak�tT�r�, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID));
			System.out.println("1. Yava�la");
			System.out.println("2. H�zlan");
			System.out.println("3. Dur");
			System.out.println("��k��");
			h�zSecimi =scanner.nextInt();
			scanner.nextLine();
			if(h�zSecimi == 1) {
				System.out.println("Ne kadar Yava�lamak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucaklar.get(ucaklar.size()-1).yavasla(h�zDegisimi);
			}
			else if(h�zSecimi == 2) {
				System.out.println("Ne kadar H�zlanmak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucaklar.get(ucaklar.size()-1).h�zlan(h�zDegisimi);
			}
			else if(h�zSecimi == 3) {
				if(ucaklar.get(ucaklar.size()-1).getH�z() > 300) {
					System.out.println("Bu H�zda Duramazs�n�z L�tfen �nce Yava�lay�n.(Durmak i�in azami h�z =300 km/h)");
					System.out.println("Ne kadar Yava�lamak �stersiniz:");
					h�zDegisimi =scanner.nextInt();
					scanner.nextLine();
					ucaklar.get(ucaklar.size()-1).yavasla(h�zDegisimi);
				}
				else
					ucaklar.get(ucaklar.size()-1).dur();
			}
			writer.write(ucaklar.get(ucaklar.size()-1).getID()+"  "+ucaklar.get(ucaklar.size()-1).getH�z()+"  "+ucaklar.get(ucaklar.size()-1).getRenk()+"  "+ucaklar.get(ucaklar.size()-1).getTekerlekSayisi()+"  "+ucaklar.get(ucaklar.size()-1).getYak�tT�r�()+"  "+ucaklar.get(ucaklar.size()-1).getYolcuSay�s�()+"  "+ucaklar.get(ucaklar.size()-1).get�retimY�l�()+"  "+ucaklar.get(ucaklar.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 5://Ucan Gemi
			
			System.out.println("U�an Gemi ��in Gereken Verileri Giriniz:");
			System.out.println("Marka:");
			marka = scanner.nextLine();
			System.out.println("Yak�t T�r�:");
			yak�tT�r� = scanner.nextLine();
			System.out.println("H�z:");
			h�z = scanner.nextInt();
			System.out.println("Yolcu Says�n� Giriniz:");
			yolcuSay�s� = scanner.nextInt();
			tekerlekSayisi = 2;
			System.out.println("Fiyat Giriniz:");
			fiyat = scanner.nextDouble();
			System.out.println("�retim Y�l� Giriniz:");
			�retimY�l� = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Renk Giriniz:");
			renk = scanner.nextLine();
			ID = "U�an Gemi"+Integer.toString(ucanGemiler.size()+1);
			System.out.println();
			ucanGemiler.add(new CUcanGemi(marka, yak�tT�r�, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID));
			System.out.println("1. Yava�la");
			System.out.println("2. H�zlan");
			System.out.println("3. Dur");
			System.out.println("��k��");
			h�zSecimi =scanner.nextInt();
			scanner.nextLine();
			if(h�zSecimi == 1) {
				System.out.println("Ne kadar Yava�lamak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucanGemiler.get(ucanGemiler.size()-1).yavasla(h�zDegisimi);
			}
			else if(h�zSecimi == 2) {
				System.out.println("Ne kadar H�zlanmak �stersiniz:");
				h�zDegisimi =scanner.nextInt();
				scanner.nextLine();
				ucanGemiler.get(ucanGemiler.size()-1).h�zlan(h�zDegisimi);
			}
			else if(h�zSecimi == 3) {
				if(ucanGemiler.get(ucanGemiler.size()-1).getH�z() > 300) {
					System.out.println("Bu H�zda Duramazs�n�z L�tfen �nce Yava�lay�n. (Durmak i�in azami h�z =300 km/h)");
					System.out.println("Ne kadar Yava�lamak �stersiniz:");
					h�zDegisimi =scanner.nextInt();
					scanner.nextLine();
					ucanGemiler.get(ucanGemiler.size()-1).yavasla(h�zDegisimi);
				}
				else
					ucanGemiler.get(ucanGemiler.size()-1).dur();
			}
			writer.write(ucanGemiler.get(ucanGemiler.size()-1).getID()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getH�z()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getRenk()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getTekerlekSayisi()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getYak�tT�r�()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getYolcuSay�s�()+"  "+ucanGemiler.get(ucanGemiler.size()-1).get�retimY�l�()+"  "+ucanGemiler.get(ucanGemiler.size()-1).getFiyat()+"\n");
		    writer.close();
			break;
		case 6://�nceki Men�
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			break;
		default:  break;
		}
		writer.close();
	}
	private static void VeriListele(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int myCase;
		System.out.println("Listelemek �stedi�iniz Veri Tipini Se�iniz");
		System.out.println("1. Kara Ta��tlar�");
		System.out.println("2. Deniz Ta��tlar�");
		System.out.println("3. Hava Ta��tlar�");
		System.out.println("Bir �nceki men�ye geri d�n");
		System.out.println("��k��");
		myCase = scanner.nextInt();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String cumle;
		switch(myCase) {
		case 1://KaraTasitlar�
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("otomobil") || cumle.contains("bisiklet")){
					System.out.println(cumle);
				}
			}
			break;
		case 2://DenizTasitlar�
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("U�an") || cumle.contains("gemi")){
					System.out.println(cumle);
				}
			}
			
			break;
		case 3:
			while(reader.readLine()!=null){
				cumle=reader.readLine();
				if(cumle.contains("U�an") || cumle.contains("U�ak"))
					System.out.println(cumle);
			}
			
			break;
		case 4:
			Arayuz1(otomobiller, ucaklar, bisikletler, gemiler, ucanGemiler, file);
			break;
		default:  break;
		}
	}
	private static void VeriG�ncelle(ArrayList<Otomobil> otomobiller, ArrayList<Ucak> ucaklar, ArrayList<Bisiklet> bisikletler, ArrayList<Gemi> gemiler, ArrayList<CUcanGemi> ucanGemiler, File file) throws IOException {
		File temp = new File("tempFile.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp,true));
		BufferedReader reader = new BufferedReader(new FileReader(file));
		//BufferedWriter writers = new BufferedWriter(new FileWriter(file,true));
		Scanner scanner = new Scanner(System.in);
		System.out.println("G�ncellemek �stedi�iniz Verinin ID'sini Giriniz:");
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
					System.out.println("G�ncellemek �stedi�iniz Veriyi Se�iniz:");
					System.out.println("1. H�z");
					System.out.println("2. Renk");
					System.out.println("3. Yak�tT�r�");
					System.out.println("4. Yolcu Say�s�");
					System.out.println("5. �retim Y�l�");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//H�z
							System.out.println("G�ncel H�z� Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("G�ncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yak�t
							System.out.println("G�ncel Yak�t T�r�n� Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("G�ncel Yolcu Say�sn� Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//�retim y�l�
							System.out.println("G�ncel �retim Y�l�n� Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("G�ncel Fiyat� Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
					//System.out.println(otomobiller.get(Integer.parseInt(splitString[0].substring(8))).getID());
				}
				else if(splitString[0].contains("bisiklet")){
					System.out.println("G�ncellemek �stedi�iniz Veriyi Se�iniz:");
					System.out.println("1. H�z");
					System.out.println("2. Renk");
					System.out.println("3. Yolcu Say�s�");
					System.out.println("4. �retim Y�l�");
					System.out.println("5. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//H�z
							System.out.println("G�ncel H�z� Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("G�ncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 5:{//Yolcu
							System.out.println("G�ncel Yolcu Say�sn� Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 6:{//�retim y�l�
							System.out.println("G�ncel �retim Y�l�n� Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 7:{//Fiyat
							System.out.println("G�ncel Fiyat� Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("U�aak")){
					System.out.println("G�ncellemek �stedi�iniz Veriyi Se�iniz:");
					System.out.println("1. H�z");
					System.out.println("2. Renk");
					System.out.println("3. Yak�tT�r�");
					System.out.println("4. Yolcu Say�s�");
					System.out.println("5. �retim Y�l�");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//H�z
							System.out.println("G�ncel H�z� Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("G�ncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yak�t
							System.out.println("G�ncel Yak�t T�r�n� Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("G�ncel Yolcu Say�sn� Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//�retim y�l�
							System.out.println("G�ncel �retim Y�l�n� Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("G�ncel Fiyat� Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("gemi")){
					System.out.println("G�ncellemek �stedi�iniz Veriyi Se�iniz:");
					System.out.println("1. H�z");
					System.out.println("2. Renk");
					System.out.println("3. Yak�tT�r�");
					System.out.println("4. Yolcu Say�s�");
					System.out.println("5. �retim Y�l�");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//H�z
							System.out.println("G�ncel H�z� Giriniz:");
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("G�ncel Rengi Giriniz:");
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yak�t
							System.out.println("G�ncel Yak�t T�r�n� Giriniz:");
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("G�ncel Yolcu Say�sn� Giriniz:");
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//�retim y�l�
							System.out.println("G�ncel �retim Y�l�n� Giriniz:");
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("G�ncel Fiyat� Giriniz:");
							splitString[7] = scanner.nextLine();
							break;
						}
					}
				}
				else if(splitString[0].contains("U�an Gemi")){
					System.out.println("G�ncellemek �stedi�iniz Veriyi Se�iniz:");
					System.out.println("1. H�z");
					System.out.println("2. Renk");
					System.out.println("3. Yak�tT�r�");
					System.out.println("4. Yolcu Say�s�");
					System.out.println("5. �retim Y�l�");
					System.out.println("6. Fiyat");
					MyCase = scanner.nextInt();
					scanner.nextLine();
					switch(MyCase){
						case 1:{//H�z
							System.out.println("G�ncel H�z� Giriniz:");
							splitString[1]="";
							splitString[1] = scanner.nextLine();
							break;
						}
						case 2:{//Renk
							System.out.println("G�ncel Rengi Giriniz:");
							splitString[2]="";
							splitString[2] = scanner.nextLine();
							break;
						}
						case 3:{//Yak�t
							System.out.println("G�ncel Yak�t T�r�n� Giriniz:");
							splitString[4]="";
							splitString[4] = scanner.nextLine();
							break;
						}
						case 4:{//Yolcu
							System.out.println("G�ncel Yolcu Say�sn� Giriniz:");
							splitString[5]="";
							splitString[5] = scanner.nextLine();
							break;
						}
						case 5:{//�retim y�l�
							System.out.println("G�ncel �retim Y�l�n� Giriniz:");
							splitString[6]="";
							splitString[6] = scanner.nextLine();
							break;
						}
						case 6:{//Fiyat
							System.out.println("G�ncel Fiyat� Giriniz:");
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
