package testConcurr;

/**
 * Created by zhujiating on 2017/8/10.
 */
public class User {
    private String userName = "a";
    private String password = "aa";
    public Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public synchronized void modifiedUserInfo(String name, String pwd){
        try{
            setUserName(name);
            Thread.sleep(3000);
            setPassword(pwd);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void testSuspend(){
        System.out.println("线程"+Thread.currentThread().getName()+":begin");

        if(Thread.currentThread().getName() == "a"){
            System.out.println("从这里开始线程a会一直暂停了");
            Thread.currentThread().suspend();
        }
        System.out.println("线程"+Thread.currentThread().getName()+":end");
    }

    public static void main(String[] args){
        User user = new User();
        System.out.println(user.age);
    }

}
