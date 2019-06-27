import com.itheima.domain.TStudent;
import com.itheima.domain.TStudentExample;
import com.itheima.domain.TUser;
import com.itheima.domain.TUserExample;
import com.itheima.mapper.TStudentMapper;
import com.itheima.mapper.TUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MapperTest {


    @Autowired
    private TUserMapper user;

    @Autowired
//    private Date date;

    @Test
    public void Test(){
//        System.out.println(date);
    }


    @Test
    public void Test1(){
        List<TUser> tUsers = user.selectByExample(null);
        for (TUser tUser : tUsers) {
            System.out.println(tUser);
        }
    }

    @Test
    public void Test2(){
        TUser tUser = new TUser();
        tUser.setName("zs");
        tUser.setPassword("123");
        int insert = user.insert(tUser);
        System.out.println(insert);
    }

    @Test
    public void Test3(){
        TUser tUser = user.selectByPrimaryKey(2);
        System.out.println(tUser);
    }

    @Test
    public void Test4(){
        TStudentExample example = new TStudentExample();
        TStudentExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo("haohao");

    }


}
