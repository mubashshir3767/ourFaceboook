package service;

import model.PostList;

import java.util.ArrayList;

public interface BaseService {

    boolean add();
    boolean edit(int id);
    boolean delete(int id);
    Object getById(int id);
}
