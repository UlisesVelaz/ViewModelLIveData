package com.androiddesdecero.viewmodellivedata.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.androiddesdecero.viewmodellivedata.User;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by ulisesvelázquez on 11/oct/22
 */
public class UserViewModel extends ViewModel {

    private List<User> userList;

    public UserViewModel() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    private UserViewModel(List<User> userList) {
        userList = userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
