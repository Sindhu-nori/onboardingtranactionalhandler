package ug.daes.OnBoardingTransactionHandler.conf;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AppCorsProperties}.
 */
@Generated
public class AppCorsProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'appCorsProperties'.
   */
  public static BeanDefinition getAppCorsPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AppCorsProperties.class);
    beanDefinition.setInstanceSupplier(AppCorsProperties::new);
    return beanDefinition;
  }
}
