package base.pkg.controller;

import base.pkg.entity.PushNotiPermissionToken;
import base.pkg.repo.TokenRepository;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST},allowCredentials = "true")
public class NotificationPermissionTokenController {

    @Autowired
    TokenRepository tokenRepository;

    @Autowired
    private FirebaseMessaging firebaseMessaging;

    @PostMapping("/NotificationPermission")
    public String receiveToken(@RequestBody Map<String, String> body){
        String token = body.get("token");
        PushNotiPermissionToken pushNotiPermissionToken = new PushNotiPermissionToken();
        pushNotiPermissionToken.setToken(token);
        tokenRepository.save(pushNotiPermissionToken);

        Notification notification = Notification
                                .builder()
                                .setTitle("Notification title")
                                .setBody("This is the notification body")
                                .build();

        Message message = Message.builder()
                                .setToken(token)
                                .setNotification(notification)
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
