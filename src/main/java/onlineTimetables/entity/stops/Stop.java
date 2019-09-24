package onlineTimetables.entity.stops;

import onlineTimetables.entity.stops.relations.StopsRelation;

public interface Stop {

	void addRelation(StopsRelation stopsRelation);

	Long getId();

	void removeRelation(StopsRelation stopsRelation);

}
