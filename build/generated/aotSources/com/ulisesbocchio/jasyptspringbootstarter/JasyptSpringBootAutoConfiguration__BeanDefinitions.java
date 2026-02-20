package com.ulisesbocchio.jasyptspringbootstarter;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link JasyptSpringBootAutoConfiguration}.
 */
@Generated
public class JasyptSpringBootAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jasyptSpringBootAutoConfiguration'.
   */
  public static BeanDefinition getJasyptSpringBootAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JasyptSpringBootAutoConfiguration.class);
    beanDefinition.setTargetType(JasyptSpringBootAutoConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(JasyptSpringBootAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(JasyptSpringBootAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
