package com.microservices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.microservices.utility.call.CallShoppingGeneralConstants;
import com.microservices.utility.post.PostOnboardingDocumentValidationPanConstants;
import com.microservices.utility.pre.PreOnboardingWealthConstants;

@SpringBootApplication
public class SpringBootApiDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
		
		 FileInputStream onboardingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//properties//pre//PreOnboardingWealth.properties");
		 PreOnboardingWealthConstants.PreOnboardingWealthOR = new Properties();
	     PreOnboardingWealthConstants.PreOnboardingWealthOR.load(onboardingFileStream);  
		 
		 FileInputStream shoppingFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//properties//call//CallShoppingGeneral.properties");
		 CallShoppingGeneralConstants.CallShoppingGeneralOR = new Properties();
		 CallShoppingGeneralConstants.CallShoppingGeneralOR.load(shoppingFileStream);
		 
		 FileInputStream postOnboardingDocValidationPanFileStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//microservices//properties//post//PostOnboardingDocumentValidationPAN.properties");
		 PostOnboardingDocumentValidationPanConstants.PostOnboardingDocumentValidationPanOR = new Properties();
		 PostOnboardingDocumentValidationPanConstants.PostOnboardingDocumentValidationPanOR.load(postOnboardingDocValidationPanFileStream);
				 
		 System.out.println(System.getProperty("user.dir"));
	}
	
//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//	    ObjectMapper mapper = new ObjectMapper();
//	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//	    MappingJackson2HttpMessageConverter converter = 
//	        new MappingJackson2HttpMessageConverter(mapper);
//	    return converter;
//	}

}
