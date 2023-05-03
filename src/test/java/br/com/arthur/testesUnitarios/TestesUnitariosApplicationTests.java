package br.com.arthur.testesUnitarios;

import br.com.arthur.testesUnitarios.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestesUnitariosApplicationTests {
	@Test
	public void UserTests() {
		User user = new User("name", 12, "DOC12543");
		assertEquals("name", user.name);
		assertTrue(user.toString().contains("User{"));
	}
}
