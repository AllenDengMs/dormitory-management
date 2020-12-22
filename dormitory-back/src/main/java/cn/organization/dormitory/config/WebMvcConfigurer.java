package cn.organization.dormitory.config;

import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

  //  将空串转成NULL
  @Override
  public void addFormatters(FormatterRegistry registry) {
    registry.addFormatterForFieldType(String.class, new Formatter<String>() {
      @Override
      public String parse(String text, Locale locale) throws ParseException {
        if (StringUtils.isBlank(text)) {
          return null;
        }
        return text;
      }

      @Override
      public String print(String object, Locale locale) {
        return object;
      }
    });
  }
}