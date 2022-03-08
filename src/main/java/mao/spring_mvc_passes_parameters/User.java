package mao.spring_mvc_passes_parameters;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Project name(项目名称)：Spring_MVC_passes_parameters
 * Package(包名): mao.spring_mvc_passes_parameters
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 13:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class User
{
    private String name;
    private String password;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("password：").append(password).append('\n');
        return stringbuilder.toString();
    }

}
