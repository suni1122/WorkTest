package com.xsq.SimpleAuthorityManagement;

import com.xsq.SimpleAuthorityManagement.Factory.UserFactory;
import com.xsq.SimpleAuthorityManagement.Product.User;

public class Client {
    public static void main(String[] args) {
        User user;
        UserDAO userDAO=new UserDAO();
        int permission= userDAO.findPermission("zhangsan","123456");
        user= UserFactory.getUser(permission);
        user.sameOperation();
        user.diffOperation();
    }
}
