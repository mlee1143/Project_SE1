package edu.westga.se1.collectiblemanager.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.se1.collectiblemanager.model.Collectible;
import edu.westga.se1.collectiblemanager.model.Condition;

class TestCollectible {

	@Test
	void testValidConstructor() {
		Collectible collectible = new Collectible("Name", 10, 2020, "desc", Condition.USED);

		assertAll("check params are equal", () -> assertEquals("Name", collectible.getName()),
				() -> assertEquals(10, collectible.getPrice()), () -> assertEquals(2020, collectible.getYear()),
				() -> assertEquals("desc", collectible.getDescription()),
				() -> assertEquals(Condition.USED, collectible.getCondition()));
	}

	@ParameterizedTest
	@CsvSource({ ", 10, 2020, Desc, USED", " , 10, 2020, Desc, USED" })
	void testInvalidConstructor(String name, double price, int year, String description, Condition condition) {
		assertThrows((IllegalArgumentException.class), () -> {
			new Collectible(name, price, year, description, condition);
		});
	}

}
