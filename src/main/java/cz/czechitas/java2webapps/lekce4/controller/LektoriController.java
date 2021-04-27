package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import cz.czechitas.java2webapps.lekce4.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci lektorů.
 */
@Controller()
@RequestMapping("/lektori")
public class LektoriController {
  //deklarace fieldu
  private final List<Lektor> lektori;

//  konstruktor
  public LektoriController() {
//    inicializace fieldu lektori - tj. naplnění seznamu
//    lektori = Arrays.asList(
//    List je interface, má metodu of. Je to elegantnější zápis. Je v novější verzi Javy.
            lektori = List.of(
// jednotlivé objekty Lektor
// mezi objekty je čárka (ne středník), protože je to v rámci jedné metody, která vytváří list
// druhý parametr odkazuje na konstantu v rámci enumu Role
new Lektor("Markéta Pátková", Role.WORKSHOPISTKA),
new Lektor("Filip Jirsák", Role.LEKTOR),
new Lektor("Adam Vyšínský", Role.KOUC)
    );
  }

  /**
   * Metoda kontroleru obsluhující adresu {@code /lektori/}. Používá šablonu {@code /templates/lektori/index.html}.
   *
   * @return
   */
//  @GetMapping("/")
//  do metody můžu vložit i String a vrátit jen odkaz na pohled, ale takto do něj nemůžu vložit data
//  public String lektori() {
//    return "lektori/index";
//  }

  @GetMapping("/")
  public ModelAndView lektori() {
    ModelAndView modelAndView = new ModelAndView("lektori/index");
    modelAndView.addObject("lektori", lektori);
    return modelAndView;
  }

}
