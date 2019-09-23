package onlineTimetables.entity.stops;

public interface Stop {

	void addRelation(StopsRelation stopsRelation);

	Long getId();

	void removeRelation(StopsRelation stopsRelation);

}
