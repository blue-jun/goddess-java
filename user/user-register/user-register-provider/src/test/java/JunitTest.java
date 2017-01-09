import com.bjike.goddess.user.common.entity.Money;
import com.bjike.goddess.user.register.service.impl.TestMoneySer;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.bjike.goddess.dbs.jpa.exception.SerException;
import com.bjike.goddess.user.register.dto.UserRegisterDto;
import com.bjike.goddess.user.register.service.IUserRegisterSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import user_register_code.ApplicationConfiguration;

/**
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: [用户注册业务测试]
 * @Version: [1.0.0]
 * @Copy: [org.ndshop]
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class JunitTest{

    /**
     * 基础增删改查，批量操作等
     */

    private IUserRegisterSer userRegisterSer;
    @Autowired
    private TestMoneySer moneySer;

    @Test
    public void testMoneyAdd(){
        Money money = new Money();
        money.setAccount("123");
        try {
            moneySer.addMoney(money,100);
        } catch (SerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMoneyAccountAdd(){
        try {
            moneySer.addAccount("123",new Integer(100));
        } catch (SerException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void existUsername() throws SerException {
        boolean users = userRegisterSer.existUsername("liguiqin");
        System.out.println(users);
    }

    @Test
    public void existPhone() throws SerException {
        boolean users = userRegisterSer.existPhone("13457910241");
        System.out.println(users);
    }

    @Test
    public void sendCodeToPhone() throws SerException {
        UserRegisterDto dto = new UserRegisterDto();
        dto.setPhone("123456");
        userRegisterSer.sendCodeToPhone(dto);
    }

    @Test
    public void verifyCodeAndReg() throws SerException {
        UserRegisterDto dto = new UserRegisterDto();
        dto.setPhoneCode("123");
        userRegisterSer.verifyCodeAndReg(dto);
    }

    @Test
    public void saveUser() throws SerException {
        UserRegisterDto dto = new UserRegisterDto();
        dto.setPhoneCode("123");
        userRegisterSer.verifyCodeAndReg(dto);
    }


    @Test
    public void generateRegAuthCode() throws SerException {
        userRegisterSer.generateRegAuthCode("123456789");
        System.out.println("111");
    }






}
