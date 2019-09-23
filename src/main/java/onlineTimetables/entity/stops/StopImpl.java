package onlineTimetables.entity.stops;

import onlineTimetables.entity.address.Address;
import onlineTimetables.entity.address.Coordinates;

public class StopImpl implements Stop {
	private Long id;
	private String name;
	private Address address;
	private Coordinates coordinates;
	private StopsRelations stopsRelations;
	private RoutesThatPassThroughTheStop stopRoutes;
	private StopStatus stopStatus;
	
	//Obowiązkowo przy tworzeniu
	//nazwa, adres, współrzędne, status
	
	//opcje edycji
	//nazwa, adres, współrzędne, status
	
	//NIE MOŻNA USUNĄĆ PRZYSTANKU - NA ZAWSZE ZOSTAJE W BAZIE
	//JEDYNIE DAJEMY STATUS ZLIKWIDOWANY - I W TYM MOMENCIE KAŻDA TRASA
	//W KTÓRA PRZECHODZIŁA PRZEZ TEN PRZYSTANEK POWINNA ZOSTAĆ ZAKTUALIZOWANA
	//A JEJ WCZEŚNIEJSZA WERSJA POWINNA ZOSTAĆ W HISTORII
	
	//dodawanie relacji z czyjegoś przystanku
	//dodawanie z tego przystanku
	//usuwanie relacji
	//dodawanie trasy - ale to podczas tworzenia trasy (nie tutaj)
	//usuwanie trasy - podczas edycji trasy (nie tutaj)
	
	
	
	@Override
	public void addRelation(StopsRelation stopsRelation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void removeRelation(StopsRelation stopsRelation) {
		// TODO Auto-generated method stub
		
	}
}
