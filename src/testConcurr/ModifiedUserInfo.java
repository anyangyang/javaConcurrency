package testConcurr;

/**
 * Created by zhujiating on 2017/8/10.
 */
public class ModifiedUserInfo extends  Thread{
   private User user;
   private String name;
   private String pwd;

    public ModifiedUserInfo(User user,String name,String pwd){
        this.user = user;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public void run() {
        user.modifiedUserInfo(name,pwd);

    }
}
