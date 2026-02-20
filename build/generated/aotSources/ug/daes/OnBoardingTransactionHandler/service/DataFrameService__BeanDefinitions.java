package ug.daes.OnBoardingTransactionHandler.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataFrameService}.
 */
@Generated
public class DataFrameService__BeanDefinitions {
  /**
   * Get the bean definition for 'dataFrameService'.
   */
  public static BeanDefinition getDataFrameServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataFrameService.class);
    beanDefinition.setInstanceSupplier(DataFrameService::new);
    return beanDefinition;
  }
}
