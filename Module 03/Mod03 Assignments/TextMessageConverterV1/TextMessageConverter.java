
/**
 * TextMessageCoverterV1 - This program converts standard writing into "Text speak" for the purpose of 
 * compression. (ie. laugh out loud to LOL, be right back to BRB, etc..)
 *@author Ricky Mutschlechner
 *@version 10/06/2010
 */
public class TextMessageConverter
{   
    public static void main(String [ ] args)
    {
     
	 String message1 = "i don't know if i will be right back or not because right now i am laughing out loud.";
	
	
	//Original Message
	System.out.println("Original Message:");
	System.out.println(message1);
	System.out.println("message length: " + message1.length() + " characters");
	System.out.println();
	//Converts Original Message
         String result = message1.replaceAll("(?:laughing out loud)", "LOL");
         result = result.replaceAll("(?:because)", "cuz");
         result = result.replaceAll("(?:be right back)", "BRB");
         result = result.replaceAll("(?:i don't know)", "404");
         result = result.replaceAll("(?:right)", "rite");
         result = result.replaceAll("(?:know)", "kno");
         result = result.replaceAll("(?:what's up)", "sup");
         result = result.replaceAll("(?:how are you)", "hru");
         result = result.replaceAll("(?:for your information)", "fyi");
	//Revised Message
	System.out.println("New Message:");
	System.out.println(result);
	System.out.println("message length: " + result.length() + " characters");
	
	
	
	
    } // end of main method
} // end of class