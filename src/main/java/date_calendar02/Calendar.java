package date_calendar02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	LocalDate date;

	public Calendar(LocalDate date) {
		this.date = date;
	}
	
	public String generateCalendar() {
		StringBuilder builder = new StringBuilder();
		int length = date.getMonth().length(date.isLeapYear());
		builder.append(date.getMonth().name() + " " + date.getYear() + "\n\r");
		builder.append("Mo Tu We Th Fr Sa Su\n\r");
		switch (LocalDate.of(date.getYear(), date.getMonth(), 1).getDayOfWeek()) {
			case TUESDAY:
				builder.append("   ");
				break;
			case WEDNESDAY:
				builder.append("      ");
				break;
			case THURSDAY:
				builder.append("         ");
				break;
			case FRIDAY:
				builder.append("            ");
				break;
			case SATURDAY:
				builder.append("               ");
				break;
			case SUNDAY:
				builder.append("                  ");
				break;			
		}
		for (int i = 1; i <= length; i++) {
			if (i < 10) {
				builder.append(" ");
			}
			if (LocalDate.of(date.getYear(), date.getMonth(), i).getDayOfWeek() == DayOfWeek.SUNDAY) {
				builder.append(i + " \n\r");
			} else {
				builder.append(i + " ");
			}
		}
		return builder.toString();
	}

}
