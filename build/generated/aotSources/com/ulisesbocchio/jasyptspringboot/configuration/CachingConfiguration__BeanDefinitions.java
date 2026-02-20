package com.ulisesbocchio.jasyptspringboot.configuration;

import com.ulisesbocchio.jasyptspringboot.EncryptablePropertySourceConverter;
import com.ulisesbocchio.jasyptspringboot.caching.RefreshScopeRefreshedEventListener;
import com.ulisesbocchio.jasyptspringboot.util.Singleton;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Bean definitions for {@link CachingConfiguration}.
 */
@Generated
public class CachingConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'cachingConfiguration'.
   */
  public static BeanDefinition getCachingConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CachingConfiguration.class);
    beanDefinition.setTargetType(CachingConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(CachingConfiguration.class);
    beanDefinition.setInstanceSupplier(CachingConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'refreshScopeRefreshedEventListener'.
   */
  private static BeanInstanceSupplier<RefreshScopeRefreshedEventListener> getRefreshScopeRefreshedEventListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RefreshScopeRefreshedEventListener>forFactoryMethod(CachingConfiguration$$SpringCGLIB$$0.class, "refreshScopeRefreshedEventListener", ConfigurableEnvironment.class, EncryptablePropertySourceConverter.class, Singleton.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("com.ulisesbocchio.jasyptspringboot.configuration.CachingConfiguration", CachingConfiguration.class).refreshScopeRefreshedEventListener(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'refreshScopeRefreshedEventListener'.
   */
  public static BeanDefinition getRefreshScopeRefreshedEventListenerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RefreshScopeRefreshedEventListener.class);
    beanDefinition.setFactoryBeanName("com.ulisesbocchio.jasyptspringboot.configuration.CachingConfiguration");
    beanDefinition.setInstanceSupplier(getRefreshScopeRefreshedEventListenerInstanceSupplier());
    return beanDefinition;
  }
}
