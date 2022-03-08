package mao.spring_mvc_passes_parameters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Project name(项目名称)：Spring_MVC_passes_parameters
 * Package(包名): mao.spring_mvc_passes_parameters
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 13:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class MyController
{
    /**
     * Test 1 string.
     *
     * @param user  the user
     * @param model the model
     * @return the string
     */
    @RequestMapping("test1")
    public String test1(User user, Model model)
    {
        String result = "执行test1，用户名：" + user.getName() + ", 密码：" + user.getPassword();
        model.addAttribute("message", result);
        return "main";
    }

    /**
     * Test 2 string.
     *
     * @param name     the name
     * @param password the password
     * @param model    the model
     * @return the string
     */
    @RequestMapping("test2")
    public String test2(String name, String password, Model model)
    {
        String result = "执行test2，用户名：" + name + ", 密码：" + password;
        model.addAttribute("message", result);
        return "main";
    }

    /**
     * Test 3 string.
     *
     * @param request the request
     * @param model   the model
     * @return the string
     */
    @RequestMapping("test3")
    public String test3(HttpServletRequest request, Model model)
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String result = "执行test3，用户名：" + name + ", 密码：" + password;
        model.addAttribute("message", result);
        return "main";
    }

    /**
     * Test 4 string.
     *
     * @param name     the name
     * @param password the password
     * @param model    the model
     * @return the string
     */
    @RequestMapping("test4/{name}/{password}")
    public String test4(@PathVariable String name, @PathVariable String password, Model model)
    {
        String result = "执行test4，用户名：" + name + ", 密码：" + password;
        model.addAttribute("message", result);
        return "/main";
    }

    /**
     * Test 5 string.
     *
     * @param name     the name
     * @param password the password
     * @param model    the model
     * @return the string
     */
    @RequestMapping("test5")
    public String test5(@RequestParam(value = "username") String name, @RequestParam(required = false) String password, Model model)
    {
        String result = "执行test5，用户名：" + name + ", 密码：" + password;
        model.addAttribute("message", result);
        return "main";
    }

    /**
     * Test 6 string.
     *
     * @param user  the user
     * @param model the model
     * @return the string
     */
    @RequestMapping("test6")
    public String test6(@ModelAttribute("user") User user, Model model)
    {
        String result = "执行test1，用户名：" + user.getName() + ", 密码：" + user.getPassword();
        model.addAttribute("message", result);
        return "main";
    }
}
