package ug.daes.OnBoardingTransactionHandler.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DataFrameController}.
 */
@Generated
public class DataFrameController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DataFrameController apply(RegisteredBean registeredBean,
      DataFrameController instance) {
    instance.dataFrameService = AutowiredFieldValueResolver.forRequiredField("dataFrameService").resolve(registeredBean);
    return instance;
  }
}
