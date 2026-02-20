package ug.daes.OnBoardingTransactionHandler.util;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExceptionHandlerUtil}.
 */
@Generated
public class ExceptionHandlerUtil__BeanDefinitions {
  /**
   * Get the bean definition for 'exceptionHandlerUtil'.
   */
  public static BeanDefinition getExceptionHandlerUtilBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExceptionHandlerUtil.class);
    beanDefinition.setInstanceSupplier(ExceptionHandlerUtil::new);
    return beanDefinition;
  }
}
