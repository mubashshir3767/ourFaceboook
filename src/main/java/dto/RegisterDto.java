package dto;

import model.User;

import java.util.Scanner;

public  class RegisterDto {
   static   Scanner scanner = new Scanner(System.in);
    public static  User sing_up(User user){

        System.out.println("enter name: ");
        user.setName(scanner.nextLine());
        System.out.println("enter number: ");
        user.setPhoneNumber(scanner.nextLine());
        System.out.println("enter password: ");
        user.setPassword(scanner.nextLine());
        System.out.println("enter Email: ");
        user.setEmail(scanner.nextLine());
        System.out.println("enter userName: ");
        user.setUserName(scanner.nextLine());

        return user;
    }

}
