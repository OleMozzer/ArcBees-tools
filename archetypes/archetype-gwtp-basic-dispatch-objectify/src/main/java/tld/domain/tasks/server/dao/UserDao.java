package tld.domain.tasks.server.dao;

import tld.domain.tasks.shared.domain.User;

public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }

    public User findByGoogleId(String googleId) {
        return ofy().query(User.class).filter("googleId =", googleId).first().get();
    }
}
