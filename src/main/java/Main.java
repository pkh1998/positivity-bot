//package main;

import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    public static void main(String[] args) throws LoginException{
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDM0ODI4NzY2MzQ3NTI2MTQ1.DbQWzw.mY_YkwWN_chyztyCUPo_uWrdbek";
        builder.setToken(token);
        builder.addEventListener(new Main());
        builder.buildAsync();
        String[] challenges = {"",
                                ""};
        //List&lt;Member&gt; mentionedMembers = commandEvent.getMessage().getMentionedMembers();
        //Member victim = mentionedMembers.get(0);
    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event){

        if(event.getAuthor().isBot()){
            return;
        }

        System.out.println("We received a message from"+
                event.getAuthor().getName() + ":" +
                event.getMessage().getContentDisplay() );

        if(event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }

        if(event.getMessage().getContentRaw().equals("!puntime")){
            event.getChannel().sendMessage("How does a Computer get drunk? It takes screenSHOTS XD").queue();
        }

        if(event.getMessage().getContentRaw().equals("damn")){
            event.getChannel().sendMessage("Did you mean: Dazzling Artistry My Neighbor!").queue();
        }

        if(event.getMessage().getContentRaw().equals("fuck")){
            event.getChannel().sendMessage("*ahem* Try \"Golly Gee Whiz\" next time!").queue();
        }

        if(event.getMessage().getContentRaw().equals("asshole")){
            event.getChannel().sendMessage("The word arse in English derives from the Germanic root -arsaz, which " +
                    "originated from the Proto-Indo-European root -ors, meaning \"buttocks\" or \"backside\". " +
                    "The combined form arsehole is first attested from 1500 in its literal use to refer to the anus. " +
                    "The metaphorical use of the word to refer to the worst place in a region (e.g., \"the arsehole of the world\"), " +
                    "is first attested in print in 1865; the use to refer to a contemptible person is first attested in 1933. " +
                    "Interesting fact: Pablo Picasso was never called an asshole.").queue();
        }

        if(event.getMessage().getContentRaw().equals("f u")) {
            event.getChannel().sendMessage("Fordham University?").queue();
        }

    }


}
