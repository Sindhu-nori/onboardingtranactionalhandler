package ug.daes.OnBoardingTransactionHandler.security;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TokenValidationFilter}.
 */
@Generated
public class TokenValidationFilter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TokenValidationFilter apply(RegisteredBean registeredBean,
      TokenValidationFilter instance) {
    instance.propertiesUtil = AutowiredFieldValueResolver.forRequiredField("propertiesUtil").resolve(registeredBean);
    AutowiredFieldValueResolver.forRequiredField("username").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("password").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
