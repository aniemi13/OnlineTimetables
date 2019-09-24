package onlineTimetables.entity.stops.relations;

import onlineTimetables.entity.stops.Stop;

public class StopsRelation {
	private Long id;
	private Stop firstStop;
	private Stop secondStop;
	private double distance;

	public StopsRelation() {
	}

	public StopsRelation(Long id, Stop firstStop, Stop secondStop, double distance) {
		this.id = id;
		this.firstStop = firstStop;
		this.secondStop = secondStop;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Stop getFirstStop() {
		return firstStop;
	}

	public void setFirstStop(Stop firstStop) {
		this.firstStop = firstStop;
	}

	public Stop getSecondStop() {
		return secondStop;
	}

	public void setSecondStop(Stop secondStop) {
		this.secondStop = secondStop;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public Stop getOpposedStop(Long stopId) {
		if (firstStop.getId() == stopId)
			return secondStop;
		return firstStop;
	}

}
