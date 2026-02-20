package ug.daes.OnBoardingTransactionHandler.util;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PropertiesUtil}.
 */
@Generated
public class PropertiesUtil__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PropertiesUtil apply(RegisteredBean registeredBean, PropertiesUtil instance) {
    instance.propertiesConfiguration = AutowiredFieldValueResolver.forRequiredField("propertiesConfiguration").resolve(registeredBean);
    return instance;
  }
}
