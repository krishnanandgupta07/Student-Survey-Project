package com.king;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class Proj01StudentEnquiryApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(Proj01StudentEnquiryApplication.class, args);
	}
	
	
		@Bean(name="localeResolver")
	    public LocaleResolver localeResolver() {
	        SessionLocaleResolver slr = new SessionLocaleResolver();
	        slr.setDefaultLocale(Locale.ENGLISH);
	        return slr;
	    }

	    @Bean
	    public LocaleChangeInterceptor localeChangeInterceptor() {
	        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
	        lci.setParamName("lang"); // language switcher uses ?lang=hi etc.
	        return lci;
	    }


}
