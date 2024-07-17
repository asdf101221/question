package question;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringQuestionTest {

	@Test
	public void extractAndFormatNumber() {
		String noPointNumber="Str423423";
		System.out.println("no proint number: " + StringQuestion.extractAndFormatNumber(noPointNumber));
		
		String pointString="Str423423.120131233243200";
		System.out.println("point number:" + StringQuestion.extractAndFormatNumber(pointString));
		
		String noNumber="Str";
		System.out.println("noNumber:" + StringQuestion.extractAndFormatNumber(noNumber));
		
		
	}

}
