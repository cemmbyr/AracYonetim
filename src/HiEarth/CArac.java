package HiEarth;

public class CArac implements IArac{
	private String Marka;
	private String Yak�tT�r�;
	private int H�z;
	private int YolcuSay�s�;
	private int TekerlekSayisi;
	private Double Fiyat;
	private int �retimY�l�;
	private String Renk;
	private String ID;
	public CArac() {
		this.Marka = "Bilinmiyor";
		this.Yak�tT�r� = "Bilinmiyor";
		this.H�z = 0;
		this.YolcuSay�s� = 0;
		this.TekerlekSayisi = 0;
		this.Fiyat = 0.0;
		this.�retimY�l� = 0;
		this.Renk = "Bilinmiyor";
		this.ID = "Bilinmiyor";
	}
	public CArac(String marka, String yak�tT�r�, int h�z, int yolcuSay�s�, int tekerlekSayisi, Double fiyat,
			int �retimY�l�, String renk, String ID) {//Genel Constructor
		this.Marka = marka;
		this.Yak�tT�r� = yak�tT�r�;
		this.H�z = h�z;
		this.YolcuSay�s� = yolcuSay�s�;
		this.TekerlekSayisi = tekerlekSayisi;
		this.Fiyat = fiyat;
		this.�retimY�l� = �retimY�l�;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String marka, int h�z, int yolcuSay�s�, int tekerlekSayisi, Double fiyat,
			int �retimY�l�, String renk, String ID) {//Motorsuzlar i�in
		this.Marka = marka;
		this.H�z = h�z;
		this.YolcuSay�s� = yolcuSay�s�;
		this.TekerlekSayisi = tekerlekSayisi;
		this.Fiyat = fiyat;
		this.�retimY�l� = �retimY�l�;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String marka, String yak�tT�r�, int h�z, int yolcuSay�s�, Double fiyat,
			int �retimY�l�, String renk, String ID) {//Tekerleksizler i�in
		this.Marka = marka;
		this.Yak�tT�r� = yak�tT�r�;
		this.H�z = h�z;
		this.YolcuSay�s� = yolcuSay�s�;
		this.Fiyat = fiyat;
		this.�retimY�l� = �retimY�l�;
		this.Renk = renk;
		this.ID = ID;
	}
	public CArac(String gelenMarka) {
		this.Marka = gelenMarka;
	}
	public void getMarka() {
		System.out.println(this.Marka);
	}
	public int getH�z() {
		return this.H�z;
	}
	public void setH�z(int h�z) {
		this.H�z = h�z;
	}
	public int getYolcuSay�s�() {
		return this.YolcuSay�s�;
	}
	public void setYolcuSay�s�(int yolcuSay�s�) {
		this.YolcuSay�s� = yolcuSay�s�;
	}
	public String getYak�tT�r�() {
		return this.Yak�tT�r�;
	}
	public int getTekerlekSayisi() {
		return this.TekerlekSayisi;
	}
	public Double getFiyat() {
		return this.Fiyat;
	}
	public int get�retimY�l�() {
		return this.�retimY�l�;
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
	public void setYak�tT�r�(String yak�tT�r�) {
		Yak�tT�r� = yak�tT�r�;
	}
	public void setTekerlekSayisi(int tekerlekSayisi) {
		TekerlekSayisi = tekerlekSayisi;
	}
	public void setFiyat(Double fiyat) {
		Fiyat = fiyat;
	}
	public void set�retimY�l�(int �retimY�l�) {
		�retimY�l� = �retimY�l�;
	}
	public void setRenk(String renk) {
		Renk = renk;
	}
	public void yavasla(int H�z) {
		this.H�z -= H�z;
	}
	public void h�zlan(int H�z) {
		this.H�z +=  H�z;
	}
	public void dur(){
		this.H�z = 0;
	}
}
