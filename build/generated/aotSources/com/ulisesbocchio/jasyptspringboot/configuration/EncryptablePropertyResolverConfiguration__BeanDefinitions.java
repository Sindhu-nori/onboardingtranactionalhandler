package com.ulisesbocchio.jasyptspringboot.configuration;

import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyDetector;
import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyFilter;
import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyResolver;
import com.ulisesbocchio.jasyptspringboot.EncryptablePropertySourceConverter;
import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import com.ulisesbocchio.jasyptspringboot.util.Singleton;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Bean definitions for {@link EncryptablePropertyResolverConfiguration}.
 */
@Generated
public class EncryptablePropertyResolverConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'encryptablePropertyResolverConfiguration'.
   */
  public static BeanDefinition getEncryptablePropertyResolverConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EncryptablePropertyResolverConfiguration.class);
    beanDefinition.setTargetType(EncryptablePropertyResolverConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(EncryptablePropertyResolverConfiguration.class);
    beanDefinition.setInstanceSupplier(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'encryptablePropertySourceConverter'.
   */
  private static BeanInstanceSupplier<EncryptablePropertySourceConverter> getEncryptablePropertySourceConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EncryptablePropertySourceConverter>forFactoryMethod(EncryptablePropertyResolverConfiguration.class, "encryptablePropertySourceConverter", ConfigurableEnvironment.class, EncryptablePropertyResolver.class, EncryptablePropertyFilter.class)
            .withGenerator((registeredBean, args) -> EncryptablePropertyResolverConfiguration.encryptablePropertySourceConverter(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'encryptablePropertySourceConverter'.
   */
  public static BeanDefinition getEncryptablePropertySourceConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EncryptablePropertyResolverConfiguration.class);
    beanDefinition.setTargetType(EncryptablePropertySourceConverter.class);
    beanDefinition.setInstanceSupplier(getEncryptablePropertySourceConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'envCopy'.
   */
  private static BeanInstanceSupplier<EnvCopy> getEnvCopyInstanceSupplier() {
    return BeanInstanceSupplier.<EnvCopy>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "envCopy", ConfigurableEnvironment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).envCopy(args.get(0)));
  }

  /**
   * Get the bean definition for 'envCopy'.
   */
  public static BeanDefinition getEnvCopyBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EnvCopy.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getEnvCopyInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'lazyJasyptStringEncryptor'.
   */
  private static BeanInstanceSupplier<StringEncryptor> getLazyJasyptStringEncryptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StringEncryptor>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "stringEncryptor", EnvCopy.class, BeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).stringEncryptor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'lazyJasyptStringEncryptor'.
   */
  public static BeanDefinition getLazyJasyptStringEncryptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StringEncryptor.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getLazyJasyptStringEncryptorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'lazyEncryptablePropertyDetector'.
   */
  private static BeanInstanceSupplier<EncryptablePropertyDetector> getLazyEncryptablePropertyDetectorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EncryptablePropertyDetector>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "encryptablePropertyDetector", EnvCopy.class, BeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).encryptablePropertyDetector(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'lazyEncryptablePropertyDetector'.
   */
  public static BeanDefinition getLazyEncryptablePropertyDetectorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EncryptablePropertyDetector.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getLazyEncryptablePropertyDetectorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configPropsSingleton'.
   */
  private static BeanInstanceSupplier<Singleton> getConfigPropsSingletonInstanceSupplier() {
    return BeanInstanceSupplier.<Singleton>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "configProps", EnvCopy.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).configProps(args.get(0)));
  }

  /**
   * Get the bean definition for 'configPropsSingleton'.
   */
  public static BeanDefinition getConfigPropsSingletonBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Singleton.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(Singleton.class, JasyptEncryptorConfigurationProperties.class));
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getConfigPropsSingletonInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'lazyEncryptablePropertyFilter'.
   */
  private static BeanInstanceSupplier<EncryptablePropertyFilter> getLazyEncryptablePropertyFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EncryptablePropertyFilter>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "encryptablePropertyFilter", EnvCopy.class, ConfigurableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).encryptablePropertyFilter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'lazyEncryptablePropertyFilter'.
   */
  public static BeanDefinition getLazyEncryptablePropertyFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EncryptablePropertyFilter.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getLazyEncryptablePropertyFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'lazyEncryptablePropertyResolver'.
   */
  private static BeanInstanceSupplier<EncryptablePropertyResolver> getLazyEncryptablePropertyResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EncryptablePropertyResolver>forFactoryMethod(EncryptablePropertyResolverConfiguration$$SpringCGLIB$$0.class, "encryptablePropertyResolver", EncryptablePropertyDetector.class, StringEncryptor.class, BeanFactory.class, EnvCopy.class, ConfigurableEnvironment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration", EncryptablePropertyResolverConfiguration.class).encryptablePropertyResolver(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'lazyEncryptablePropertyResolver'.
   */
  public static BeanDefinition getLazyEncryptablePropertyResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EncryptablePropertyResolver.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertyResolverConfiguration");
    beanDefinition.setInstanceSupplier(getLazyEncryptablePropertyResolverInstanceSupplier());
    return beanDefinition;
  }
}
