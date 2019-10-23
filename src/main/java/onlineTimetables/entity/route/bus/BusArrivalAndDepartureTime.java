package onlineTimetables.entity.route.bus;

import java.sql.Time;
import java.util.List;
import java.util.Set;

public class BusArrivalAndDepartureTime {
	private Set<Time> arrivalTimes;
	private Set<Time> departureTimes;
	private boolean arrivalTimeEqualsDepartureTime;
	private List<BusWorkDays> workDays;
}
