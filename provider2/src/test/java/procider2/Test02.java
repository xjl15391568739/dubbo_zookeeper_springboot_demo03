package procider2;

import model.DeptEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.DeptService;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test02 {

    @Resource
    private DeptService deptService;


    //测试全查询
    @Test
    public void test(){
        try {
            List<DeptEntity> all = deptService.findAll();
            for (DeptEntity deptEntity : all) {
                System.out.println(deptEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
