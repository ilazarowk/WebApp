package com.webapp.WebApp;

import java.util.HashMap;
import java.util.Map;

import org.jasig.cas.client.boot.configuration.CasClientConfigurer;
import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCasClient
public class WebAppApplication implements CasClientConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}
	/*
	@Override
	public void configureSingleSignOutFilter(FilterRegistrationBean authenticationFilter) {
        authenticationFilter.getInitParameters().put("artifactParameterName", "casTicket");
        authenticationFilter.getInitParameters().put("serviceParameterName", "targetService");
    }*/
	/*@Override
	@Bean
    @ConditionalOnProperty(prefix = "cas", value = "single-logout.enabled", havingValue = "true")
    public FilterRegistrationBean casSingleSignOutFilter() {
        final FilterRegistrationBean singleSignOutFilter = new FilterRegistrationBean();
        singleSignOutFilter.setFilter(new SingleSignOutFilter());
        Map<String,String> initParameters = new HashMap<>(1);
        initParameters.put("casServerUrlPrefix", configProps.getServerUrlPrefix());
        singleSignOutFilter.setInitParameters(initParameters);
        singleSignOutFilter.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return singleSignOutFilter;
    }*/

}
