package day46_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Motorcycle extends Vehicle {
	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
		
		LocalDateTime x = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period g = Period.ofDays(1).ofYears(2);
		x= x.minus(g);
		DateTimeFormatter j = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		.SHORT);
		System.out.println(j.format(x));
	}

}
