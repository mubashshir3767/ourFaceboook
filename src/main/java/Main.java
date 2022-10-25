import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dto.RegisterDto;
import model.PostList;
import model.User;
import service.PostListService;
import service.UserService;

import javax.sound.midi.MidiFileFormat;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static PostListService postListService = new PostListService();
    static UserService userService = new UserService();

    public static void main(String[] args) throws IOException {
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
    //rahmat nurilloh rahmat
    private static void settings() {
    }

    private static void follows() {
    }

    private static void home() {
        int vv = 45;
        while (vv != 0) {
            System.out.println("1.showPost, 2.addPost");
            vv = scannerInt.nextInt();
            switch (vv) {
                case 1 -> {
                    Post();
                }
                case 2 -> {
                    showPost();
                }
            }
        }
    }

    private static void showPost() {
    }

    private static void Post() {
        int v1 = 4;
        while (v1 != 0) {
            PostList postList = new PostList();
            System.out.println("1.addPost, 2.removePost, 3.editPost, 4.showPost,  0.back");
            v1 = scannerInt.nextInt();
            switch (v1) {
                case 1 -> {
                    postListService.add(postList);
                }
                case 3 -> {
                    System.out.println("enter id for edit: ");
                    int id = scannerInt.nextInt();
                    postListService.edit(id, postList);
                }
                case 2 -> {
                    System.out.println("enter id for delete: ");
                    int id = scannerInt.nextInt();
                    postListService.delete(id);
                }
            }
        }
    }
}
