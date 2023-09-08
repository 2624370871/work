package chapter4.comTemplate;

public class UserAction {
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    public int getNumber(){
        System.out.println("第一步,我是action！");
        return  this.userService.getNumber();
    }
    public void updateInsert(User user) {
        this.userService.updateInsert(user);
    }
    public void updateDelete(User user) {
        this.userService.updateDelete(user);
    }
    public void findAllMap() {
        this.userService.findAllMap();
    }
}
