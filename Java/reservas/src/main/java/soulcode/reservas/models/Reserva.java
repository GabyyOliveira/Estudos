package soulcode.reservas.models;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Reserva {

	private String id;
	private String nomeReserva;
	private LocalDate dataCheckin;
	private LocalDate dataCheckout;
	private Integer numeroHospedes;
	
	
	public Reserva(String id, String nomeReserva, LocalDate dataCheckin, LocalDate dataCheckout,
			Integer numeroHospedes) {
		super();
		this.id = id;
		this.nomeReserva = nomeReserva;
		this.dataCheckin = dataCheckin;
		this.dataCheckout = dataCheckout;
		this.numeroHospedes = numeroHospedes;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNomeReserva() {
		return nomeReserva;
	}


	public void setNomeReserva(String nomeReserva) {
		this.nomeReserva = nomeReserva;
	}


	public LocalDate getDataCheckin() {
		return dataCheckin;
	}


	public void setDataCheckin(LocalDate dataCheckin) {
		this.dataCheckin = dataCheckin;
	}


	public LocalDate getDataCheckout() {
		return dataCheckout;
	}


	public void setDataCheckout(LocalDate dataCheckout) {
		this.dataCheckout = dataCheckout;
	}


	public Integer getNumeroHospedes() {
		return numeroHospedes;
	}


	public void setNumeroHospedes(Integer numeroHospedes) {
		this.numeroHospedes = numeroHospedes;
	}
	
	
}
