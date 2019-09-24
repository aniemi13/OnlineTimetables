package onlineTimetables.entity.stops.relations;

import java.util.HashSet;
import java.util.Set;

import onlineTimetables.entity.stops.Stop;

public class StopsRelations {
	private Long id;
	private Long stopId;
	private Set<StopsRelation> stopsReltions;
	
	public StopsRelations(Long stopId) {
		this.stopId = stopId;
		stopsReltions = new HashSet<>();
	}

	public void addRelation(StopsRelation stopsRelation) {
		Stop opposedStop = stopsRelation.getOpposedStop(stopId);
		opposedStop.addRelation(stopsRelation);
		stopsReltions.add(stopsRelation);
	}
	
	public void deleteRelation(StopsRelation stopsRelation) {
		stopsReltions.remove(stopsRelation);
	}
}
