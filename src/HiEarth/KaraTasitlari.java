package HiEarth;

public abstract class KaraTasitlari extends CArac{
	public KaraTasitlari() {
		super();
	}
	public KaraTasitlari(String marka, String yak�tT�r�, int h�z, int yolcuSay�s�, int tekerlekSayisi, Double fiyat,
			int �retimY�l�, String renk, String ID) {
		super(marka, yak�tT�r�, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID);
	}
	public KaraTasitlari(String marka, int h�z, int yolcuSay�s�, int tekerlekSayisi, Double fiyat, int �retimY�l�, String renk, String ID) {
		super(marka, h�z, yolcuSay�s�, tekerlekSayisi, fiyat, �retimY�l�, renk, ID);
	}
}
