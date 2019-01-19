package HiEarth;

public class CArac implements IArac{
	private String Marka;
	private String YakýtTürü;
	private int Hýz;
	private int YolcuSayýsý;
	private int TekerlekSayisi;
	private Double Fiyat;
	private int ÜretimYýlý;
	private String Renk;
	private String ID;
	public CArac() {
		this.Marka = "Bilinmiyor";
		this.YakýtTürü = "Bilinmiyor";
		this.Hýz = 0;
		this.YolcuSayýsý = 0;
		this.TekerlekSayisi = 0;
		this.Fiyat = 0.0;
		this.ÜretimYýlý = 0;
		this.Renk = "Bilinmiyor";
		this.ID = "Bilinmiyor";
	}
	public CArac(String marka, String yakýtTürü, int hýz, int yolcuSayýsý, int tekerlekSayisi, Double fiyat,
			int üretimYýlý, String renk, String ID) {//Genel Constructor
		this.Marka = marka;
		this.YakýtTürü = yakýtTürü;
		this.Hýz = hýz;
		this.YolcuSayýsý = yolcuSayýsý;
		this.TekerlekSayisi = tekerlekSayisi;
		this.Fiyat = fiyat;
		this.ÜretimYýlý = üretimYýlý;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String marka, int hýz, int yolcuSayýsý, int tekerlekSayisi, Double fiyat,
			int üretimYýlý, String renk, String ID) {//Motorsuzlar için
		this.Marka = marka;
		this.Hýz = hýz;
		this.YolcuSayýsý = yolcuSayýsý;
		this.TekerlekSayisi = tekerlekSayisi;
		this.Fiyat = fiyat;
		this.ÜretimYýlý = üretimYýlý;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String marka, String yakýtTürü, int hýz, int yolcuSayýsý, Double fiyat,
			int üretimYýlý, String renk, String ID) {//Tekerleksizler için
		this.Marka = marka;
		this.YakýtTürü = yakýtTürü;
		this.Hýz = hýz;
		this.YolcuSayýsý = yolcuSayýsý;
		this.Fiyat = fiyat;
		this.ÜretimYýlý = üretimYýlý;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String gelenMarka) {
		this.Marka = gelenMarka;
	}
	public void getMarka() {
		System.out.println(this.Marka);
	}
	public int getHýz() {
		return this.Hýz;
	}
	public void setHýz(int hýz) {
		this.Hýz = hýz;
	}
	public int getYolcuSayýsý() {
		return this.YolcuSayýsý;
	}
	public void setYolcuSayýsý(int yolcuSayýsý) {
		this.YolcuSayýsý = yolcuSayýsý;
	}
	public String getYakýtTürü() {
		return this.YakýtTürü;
	}
	public int getTekerlekSayisi() {
		return this.TekerlekSayisi;
	}
	public Double getFiyat() {
		return this.Fiyat;
	}
	public int getÜretimYýlý() {
		return this.ÜretimYýlý;
	}
	public String getRenk() {
		return this.Renk;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setMarka(String marka) {
		Marka = marka;
	}
	public void setYakýtTürü(String yakýtTürü) {
		YakýtTürü = yakýtTürü;
	}
	public void setTekerlekSayisi(int tekerlekSayisi) {
		TekerlekSayisi = tekerlekSayisi;
	}
	public void setFiyat(Double fiyat) {
		Fiyat = fiyat;
	}
	public void setÜretimYýlý(int üretimYýlý) {
		ÜretimYýlý = üretimYýlý;
	}
	public void setRenk(String renk) {
		Renk = renk;
	}
	public void yavasla(int Hýz) {
		this.Hýz -= Hýz;
	}
	public void hýzlan(int Hýz) {
		this.Hýz +=  Hýz;
	}
	public void dur(){
		this.Hýz = 0;
	}
}
