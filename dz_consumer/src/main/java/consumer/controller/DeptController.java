package consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import model.DeptEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DeptService;

import java.util.List;
import java.util.Map;
 
/**
 * 
 * @author djin
 *   Dept控制器
 * @date 2020-05-11 15:35:04
 */
@Controller
@RequestMapping("/dept")
public class DeptController extends BaseController<DeptEntity>{

    @Reference(version = "1.0.0")
    private DeptService deptService;
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "dept";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/static/html/dept.html";
    }

    /**
	 * 加载（分页） 根据是否存在条件加载
	 */
    @RequestMapping("/listByPramas")
    @ResponseBody
    public Map<String, Object> listByPramas(Integer page, Integer limit, DeptEntity dept){
        try {
            map = deptService.findListByPramas(page, limit, dept);
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
    public PageInfo<DeptEntity> pageByPramas(Integer page, Integer limit, DeptEntity dept){
        try {
            return deptService.findPageByPramas(page,limit,dept);
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
    public DeptEntity loadObjectByPramas(DeptEntity dept){
        try {
            return deptService.findObjectByPramas(dept);
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
    public List<DeptEntity> loadAll(){
        try {
            return deptService.findAll();
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
    public String delete(DeptEntity dept){
        try {
            return deptService.remove(dept);
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
            return deptService.removeBatch(ids);
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
    public String saveT(DeptEntity dept){
        try {
            return deptService.save(dept);
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
    public String updT(DeptEntity dept){
        try {
            return deptService.upd(dept);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

}
