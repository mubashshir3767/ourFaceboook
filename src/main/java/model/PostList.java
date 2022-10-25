package model;
import lombok.*;
@ToString(callSuper = true)
@Setter
@Getter
@NoArgsConstructor
public class PostList extends Base {
    private String word;
    private String postName;
    private int likeCount;
    private int userId;
    private boolean isLike;

    @Override
    public String toString() {
        return "PostList{" +
                "word='" + word + '\'' +
                ", postName='" + postName + '\'' +
                ", likeCount=" + likeCount +
                ", userId=" + userId +
                ", isLike=" + isLike +
                '}';
    }
}
