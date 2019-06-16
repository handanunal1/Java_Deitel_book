package chapter16.figures.f8;

/**
 * Figures 16.8 TimeComparator
 * 
 * Author: Handan Unal
 * 
 */
import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {

	@Override
	public int compare(Time2 time1, Time2 time2) {

		int hourDifference = time1.getHour() - time2.getHour();

		if (hourDifference != 0) {
			return hourDifference;
		}

		int minuteDifference = time1.getMinute() - time2.getMinute();

		if (minuteDifference != 0) {
			return minuteDifference;
		}
		int secondDifference = time1.getSecond() - time2.getSecond();

		if (secondDifference != 0) {
			return secondDifference;
		}

		return 0;
	}

}
