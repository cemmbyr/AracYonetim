package HiEarth;

public abstract class CHavaTasitlari extends CArac implements IHavaTasitlari{
	public CHavaTasitlari(String marka, String yakýtTürü, int hýz, int yolcuSayýsý, int tekerlekSayisi, Double fiyat, int üretimYýlý, String renk, String ID) {
		super(marka, yakýtTürü, hýz, yolcuSayýsý, tekerlekSayisi, fiyat, üretimYýlý, renk, ID);
	}
}
