package provider1;

import model.DeptEntity;
import model.EmpEntity;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.DeptService;
import service.EmpService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test01 {

    @Resource
    private EmpService empService;

    private static final Logger log = Logger.getLogger(Test01.class);

    //测试全查询
    @Test
    public void test(){
        try {
            List<EmpEntity> all = empService.findAll();
            for (EmpEntity empEntity : all) {

                log.info(empEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Resource
    private DeptService deptService;

    //测试分页查询
    @Test
    public void test01(){
        Map<String,Object> map = new HashMap<String, Object>();
        DeptEntity pramasDept = new DeptEntity();
        try {
            map = deptService.findListByPramas(1,3,pramasDept);
            System.out.println("总共有"+map.get("count")+"数据");
            List<DeptEntity> depts = (List<DeptEntity>)map.get("data");
            for (DeptEntity dept:depts) {
                System.out.println(dept);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
