package ug.daes.OnBoardingTransactionHandler.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MosipService}.
 */
@Generated
public class MosipService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MosipService apply(RegisteredBean registeredBean, MosipService instance) {
    instance.propertiesUtil = AutowiredFieldValueResolver.forRequiredField("propertiesUtil").resolve(registeredBean);
    return instance;
  }
}
