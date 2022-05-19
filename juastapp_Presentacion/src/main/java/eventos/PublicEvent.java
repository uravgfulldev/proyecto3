/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

/**
 *
 * @author Hugo Rivera
 */
public class PublicEvent {
     private static PublicEvent instance;
     private EventChat eventChat;
     private EventUser eventUser;
    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }

    public void addEventChat(EventChat event) {
        this.eventChat = event;
    }
    
    public void addEventUser(EventUser user){
        this.eventUser=user;
    }
    
    public EventUser getEventUser() {
        return eventUser;
    }

   

    public EventChat getEventChat() {
        return eventChat;
    }
}
