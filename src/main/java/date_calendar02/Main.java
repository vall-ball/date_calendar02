/*
 * ��������� ������� � ������������ ���������� � ����� � �����, ����� � ��� XXI ����. �� ������� �����
���������� ������ ��� � ������� 01.01.2001.
��������� ������ ������ ������ �� �������� ����� � �������� � �������� ���� ������ ���, ���������������
�� �����������, ���������� � ���� ��������� � ���� 05.06.07, � ��������� ������ ��� ����, �������������
� �������� ����� ������. ���� ���������� ��������� ������ ������, �� ��������� ��������� ��� ���� �������
���.
��� ������� ������ ���������� ����������� ���������� ����� ��� ������. ��� �������� ������� ������
����� ���������� ��������� ������� �������. ������ ����� ������ ������ ��������� ������ ���� ��������. 
�� ���� �������, ����� �������� ������������� ������������ ������� Java API, ��� ������ ����
������������. ����� �������� � ��������� ������ �������� � ������ ���������.
��� ��������� �������� ������ ��������� �������������� ����������! ���� �� ������� ����� �����������
������ � �������, ��������������� ������ ������ ���� ��������������� � ���������� � ������� � ��������� ������, 
��������� ������ ���������� ������ �� ����� ����������� �������. ���� ��� ���� ������
����������� ������ ����������, �� ���������� ��������� ������ ��������� � ��������������� ����������
� �������.   

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
