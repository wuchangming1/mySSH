package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by Administrator on 2018/11/14.
 */
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User user) {
        this.hibernateTemplate.save(user);
    }
}
