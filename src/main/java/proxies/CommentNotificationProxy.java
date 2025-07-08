package proxies;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
