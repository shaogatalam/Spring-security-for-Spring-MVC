package base.pkg.service;
import base.pkg.model.NotificationMessage;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirebaseMessagingService {

    @Autowired
    private FirebaseMessaging firebaseMessaging;

    public String sendNotificationByToken (NotificationMessage notificationMessage){

        Notification notification = Notification
                .builder()
                .setTitle("Notification title")
                .setBody("And This is Notification body")
                //.setImage(notificationMessage.getImage())
                .build();

        Message message = Message
                .builder()
                .setToken("notificationMessage.getRecipientToken()")
                .setNotification(notification)
                //.putAllData(notificationMessage.getData())
                .build();

        try {
            firebaseMessaging.send(message);
            return "Success Sending Notification";
        } catch (FirebaseMessagingException e) {
            e.printStackTrace();
            return "Error Sending Notification";
        }

    }
}
