package spring.main.web;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.lang.System.out;

/**
 * Created by Park Tae Hwan on 2016-06-14.
 */
@Slf4j
@Controller
public class mainController {

    private static final Logger log = LoggerFactory.getLogger(mainController.class);

    @RequestMapping("/home")
    public String index(){
        out.println("들어옴!?");
        return "home";
    }

}
