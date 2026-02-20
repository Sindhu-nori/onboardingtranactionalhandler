package ug.daes.OnBoardingTransactionHandler.conf;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PropertiesConfiguration}.
 */
@Generated
public class PropertiesConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'propertiesConfiguration'.
   */
  public static BeanDefinition getPropertiesConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesConfiguration.class);
    beanDefinition.setInstanceSupplier(PropertiesConfiguration::new);
    return beanDefinition;
  }
}
