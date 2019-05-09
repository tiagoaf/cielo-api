package com.stefanini.cielo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import com.stefanini.cielo.enums.EnumModule;
import com.stefanini.cielo.enums.EnumPermission;
import com.stefanini.cielo.enums.EnumSystem;

@Target(ElementType.TYPE)
public @interface CieloPermission {

	EnumSystem system() default EnumSystem.FINANCIAL;
	
	EnumModule module() default EnumModule.ACCOUNT;
	
	EnumPermission permission() default EnumPermission.SAVE;
	
}