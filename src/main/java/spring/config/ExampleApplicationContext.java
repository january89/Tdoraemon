package spring.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.core.context.SecurityContext;

@Configuration
@ComponentScan(basePackages = {
        "com.example.common.service",
        "com.example.security.service",
        "com.example.user.service"
})
@Import({WebMvcConfig.class, PersistenceContext.class, SecurityContext.class, SocialContext.class})
@PropertySource("classpath:application.properties")
class ExampleApplicationContext {
    private static final String MESSAGE_SOURCE_BASE_NAME = "i18n/messages";

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename(MESSAGE_SOURCE_BASE_NAME);
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
