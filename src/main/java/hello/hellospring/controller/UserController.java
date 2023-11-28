package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.domain.User;
import hello.hellospring.service.MemberService;
import hello.hellospring.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @PostMapping("/user")
    public String create(MemberForm form) {
        User user = new User();
        user.setName(form.getName());
        userService.createUser(user);
        System.out.println("member.getName() = " + user.getName());
        return "redirect:/";
    }

    @Operation(summary = "문자열 반복", description = "파라미터로 받은 문자열을 2번 반복합니다.")
    @Parameter(name = "str", description = "2번 반복할 문자열")
    @GetMapping("/users")
    public String list(Model model) {
        List<User> users = userService.findUsers();
        System.out.println(users);
        model.addAttribute("users", users);
        return "home";
    }
}
