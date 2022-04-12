package soulcode.reservas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import soulcode.reservas.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, String>{

	Optional<Reserva> findByNomeReserva(String nome);
}
