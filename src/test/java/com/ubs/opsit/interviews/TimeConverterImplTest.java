package com.ubs.opsit.interviews;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeConverterImplTest {
	private TimeConverter berlinClock;

	@Before
	public void initialize() {
		berlinClock = new TimeConverterImpl();
	}

	@Test
	public void testConvertTime() {
		assertThat(berlinClock.convertTime("00:00:00")).isEqualTo("Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("13:17:01")).isEqualTo("O\r\nRROO\r\nRRRO\r\nYYROOOOOOOO\r\nYYOO");
		assertThat(berlinClock.convertTime("23:59:59")).isEqualTo("O\r\nRRRR\r\nRRRO\r\nYYRYYRYYRYY\r\nYYYY");
		assertThat(berlinClock.convertTime("24:00:00")).isEqualTo("Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("05:00:00")).isEqualTo("Y\r\nROOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("03:30:59")).isEqualTo("O\r\nOOOO\r\nRRRO\r\nYYRYYROOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("11:45:45")).isEqualTo("O\r\nRROO\r\nROOO\r\nYYRYYRYYROO\r\nOOOO");
		assertThat(berlinClock.convertTime("12:00:00")).isEqualTo("Y\r\nRROO\r\nRROO\r\nOOOOOOOOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("18:30:00")).isEqualTo("Y\r\nRRRO\r\nRRRO\r\nYYRYYROOOOO\r\nOOOO");
		assertThat(berlinClock.convertTime("22:30:55")).isEqualTo("O\r\nRRRR\r\nRROO\r\nYYRYYROOOOO\r\nOOOO");
	}

}
