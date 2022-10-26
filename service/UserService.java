package service;

import dto.RegisterDto;
import model.User;

import java.util.ArrayList;

public class UserService implements BaseService {
    ArrayList<User> users = new ArrayList<>();

    public User login(String password, String number) {
        for (User user : users) {
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    if (user.getPhoneNumber().equals(number)) {
                        return user;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public boolean add() {
      return true;
    }
    public boolean add(User user1){
        if (getById(user1.getId()) == null) {
            users.add(user1);
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(int id) {
        User user = (User) getById(id);
        if (user != null) {
            if (user.getId() == id) {
                RegisterDto.sing_up(user);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        User user = (User) getById(id);
        if (user != null) {
            users.remove(user);
            return true;
        }
        return false;
    }

    @Override
    public Object getById(int id) {
        for (User user1 : users) {
            if (user1 != null) {
                if (user1.getId() == id) {
                    return user1;
                }
            }
        }
        return null;
    }

    public void show() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }
}
