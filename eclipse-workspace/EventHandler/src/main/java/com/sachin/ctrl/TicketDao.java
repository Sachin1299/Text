package com.sachin.ctrl;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TicketDao extends CrudRepository<Event, Integer> {
	
	public Event findById(int id);
	
//	@Query("Select id , Title , Description , Date , Type , StartTime , EndTime , Location_lon , Location_lan from Event where title= :title")
//	public Iterable<Event> findByTitle(String title);

}
