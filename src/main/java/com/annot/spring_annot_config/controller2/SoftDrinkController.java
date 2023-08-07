package com.annot.spring_annot_config.controller2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annot.spring_annot_config.configuration.AppConfiguration;
import com.annot.spring_annot_config.dto.SoftDrinkService;

public class SoftDrinkController {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		SoftDrinkService service=(SoftDrinkService)context.getBean("softDrinkService");
		service.service();
			}
	}


