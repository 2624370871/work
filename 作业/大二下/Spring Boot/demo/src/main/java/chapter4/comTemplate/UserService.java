package chapter4.comTemplate;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
    public int getNumber(){
        System.out.println("第二步,我是service！");
        return  this.userDao.getNumber();
    }
    public void updateInsert(User user) {
        this.userDao.insertUpdate(user);
    }
    public void updateDelete(User user) {
        this.userDao.updateDelete(user);
    }
    public void findAllMap() {
        this.userDao.findAllMap();
    }
}
