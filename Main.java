import dto.LentaDto;
import dto.RegisterDto;
import model.PostList;
import model.User;
import service.PostListService;
import service.UserService;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static PostListService postListService = new PostListService();
    static UserService userService = new UserService();
    static PostList postList111 = new PostList();
    static User user1 = new User();
    static int num = 0;

    public static void main(String[] args) throws IOException {
        int v1 = 3;
        while (v1 != 0) {
            System.out.println("1.register, 2.login, 0.exit");
            v1 = scannerInt.nextInt();
            switch (v1) {
                case 1 -> {
                    User user = new User();
                    user1 = RegisterDto.sing_up(user);
                    userService.add(user1);
                }
                case 2 -> {
                    System.out.println("enter password: ");
                    String password = scannerStr.nextLine();
                    System.out.println("enter number: ");
                    String number = scannerStr.nextLine();
                    User user = userService.login(password, number);
                    if (user != null) {
                        app();
                    } else {
                        System.out.println("no user !!!");
                    }
                }
            }
        }
    }

    private static void app() {
        int v = 3;
        while (v != 0) {
            System.out.println("1.Home, 2.follows, 5.settings, 0.exit");
            v = scannerInt.nextInt();
            switch (v) {
                case 1 -> {
                    home();
                }
                case 2 -> {
                    follows();
                }
                case 5 -> {
                    settings();
                }
            }
        }
    }

    private static void settings() {
    }

    private static void follows() {
    }

    //=============== HOME ======================
    private static void home() {
        int vv = 45;
        while (vv != 0) {
            System.out.println("1.myProfile, 2.showPosts");
            vv = scannerInt.nextInt();
            switch (vv) {
                case 1 -> {
                    myProFile();
                }
                case 2 -> {

                }
            }
        }
    }

    //===============MY PROFILES================
    private static void myProFile() {
        int v1 = 4;
        while (v1 != 0) {
            PostList postList = new PostList();
            System.out.println("1.addPost,  2.showPosts,  0.exit");
            v1 = scannerInt.nextInt();
            switch (v1) {
                case 1 -> {
                    postList111 = LentaDto.addList(postList, user1);
                    postListService.add(postList111);
                }
                case 2 -> {
                    showMyPost();
                }
            }
        }
    }

    private static void showMyPost() {
        int v1 ;
        v1 = 1;
        if (postList111.getSize() >= 1) {
        while (v1 != 0) {
                int i = 0;
                switch (v1) {
                    case 1 -> {
                        if (num <= postList111.getSize()) {
                            postListService.showGetNUm(++num, user1.getId());
                        } else System.out.println("post mavjud emas");
                        System.out.print("n..  ");
                        i = scannerInt.nextInt();
                        if (i == 1) like();
                        if (i == 2) comment();
                        if (i == 3) share();
                        if (i == 4) v1 = 1;
                        if (i == 5) v1 = 2;
                        if (i == 6) v1 = 3;
                        if (i == 7) v1 = 0;
                    }
                    case 2 -> {
                        if (num >= 1) {
                            postListService.showGetNUm(--num, user1.getId());
                        } else System.out.println("post mavjud emas");
                        System.out.print("n..  ");
                        i = scannerInt.nextInt();
                        if (i == 1) like();
                        if (i == 2) comment();
                        if (i == 3) share();
                        if (i == 4) v1 = 1;
                        if (i == 5) v1 = 2;
                        if (i == 6) v1 = 3;
                        if (i == 7) v1 = 0;
                    }
                    case 3 -> {
                        showPostGeretaion(user1.getId());
                    }
                }
            }
        } else System.out.println("post mavjud emas");
    }

    private static void showPostGeretaion(int id) {
        int v1 = 4;
        while (v1 != 0) {
            PostList postList = postListService.showUserId(id);
            System.out.println(" 1.delete, 2.edit, 3.setting, 0.exit");
            v1 = scannerInt.nextInt();
            switch (v1) {
                case 1 -> {
                    System.out.println(postListService.delete(postList.getId()));
                }
                case 2 -> {
                    System.out.println(postListService.edit(id, postList));
                }
                case 3 -> {
                    showMyPost();
                }
            }
        }
    }

    //==============post uchun comment,like,share===============
    private static void postLCSH() {
        int i = 5;
        while (i != 0) {
            System.out.println(postList111);
            if (num > postList111.getSize()) {
                postListService.showGetNUm(++num, user1.getId());
            }
            System.out.print("n.. : ");
            i = scannerInt.nextInt();
            if (i == 1) {
                like();
            } else if (i == 2) {
                comment();
            } else if (i == 3) {
                share();
            } else if (i == 4) {
                return;
            }
        }
    }

    private static void share() {
        postList111.setPostName(user1.getName());
        postListService.add(postList111);
        postLCSH();
    }

    private static void comment() {
        System.out.println("hali mavjud emas");
        postLCSH();
    }

    private static void like() {
        postList111.setLikeCount(postList111.getLikeCount() + 1);
        showMyPost();
    }
}
