import java.util.ArrayList;
import java.util.Arrays;

public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		 
		if(statement.length() == 0){
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		
		else if (findKeyword(statement, "robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}
		
		else if (findKeyword(statement, "i like", 0) >= 0)
		{
			response = transformIYouStatement(statement);
		}

		else
		{
			int psn = findKeyword(statement, "you", 0);


			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private boolean isLetter(String c){
		return (c.compareTo("a") >= 0 && c.compareTo("a") <= 25);
	}
	 
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = " " + statement.trim().toLowerCase() + " ";
		int psn = phrase.indexOf(goal, startPos);
		
		if(psn > -1 && (isLetter(phrase.substring(psn - 1, psn)) || isLetter(phrase.substring(psn + goal.length(), psn + goal.length() + 1))))
			return findKeyword(statement, goal, psn + 1);
		
		return psn - 1;
	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
	
	private String getStringForParameters(String statement, String[]params){
		ArrayList<String> punctuation = new ArrayList<String>(Arrays.asList(new String[]{".", "?", "!"}));
		
		String phrase = statement.trim();
		if(punctuation.indexOf(phrase.substring(phrase.length() - 1, phrase.length())) ==  phrase.length() - 1)
			phrase = phrase.substring(0, phrase.length() - 1);
		
		int psn_1 = findKeyword(phrase, params[0]);
		int psn_2 = params[1] != null ? findKeyword(phrase, params[1]) : phrase.length();
		
		return phrase.substring(psn_1 + params[0].length(), psn_2).replace("you", "me");
	}
	
	private String transformIWantToStatement(String statement){
		String rm = getStringForParameters(statement, new String[]{"i want to", null});
		if(rm.trim().length() > 0)
			return "What would it mean to" + rm + "?";
		else
			return getRandomResponse();
	}
	
	private String transformYouMeStatement(String statement){
		String rm = getStringForParameters(statement, new String[]{"you", "me"});
		if(rm.trim().length() > 0)
			return "What makes you think that I" + rm + "you?";
		else
			return getRandomResponse();		
	}
	
	private String transformIYouStatement(String statement){
		String rm = getStringForParameters(statement, new String[]{"i like", null});
		if(rm.trim().length() > 0)
			return "Why do you like" + rm + "?";
		else
			return getRandomResponse();
	}
}
