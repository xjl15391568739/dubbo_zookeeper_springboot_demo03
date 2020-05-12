package provider1.impl;

import com.alibaba.dubbo.config.annotation.Service;
import model.DeptEntity;
import org.springframework.transaction.annotation.Transactional;
import service.DeptService;

/**
 * 
 * @author djin
 *    Dept业务层实现类
 * @date 2020-05-11 15:35:04
 */
@Service(version = "1.0.0")
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<DeptEntity> implements DeptService {
	
}
