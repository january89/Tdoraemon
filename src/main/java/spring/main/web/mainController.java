package spring.main.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Created by Park Tae Hwan on 2016-06-14.
 */
@Slf4j
@Controller
public class mainController {

    @RequestMapping("/")
    public String home(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        return "home";
    }

//    @RequestMapping("/index")
//    public String index(){
//        log.debug("hello world");
//        return "index";
//    }

}
