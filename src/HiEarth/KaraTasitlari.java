package HiEarth;

public abstract class KaraTasitlari extends CArac{
	public KaraTasitlari() {
		super();
	}
	public KaraTasitlari(String marka, String yakýtTürü, int hýz, int yolcuSayýsý, int tekerlekSayisi, Double fiyat,
			int üretimYýlý, String renk, String ID) {
		super(marka, yakýtTürü, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID);
	}
	public KaraTasitlari(String marka, int hýz, int yolcuSayýsý, int tekerlekSayisi, Double fiyat, int üretimYýlý, String renk, String ID) {
		super(marka, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID);
	}
}
