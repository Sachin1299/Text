package com.sachin.ctrl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class ControllerClass {

	@Autowired
	private TicketDao db;
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Event> getbyid(@PathVariable ("id") int id)
	{
		
		Event event;
		try {
			 event=db.findById(id);
			if(event.getTitle()==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
			
	    return ResponseEntity.status(HttpStatus.FOUND).body(event);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Event>> getAll()
	{
		List<Event> list=(List<Event>)db.findAll();
		if(list.size()==0)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();	
		}
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Event> add(@RequestBody Event event)
	{
		
		try {
			if(event.getType()==null)
			{
				event.setType("Trash Picking");
			}
			return ResponseEntity.status(HttpStatus.CREATED).body(db.save(event));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).build();
		}
		 
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable ("id") int id)
	{	
		Event event;
		try {
			 event=db.findById(id);
			if(event.getTitle()==null)
			{
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		db.deleteById(id);
		return  ResponseEntity.status(HttpStatus.OK).build(); 
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Event> update(@RequestBody Event event,@PathVariable("id") int id)
	{
		if(event.getType()==null)
		{
			event.setType("Trash Picking");
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(db.save(event));
	}
	
	
	
	private String getTimeStamp() {
	       return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
	    }
}
