package com.gsitm.intern.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableJpaAuditing  //JPA Auditing 기능 활성화
public class AuditConfig {
    @Bean
    public AuditorAware<String> auditorProvider() { //등록자와 수정자를 처리해주는 AuditorAware을 빈으로 등록
        return new AuditorAwareImpl();
    }
}
