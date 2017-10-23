package test;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;

import core.MessageConverter;

public class MessageConverterTest {

	@Test
	public void messageConverterTest() throws JSONException {
		String mes = "{\"ssn\":\"160578-9787\",\"creditScore\":598,\"loanAmount\":10.0,\"loanDuration\":6}";
		String expectedOutput = "{\"ssn\":1605789787,\"creditScore\":598,\"loanAmount\":10.0,\"loanDuration\":72}";
		MessageConverter mc = new MessageConverter();
		assertEquals(expectedOutput, mc.processMessage(mes));
	}

}
