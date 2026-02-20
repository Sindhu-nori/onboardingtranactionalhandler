package ug.daes.OnBoardingTransactionHandler.security;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TokenValidationFilter}.
 */
@Generated
public class TokenValidationFilter__BeanDefinitions {
  /**
   * Get the bean definition for 'tokenValidationFilter'.
   */
  public static BeanDefinition getTokenValidationFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TokenValidationFilter.class);
    InstanceSupplier<TokenValidationFilter> instanceSupplier = InstanceSupplier.using(TokenValidationFilter::new);
    instanceSupplier = instanceSupplier.andThen(TokenValidationFilter__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
