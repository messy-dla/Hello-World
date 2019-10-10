package shiyanyi.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DomeController {

    @GetMapping("/index")
    public ModelAndView test()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return  mv;
    }

    @RequestMapping(value="/register")
    public ModelAndView Register(@ModelAttribute("form") User user) {  // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
        // 在 model 中添加一个名为 "user" 的 user 对象
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return  mv;
    }
}