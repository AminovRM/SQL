import controllers.MainController;
import models.Contact;
import models.User;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        var controller = new MainController();

        User user1 = new User();
        user1.setId(1);
        user1.setName("Petya");

        Contact contact = new Contact();
        contact.setPhone("+4645465465");
        contact.setContactName("sdfsdf");
        contact.setEmail("sdfsdf@eric.ru");

        var meta=new HashMap<String, Object>();
        meta.put("traceId", "qqqqqqqqqqqqqq");
        meta.put("userId", 1);
        meta.put("time", new Date().getTime());

        controller.addContact(user1, contact, meta);
        controller.close();
    }
}
