package onlineTimetables.data;

import java.util.Set;

import onlineTimetables.entity.stops.Stop;

public interface StopsRepository {
	Stop addStop(Stop stop);
	Set<Stop> findStops(String searchText);
}
