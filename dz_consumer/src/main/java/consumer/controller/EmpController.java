package consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import model.EmpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.EmpService;

import java.util.List;
import java.util.Map;


 
/**
 * 
 * @author djin
 *   Emp控制器
 * @date 2020-05-11 15:35:04
 */
@Controller
@RequestMapping("/emp")
public class EmpController extends BaseController<EmpEntity>{

    @Reference(version = "1.0.0")
    private EmpService empService;
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "emp";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/static/html/emp.html";
    }

    /**
	 * 加载（分页） 根据是否存在条件加载
	 */
    @RequestMapping("/listByPramas")
    @ResponseBody
    public Map<String, Object> listByPramas(Integer page, Integer limit, EmpEntity emp){
        try {
            map = empService.findListByPramas(page, limit, emp);
            map.put("code", SUCCESSCODE);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return putMsgToJsonString(FAILCODE,FAILMSG,FAILCOUNT,null);
        }
    }

    /**
     * 加载（分页） 根据是否存在条件加载
     */
    @RequestMapping("/pageByPramas")
    @ResponseBody
    public PageInfo<EmpEntity> pageByPramas(Integer page, Integer limit, EmpEntity emp){
        try {
            return empService.findPageByPramas(page,limit,emp);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件查询单个结果
     *
     */
    @RequestMapping("/loadObjectByPramas")
    @ResponseBody
    public EmpEntity loadObjectByPramas(EmpEntity emp){
        try {
            return empService.findObjectByPramas(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件查询单个结果
     *
     */
    @RequestMapping("/loadAll")
    @ResponseBody
    public List<EmpEntity> loadAll(){
        try {
            return empService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件删除
     *
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(EmpEntity emp){
        try {
            return empService.remove(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
    * 批量删除
    */
    @RequestMapping("/deletes")
    @ResponseBody
    public String deletes(Integer[] ids){
        try {
            return empService.removeBatch(ids);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

    }

    /**
     * 添加
     */
    @RequestMapping("/saveT")
    @ResponseBody
    public String saveT(EmpEntity emp){
        try {
            return empService.save(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/updT")
    @ResponseBody
    public String updT(EmpEntity emp){
        try {
            return empService.upd(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

}
