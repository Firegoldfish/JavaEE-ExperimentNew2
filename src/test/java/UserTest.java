import com.hjy.aop.dao.UserDao;
import com.hjy.aop.dao.UserDaoImpl;
import com.hjy.aop.proxy.UserProxy;

public class UserTest {
    public static void main(String[] args) {
        UserProxy userProxy = new UserProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao)userProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.delUser();
    }
}
