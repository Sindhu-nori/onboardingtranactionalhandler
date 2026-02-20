package ug.daes.OnBoardingTransactionHandler.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MosipService}.
 */
@Generated
public class MosipService__BeanDefinitions {
  /**
   * Get the bean definition for 'mosipService'.
   */
  public static BeanDefinition getMosipServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MosipService.class);
    InstanceSupplier<MosipService> instanceSupplier = InstanceSupplier.using(MosipService::new);
    instanceSupplier = instanceSupplier.andThen(MosipService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
