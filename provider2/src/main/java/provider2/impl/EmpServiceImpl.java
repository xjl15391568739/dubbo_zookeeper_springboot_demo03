package provider2.impl;

import com.alibaba.dubbo.config.annotation.Service;
import model.EmpEntity;
import org.springframework.transaction.annotation.Transactional;
import service.EmpService;

/**
 * 
 * @author djin
 *    Emp业务层实现类
 * @date 2020-05-11 15:35:04
 */
@Service(version = "1.0.0")
@Transactional
public class EmpServiceImpl extends BaseServiceImpl<EmpEntity> implements EmpService {
	
}
