package model;
import lombok.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ToString(callSuper = true)
@Setter
@Getter
@NoArgsConstructor

public class PostList extends Base {

    private SimpleDateFormat time = new SimpleDateFormat();
    private int postNumeric;
    private String name;
    private String word;
    private String postName;
    private String shareUserName="";
    private int likeCount=0;
    private int userId;
    private boolean isLike;
    private static int i = 0;
    private int size = 0;

    @Override
    public String toString() {
        return  "FACEBOOK\n"+"[" +name+"] "+time+"\n"+
                shareUserName+
              "\n"+ postName + "\n" +
                 word + "\n\n(1)Like"+ likeCount + " (2)comment (3)share \n(4)next  (5)back  (6)setting";
    }
}
