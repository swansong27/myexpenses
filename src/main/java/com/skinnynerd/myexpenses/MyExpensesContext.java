package com.skinnynerd.myexpenses;

import com.skinnynerd.myexpenses.services.CurrentTimeDateTimeService;
import com.skinnynerd.myexpenses.services.DateTimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
@Import({PersistenceContext.class}) // импорт конфига персистенса
public class MyExpensesContext {
    @Profile("APPLICATION")
    @Bean
    DateTimeService currentTimeDateTimeService() {
        return new CurrentTimeDateTimeService();
    }
}
