package HiEarth;

public interface IArac {
	public void getMarka();
	public int getHýz();
	public void setHýz(int hýz);
	public int getYolcuSayýsý();
	public void setYolcuSayýsý(int yolcuSayýsý);
	public String getYakýtTürü();
	public int getTekerlekSayisi();
	public Double getFiyat();
	public int getÜretimYýlý();
	public String getRenk();
	public String getID();
	public void setID(String iD);
	public void setMarka(String marka);
	public void setYakýtTürü(String yakýtTürü);
	public void setTekerlekSayisi(int tekerlekSayisi);
	public void setFiyat(Double fiyat);
	public void setÜretimYýlý(int üretimYýlý);
	public void setRenk(String renk);
	public void yavasla(int Hýz);
	public void hýzlan(int Hýz);
	public void dur();
}
