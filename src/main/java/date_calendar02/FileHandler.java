package date_calendar02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

	public List<LocalDate> load(String fileName) throws FileNotFoundException {
		List<LocalDate> answer = new ArrayList<>();
		Scanner scanner = new Scanner(new File(fileName));
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		while (scanner.hasNext()) {
			try {
			answer.add(LocalDate.parse(scanner.nextLine(), df));
			} catch (DateTimeParseException e) {
				System.out.println("Áûכא מרטבךא ");
			}
		}
		scanner.close();
		Collections.sort(answer);
		return answer;
	}

	public void save(List<LocalDate> list, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (LocalDate date : list) {
			writer.append(date.format(df) + "\n\r");
		}
        if (list.size() % 2 == 0) {
        	Calendar calendar1 = new Calendar(list.get(list.size() / 2 - 1));
        	Calendar calendar2 = new Calendar(list.get(list.size() / 2));
        	writer.append(calendar1.generateCalendar() + "\n\r");
        	writer.append(calendar2.generateCalendar() + "\n\r");
        } else {
        	Calendar calendar = new Calendar(list.get(list.size() / 2 - 1));
        	writer.append(calendar.generateCalendar() + "\n\r");
        }
        writer.close();
    }

}
