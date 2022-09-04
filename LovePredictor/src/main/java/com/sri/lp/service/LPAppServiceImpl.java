package com.sri.lp.service;

import org.springframework.stereotype.Service;

@Service
public class LPAppServiceImpl implements LPAppService {

	public final String LP_APP_FORMULA = "FLAMES";

	@Override
	public String calculateLove(String yourName, String crushName) {
		int totalCount = (yourName + crushName).toCharArray().length;
		int formulaCount = LP_APP_FORMULA.toCharArray().length;
		int rem = totalCount % formulaCount;
		char resultChar = LP_APP_FORMULA.charAt(rem);

		String result = whatsBetweenUs(resultChar);
		
		return result;

	}

	@Override
	public String whatsBetweenUs(char calculationResult) {
		String result = null;

		if (calculationResult == 'F') {
			return result = LoveCalculatorConstants.F;
		} else if (calculationResult == 'L') {
			return result = LoveCalculatorConstants.L;
		} else if (calculationResult == 'A') {
			return result = LoveCalculatorConstants.A;
		} else if (calculationResult == 'M') {
			return result = LoveCalculatorConstants.M;
		} else if (calculationResult == 'E') {
			return result = LoveCalculatorConstants.E;
		} else if (calculationResult == 'S') {
			return result = LoveCalculatorConstants.S;
		}

		return result;
	}

}
