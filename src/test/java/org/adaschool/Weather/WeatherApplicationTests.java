package org.adaschool.Weather;

import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {

	@Autowired
	private WeatherReportService weatherReportService;

	@Test
	void testGetWeatherReportService() {

		WeatherReport report = weatherReportService.getWeatherReport(4.6438, -74.0856);


		assertEquals(0, report.getTemperature());
		assertEquals(87, report.getHumidity());
	}

	@Test
	void contextLoads() {
		// Verifica que el contexto de Spring se carga correctamente
	}
}
