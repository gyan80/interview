package com.ubs.opsit.interviews;

import java.util.stream.Stream;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String time) {
		StringBuilder builder = new StringBuilder();
		int[] parts = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();

		builder.append(getLampBlickStatus(parts[2])).append("\r\n").append(getTopHours(parts[0])).append("\r\n")
				.append(getBottomHours(parts[0])).append("\r\n").append(getTopMinutes(parts[1])).append("\r\n")
				.append(getBottomMinutes(parts[1]));
		return builder.toString();
	}

	private String getLampBlickStatus(int seconds) {
		if (seconds % 2 == 0)
			return "Y";
		else
			return "O";
	}

	private String getTopHours(int hours) {
		return getOnOff(TOTAL_HRS_LAMP, getTopCountOfOnSign(hours), ON_SIGN_HRS);
	}

	private String getBottomHours(int hours) {
		return getOnOff(TOTAL_HRS_LAMP, hours % 5, ON_SIGN_HRS);
	}

	private String getTopMinutes(int minutes) {
		return getOnOff(TOTAL_MIN_LAMP_TOP, getTopCountOfOnSign(minutes), ON_SIGN_MIN).replaceAll("YYY", "YYR");
	}

	private String getBottomMinutes(int minutes) {
		return getOnOff(TOTAL_MIN_LAMP_BOTTOM, minutes % 5, ON_SIGN_MIN);
	}

	private String getOnOff(int totalCount, int onSignCount, String onSign) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < onSignCount; i++) {
			result.append(onSign);
		}
		for (int i = 0; i < (totalCount - onSignCount); i++) {
			result.append(OFF_SIGN);
		}
		return result.toString();
	}

	private int getTopCountOfOnSign(int number) {
		return (number - (number % 5)) / 5;
	}

	public static void main(String[] args) {
		TimeConverter converter = new TimeConverterImpl();
		System.out.println(converter.convertTime("23:59:59"));
	}

}
