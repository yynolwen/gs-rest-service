package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YongYanOspiea on 16/08/2016.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {

        return "index";
    }
}
