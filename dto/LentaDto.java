package dto;

import model.PostList;
import model.User;

import java.util.Scanner;

public class LentaDto {
   static Scanner scanner = new Scanner(System.in);
   static Scanner scannerint = new Scanner(System.in);
    public static PostList addList(PostList postList,User user){
        int cut=18;
        postList.setName(user.getName());
        postList.setUserId(user.getId());
        System.err.println("enter postName");
        postList.setPostName("   "+scanner.nextLine());
        System.out.println("Write.. ");
        String write = scanner.nextLine();
        StringBuilder a = new StringBuilder();
        for (int s = 0; s<write.length(); s++){
             if(s != cut){
                 a.append(write.charAt(s));
             }else {
                 a.append("\n" +write.charAt(s));
                 cut+=18;
             }
        }
        postList.setWord(a.toString());
        postList.setSize(postList.getSize()+1);
        postList.setPostNumeric(postList.getPostNumeric());

        return postList;
    }

}
