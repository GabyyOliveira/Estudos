package soulcode.reservas.services;

import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soulcode.reservas.models.Reserva;
import soulcode.reservas.repositories.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	ReservaRepository reservaRepository;
	
	public int calculoDeDias(String nome) {
		Optional<Reserva> reserva = reservaRepository.findByNomeReserva(nome);
		return Period.between(reserva.get().getDataCheckin(), reserva.get().getDataCheckout()).getDays();
	}
}
