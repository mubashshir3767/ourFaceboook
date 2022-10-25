package dto;

import model.PostList;
import model.User;

import java.util.Scanner;

public class LentaDto {
   static Scanner scanner = new Scanner(System.in);
    public static PostList addList(PostList postList, User user){
        postList.setName(user.getName());
        System.out.println("Write.. ");
        postList.setWord(scanner.nextLine());


        return null;
    }

}
