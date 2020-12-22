package cn.organization.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class UIController {

  @GetMapping(value = "/")
  public String index() {
    return "login";
  }

  @GetMapping(value = "/{othersHtml}")
  public String others(@PathVariable String othersHtml) {
    return othersHtml.replace(".html", "");
  }

}
