package com.epam.epam_task5;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	private static Scanner sc;
	private static float Principle,Time,Rate,Simple_Interest,Compound_Interest;

	public static void main( String[] args )
    {
		sc = new Scanner(System.in);
		LOGGER.info("Enter principle amount");
		Principle = sc.nextFloat();
		LOGGER.info("Enter time period");
		Time = sc.nextFloat();
		LOGGER.info("Enter rate of interest");
		Rate = sc.nextFloat();
		CalculateInterest ci =new CalculateInterest();
		Simple_Interest=ci.calculateSimpleInterest(Principle,Time,Rate);
		Compound_Interest=ci.calculateCompoundInterest(Principle,Time,Rate);
		LOGGER.info("Your Simple Interest is "+Simple_Interest);
		LOGGER.info("Your Compound Interest is "+Compound_Interest);
        
    }
}