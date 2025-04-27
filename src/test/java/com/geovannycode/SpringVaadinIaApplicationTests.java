package com.geovannycode;

import com.geovannycode.domain.ClaudeAIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringVaadinIaApplicationTests {

	@Autowired
	private ClaudeAIService claudeAIService;

	@Test
	void testClaudeAIResponse() {
		String result = claudeAIService.chatWithClaude("¿Qué es Vaadin?");
		assertNotNull(result, "La respuesta no debe ser nula.");
		assertFalse(result.isEmpty(), "La respuesta no debe estar vacía.");
	}
}
