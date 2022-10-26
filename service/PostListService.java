package service;

import model.PostList;

import java.util.Stack;

public class PostListService {
    Stack<PostList> postLists = new Stack<>();

    public PostList getById(int id) {
        for (PostList postList : postLists) {
            if (postList != null) {
                if (postList.getId() == id) {
                    return postList;
                }
            }
        }
        return null;
    }

    public void add(PostList postList) {
        if (postList != null) {
            postList.setPostNumeric(1);
            postLists.add(postList);
        }
    }

    public PostList showUserId(int id) {
        for (PostList postList : postLists) {
            if (postList != null) {
                if (id == postList.getUserId()) {
                    return postList;
                }
            }
        }
        System.out.println("post mavjud emas!");
        return null;
    }

    public void showGetNUm(int num,int id) {
        for (PostList postList : postLists) {
            if (postList != null) {
                if (num == postList.getPostNumeric()) {
                    if (id == postList.getId())
                     System.out.println(postList);
                }
            }
        }
    }

    public boolean edit(int id, PostList postList) {
        if (getById(id) != null) {
            postLists.remove(getById(id));
            postLists.add(postList);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        if (getById(id) != null) {
            postLists.remove(getById(id));
            return true;
        }
        return false;
    }


//    Map< PostList,PostList> map = new HashMap<>();
//    private int generation = 0;
//
//    public boolean add(PostList lenta) {
//        boolean flag = map.containsValue(lenta);
//        if (!flag) {
//            map.put(lenta, lenta);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean edit(PostList lenta, PostList lenta1) {
//        if (map.containsKey(lenta)) {
//            map.put(lenta, lenta1);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean share(PostList lenta, String name) {
//     lenta.setPostName(name);
//     map.put(generation++,lenta);
//     return true;
//    }
//
//    public void showPost(boolean f){
//        boolean ff=true;
//        Collection<PostList> keys = map.values();
//        for (PostList lenta : keys) {
//             if (lenta != null){
//                 if (f==ff) {
//                     System.out.println(lenta);
//          }}}}
//
//    public boolean delete(PostList lenta){
//        PostList flag = map.remove(lenta);
//        return flag != null;
//    }

}
