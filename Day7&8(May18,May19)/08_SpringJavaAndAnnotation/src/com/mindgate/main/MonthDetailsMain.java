package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDeatils;
import com.mindgate.pojo.MonthsDetails;

public class MonthDetailsMain {
	public static void main(String[] args) {

		ApplicationContext applicationConfig = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		FinancialYearDeatils financialYearDeatils = applicationConfig.getBean("financialyeardetails", FinancialYearDeatils.class);
		LocalDate startDate = LocalDate.of(2019, 10, 1);
		LocalDate endDate = LocalDate.of(2022, 05, 19);
		
		financialYearDeatils.setYearId(1);
		financialYearDeatils.setYearStartDate(startDate);
		financialYearDeatils.setYearEndDate(endDate);
		System.out.println(financialYearDeatils);
		
		MonthsDetails monthsDetails = applicationConfig.getBean("monthdetails", MonthsDetails.class);
		monthsDetails.setMonthId(1);
		monthsDetails.setMonthStartDate(LocalDate.of(2014, 12, 30));
		monthsDetails.setMonthEndDate(LocalDate.of(2018, 05,01 ));
		monthsDetails.setFinancialYearDeatils(financialYearDeatils);
		System.out.println(monthsDetails);
	}
}
