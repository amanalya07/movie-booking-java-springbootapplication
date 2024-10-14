package com.example.util.Service;

import org.springframework.http.ResponseEntity;

import com.example.util.Model.Ticket;

public interface TicketService {
	
	public ResponseEntity<?>	 bookMovie(String movieName, Ticket ticket);
	
	public ResponseEntity<?> getAllTickets();

}
