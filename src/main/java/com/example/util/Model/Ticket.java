package com.example.util.Model;

import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="tickets")
public class Ticket {
	
	@Id
	@Schema(hidden = true)
	@Column(name="transactionId")
	private String transactionId;
	
	@NotNull
	@Column(name="numberOfTickets")
	private int numberOfTickets;

	@NotNull
	@Column(name="seatNumbers")
	private Set<String> seatNumbers;
	
	@NotBlank
	@Schema(hidden = true)
	@Column(name="movieName")
	private String movieName;
	
	@NotBlank
	@Schema(hidden = true)
	@Column(name="theaterName")
	private String theaterName;

	@NotBlank
	@Schema(hidden=true)
	@Column(name="userId")
    private String userId;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(String transactionId, @NotNull int numberOfTickets, @NotNull Set<String> seatNumbers,
			@NotBlank String movieName, @NotBlank String theaterName, @NotBlank String userId) {
		super();
		this.transactionId = transactionId;
		this.numberOfTickets = numberOfTickets;
		this.seatNumbers = seatNumbers;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.userId = userId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Set<String> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(Set<String> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
