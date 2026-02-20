package com.ulisesbocchio.jasyptspringboot.configuration;

import com.ulisesbocchio.jasyptspringboot.EncryptablePropertySourceConverter;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Bean definitions for {@link EnableEncryptablePropertiesConfiguration}.
 */
@Generated
public class EnableEncryptablePropertiesConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'enableEncryptablePropertiesConfiguration'.
   */
  public static BeanDefinition getEnableEncryptablePropertiesConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EnableEncryptablePropertiesConfiguration.class);
    beanDefinition.setTargetType(EnableEncryptablePropertiesConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(EnableEncryptablePropertiesConfiguration.class);
    beanDefinition.setInstanceSupplier(EnableEncryptablePropertiesConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'enableEncryptablePropertySourcesPostProcessor'.
   */
  private static BeanInstanceSupplier<EnableEncryptablePropertiesBeanFactoryPostProcessor> getEnableEncryptablePropertySourcesPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EnableEncryptablePropertiesBeanFactoryPostProcessor>forFactoryMethod(EnableEncryptablePropertiesConfiguration.class, "enableEncryptablePropertySourcesPostProcessor", ConfigurableEnvironment.class, EncryptablePropertySourceConverter.class)
            .withGenerator((registeredBean, args) -> EnableEncryptablePropertiesConfiguration.enableEncryptablePropertySourcesPostProcessor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'enableEncryptablePropertySourcesPostProcessor'.
   */
  public static BeanDefinition getEnableEncryptablePropertySourcesPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EnableEncryptablePropertiesConfiguration.class);
    beanDefinition.setTargetType(EnableEncryptablePropertiesBeanFactoryPostProcessor.class);
    beanDefinition.setInstanceSupplier(getEnableEncryptablePropertySourcesPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
