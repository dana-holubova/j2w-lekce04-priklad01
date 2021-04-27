package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Pohlavi;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci účastníků.
 */
@Controller()
//na controlleru je RequestMapping, protože je mi jedno, jestli se použije metoda get nebo post
@RequestMapping("/ucastnici")
//@RequestMapping je obecnější než @GetMapping nebo @PostMapping. Může mít víc parametrů. Parametr method říká
//jestli se použije get nebo post
//@RequestMapping(value = "/ucastnici", method= RequestMethod.GET)
public class UcastniciController {
  private final List<Ucastnik> ucastnici;

  public UcastniciController() {
//    zde tvořím list, který obsahuje objekty typu Ucastnik a rovnou je přes parametry plním konkrétními hodnotami
    ucastnici = Arrays.asList(
            new Ucastnik("Panenka", "Maková", "Mákovice", Pohlavi.ZENA, "https://www.postavy.cz/foto/makova-panenka-foto.jpg"),
            new Ucastnik("Emanuel", "Motýl", "Luční Bouda", Pohlavi.MUZ, "https://www.postavy.cz/foto/motyl-emanuel-foto.jpg"),
            new Ucastnik("Čarodějnice", "Malá", "Chaloupka", Pohlavi.ZENA, "https://cdn.alza.cz/ImgW.ashx?fd=f16&cd=TRG002m"),
            new Ucastnik("Amálka", "Víla", null, Pohlavi.ZENA, "https://www.veselepohadky.cz/assets/nahlady-kategorie/116/vila-amalka-pohadka.jpg"),
            new Ucastnik("Vševěd", "Rákosníček", "rybníček Brčálník", Pohlavi.MUZ, "http://www.supermamina.cz/files/img/201304072252_mlha.png")
    );
  }

  /**
   * Seznam účastníků.
   *
   * Metoda kontroleru obsluhující adresu {@code /ucastnici/}. Používá šablonu {@code /templates/ucastnici/index.html}.
   */
//  Tato metoda se zavolá, když se do prohlížeče zadá adresa http://localhost:8080/ucastnici/
  @GetMapping("/")
  public ModelAndView ucastnici() {
//    v názvu view je lomítko, protože je to klasická cesta v souborovém systému
    ModelAndView modelAndView = new ModelAndView("ucastnici/index");
//    do modelu předám celý seznam s entitami
    modelAndView.addObject("ucastnici", ucastnici);
    return modelAndView;
  }

  /**
   * Detail účastníka účastníků.
   *
   * Metoda kontroleru obsluhující adresu {@code /ucastnici/detail}. Používá šablonu {@code /templates/ucastnici/detail.html}.
   */
  //  Tato metoda se zavolá, když se do prohlížeče zadá adresa http://localhost:8080/ucastnici/detail
  @GetMapping("/detail")
//  Spring zařídí, že se parametr id předává přes parametr uvedený v adrese, např. http://localhost:8080/ucastnici/detail?id=0
  public ModelAndView detail(int id) {
//  Parametrů může být víc. Předávají se přes adresu. Nezáleží na pořadí, propojí se po pomocí jmen
//  public ModelAndView detail(float x, float y, int id) {
    ModelAndView modelAndView = new ModelAndView("ucastnici/detail");
    modelAndView.addObject("ucastnik", ucastnici.get(id));
    return modelAndView;
  }

}
