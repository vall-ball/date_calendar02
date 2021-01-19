/*
 * Требуется хранить и обрабатывать информацию о датах — число, месяц и год XXI века. Во входном файле
содержится список дат в формате 01.01.2001.
Программа должна читать данные из входного файла и выводить в выходной файл список дат, отсортированный
по возрастанию, информация о дате выводится в виде 05.06.07, и календарь месяца для даты, расположенной
в середине этого списка. Если количество элементов списка четное, то календарь выводится для двух средних
дат.
Для решения задачи необходимо разработать подходящий класс или классы. Все элементы классов должны
иметь минимально возможную область доступа. Каждый метод класса должен выполнять только одну операцию. 
Во всех случаях, когда возможно использование библиотечных классов Java API, они должны быть
использованы. Имена входного и выходного файлов задаются в тексте программы.
Все ошибочные ситуации должны корректно обрабатываться программой! Если во входном файле встречается
строка с ошибкой, соответствующие данные должны быть проигнорированы с сообщением в консоли о найденной ошибке, 
программа должна продолжить работу со всеми корректными данными. Если без этих данных
продолжение работы невозможно, то необходимо завершить работу программы с соответствующим сообщением
в консоли.   

 */
package date_calendar02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		FileHandler fileHandler = new FileHandler();
		List<LocalDate> list = fileHandler.load("D:\\programming\\1.txt");
		/*DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		for (LocalDate date : list) {
			System.out.println(date.format(df));
		}
		Calendar calendar = new Calendar(list.get(0));
		System.out.println(calendar.generateCalendar());
*/
		fileHandler.save(list,  "D:\\programming\\2.txt");
	}

}
