package ug.daes.OnBoardingTransactionHandler.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataFrameController}.
 */
@Generated
public class DataFrameController__BeanDefinitions {
  /**
   * Get the bean definition for 'dataFrameController'.
   */
  public static BeanDefinition getDataFrameControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataFrameController.class);
    InstanceSupplier<DataFrameController> instanceSupplier = InstanceSupplier.using(DataFrameController::new);
    instanceSupplier = instanceSupplier.andThen(DataFrameController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
