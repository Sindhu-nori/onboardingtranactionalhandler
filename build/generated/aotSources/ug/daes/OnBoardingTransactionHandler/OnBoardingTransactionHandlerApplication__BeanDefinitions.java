package ug.daes.OnBoardingTransactionHandler;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.web.client.RestTemplate;

/**
 * Bean definitions for {@link OnBoardingTransactionHandlerApplication}.
 */
@Generated
public class OnBoardingTransactionHandlerApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'onBoardingTransactionHandlerApplication'.
   */
  public static BeanDefinition getOnBoardingTransactionHandlerApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OnBoardingTransactionHandlerApplication.class);
    beanDefinition.setTargetType(OnBoardingTransactionHandlerApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(OnBoardingTransactionHandlerApplication.class);
    beanDefinition.setInstanceSupplier(OnBoardingTransactionHandlerApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'restTemplate'.
   */
  private static BeanInstanceSupplier<RestTemplate> getRestTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<RestTemplate>forFactoryMethod(OnBoardingTransactionHandlerApplication$$SpringCGLIB$$0.class, "restTemplate")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("onBoardingTransactionHandlerApplication", OnBoardingTransactionHandlerApplication.class).restTemplate());
  }

  /**
   * Get the bean definition for 'restTemplate'.
   */
  public static BeanDefinition getRestTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestTemplate.class);
    beanDefinition.setFactoryBeanName("onBoardingTransactionHandlerApplication");
    beanDefinition.setInstanceSupplier(getRestTemplateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jasyptStringEncryptor'.
   */
  private static BeanInstanceSupplier<StringEncryptor> getJasyptStringEncryptorInstanceSupplier() {
    return BeanInstanceSupplier.<StringEncryptor>forFactoryMethod(OnBoardingTransactionHandlerApplication$$SpringCGLIB$$0.class, "stringEncryptor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("onBoardingTransactionHandlerApplication", OnBoardingTransactionHandlerApplication.class).stringEncryptor());
  }

  /**
   * Get the bean definition for 'jasyptStringEncryptor'.
   */
  public static BeanDefinition getJasyptStringEncryptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StringEncryptor.class);
    beanDefinition.setFactoryBeanName("onBoardingTransactionHandlerApplication");
    beanDefinition.setInstanceSupplier(getJasyptStringEncryptorInstanceSupplier());
    return beanDefinition;
  }
}
