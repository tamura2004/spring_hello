package main.java.name.ogisui.web.config;

import java.nio.charset.StandardCharsets;

import javax.lang.model.util.AbstractAnnotationValueVisitor6;
import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  /**
   * ビジネスロジックなど、Spring MVC以外に関するJava Configクラスを指定します。
   */
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] {};
  }

  /**
   * Spring MVCに関するJava Configクラスを指定します。
   */
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {MvcConfig.class};
  }

  /**
   * DispatcherServletに対するURLパターンを指定します。
   * "/"を指定することで、全リクエストをDispatcherServletが受け取ります。
   */
  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

  /**
   * サーブレットフィルターを指定します。
   * 複数のフィルターがあった場合、配列に指定した順番に実行されます。
   */
  @Override
  protected Filter[] getServletFilters() {
    return new Filter[]{
      new CharacterEncodingFilter(StandardCharsets.UTF_8.name(), true)};
  }
}
