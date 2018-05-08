package com.ubs.opsit.interviews;

public interface TimeConverter {
	int TOTAL_HRS_LAMP = 4;
	int TOTAL_MIN_LAMP_TOP = 11;
	int TOTAL_MIN_LAMP_BOTTOM = 4;
	String OFF_SIGN = "O";
	String ON_SIGN_HRS = "R";
	String ON_SIGN_MIN = "Y";

    String convertTime(String aTime);

}
