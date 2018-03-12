package com.skinnynerd.myexpenses;

import com.skinnynerd.myexpenses.services.DateTimeService;
import com.skinnynerd.myexpenses.utils.AuditingDateTimeProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider") // ссылка на провайдер временной метки для аудитинга
@EnableJpaRepositories
@EnableTransactionManagement
public class PersistenceContext {
    // провайдер метки времени для аудитинга, использующий наш AuditingDateTimeProvider класс
    @Bean
    DateTimeProvider dateTimeProvider(DateTimeService dateTimeService) {
        return new AuditingDateTimeProvider(dateTimeService);
    }
}
