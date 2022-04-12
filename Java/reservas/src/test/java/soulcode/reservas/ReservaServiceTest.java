package soulcode.reservas;

import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import soulcode.reservas.models.Reserva;
import soulcode.reservas.repositories.ReservaRepository;
import soulcode.reservas.services.ReservaService;

@RunWith(SpringRunner.class)
public class ReservaServiceTest {
	
	@TestConfiguration
	static class ReservaSeerviceTestConfig{
		
		@Bean
		public ReservaService reservaService() {
			return new ReservaService();
		}
		
	}
	
	@Autowired
	ReservaService resService;
	
	@MockBean
	ReservaRepository reservaRepository;

	@Test
	public void reservaTestServiceCalculoDeDias() {
		String nome = "Gabriela";
		int dias = resService.calculoDeDias(nome);
		Assertions.assertEquals(dias, 10);
	}
	
	@Before
	public void setup() {
		LocalDate checkIn = LocalDate.parse("2022-06-05");
		LocalDate checkOut = LocalDate.parse("2022-06-15");
		Reserva reserva = new Reserva("1", "Gabriela", checkIn, checkOut,2);
		
		Mockito.when(reservaRepository.findByNomeReserva(reserva.getNomeReserva())).thenReturn(java.util.Optional.of(reserva));
	}
}
