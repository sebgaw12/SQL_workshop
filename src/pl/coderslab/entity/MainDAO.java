package pl.coderslab.entity;

import java.util.Arrays;

public class MainDAO {

    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
//        User user = new User();
//        user.setUserName("john");
//        user.setEmail("cos@tam");
//        user.setPassword("abc123");
//        userDAO.create(user);

//        System.out.println(userDAO.read(1));
//
//        User user = userDAO.read(1);
//        user.setEmail("jakis@email");
//        user.setUserName("vseeg");
//        user.setPassword("tajnehaslo");
//        userDAO.update(user);
//        System.out.println(userDAO.read(1));

        User[] all = userDAO.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}
