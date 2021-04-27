package cz.czechitas.java2webapps.lekce4.entity;

/**
 * Informace o účastníkovi kurzu.
 */
public class Ucastnik {
  private String jmeno;
  private String prijmeni;
  private String bydliste;
  private Pohlavi pohlavi;

  private String fotka;

  public Ucastnik() {
  }

  public Ucastnik(String jmeno, String prijmeni, String bydliste, Pohlavi pohlavi, String fotka) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.bydliste = bydliste;
    this.pohlavi = pohlavi;
    this.fotka = fotka;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }

  public String getBydliste() {
    return bydliste;
  }

  public void setBydliste(String bydliste) {
    this.bydliste = bydliste;
  }

  public Pohlavi getPohlavi() {
    return pohlavi;
  }

  public void setPohlavi(Pohlavi pohlavi) {
    this.pohlavi = pohlavi;
  }

  public String getFotka() {
    return fotka;
  }

  public void setFotka(String fotka) {
    this.fotka = fotka;
  }


//  počítaná vlastnost, která je jen pro čtení
//  nemá field, stačí, když jem tam getter
  public String getCeleJmeno() {
    return jmeno + " " + prijmeni;
  }
}
