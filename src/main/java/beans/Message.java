package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message;

    @Autowired
    public Message(String messageString) {
        this.message = messageString;
    }

    public String getMessage() {
        return message;
    }
}
