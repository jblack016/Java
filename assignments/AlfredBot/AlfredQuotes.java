import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting(){
        // you do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name){
        // your code here
        return String.format( "Hello, lovely to see you %s", name);
    }

    public String dateAnnouncement(){
        return String.format("Current date is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation){

        if(conversation.indexOf("Alexis") > -1){
            return "She's no help, how can I be of assistance?";
        }
        if(conversation.indexOf("Alfred") > - 1){
            return "At your service, how can I be of assistance?";
        }

        return  "for snarky response return string";
    }
    // ninja bonus 
    // see the specs to overload the guessGreeting method
    // sensei bonus
    // write your own AlfredQuote method using any of the String methods you have learned.

}