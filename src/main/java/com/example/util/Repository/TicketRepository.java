package com.example.util.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.util.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {
	
	List<Ticket> findByUserId(String userId);

}
