package ug.daes.OnBoardingTransactionHandler.util;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PropertiesUtil}.
 */
@Generated
public class PropertiesUtil__BeanDefinitions {
  /**
   * Get the bean definition for 'propertiesUtil'.
   */
  public static BeanDefinition getPropertiesUtilBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PropertiesUtil.class);
    InstanceSupplier<PropertiesUtil> instanceSupplier = InstanceSupplier.using(PropertiesUtil::new);
    instanceSupplier = instanceSupplier.andThen(PropertiesUtil__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
