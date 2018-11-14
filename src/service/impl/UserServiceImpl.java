package service.impl;

import dao.UserDao;
import entity.User;
import service.UserService;

/**
 * Created by Administrator on 2018/11/14.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
