package com.zking.ssm.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-12-04 20:01
 */
@Data
//验证
@EqualsAndHashCode(of=("username"))
public class User  implements Serializable {
//    声明接口,验证接口组
    public static interface VaildateGroup{
        public static interface Login{

        }
        public static interface  Reg{

        }
    }
    private Long userId;
//    判断是否为空，验证
    @NotBlank(message = "账号不能为空",groups = {User.VaildateGroup.Login.class, User.VaildateGroup.Reg.class})
    private String username;
    @NotBlank(message ="密码不能为空",groups = {User.VaildateGroup.Login.class, User.VaildateGroup.Reg.class})
    private String password;
    @NotBlank(message ="确认密码不能为空",groups = {User.VaildateGroup.Reg.class})
    private String password2;

}
