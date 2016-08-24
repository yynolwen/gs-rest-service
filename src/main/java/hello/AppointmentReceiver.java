package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by YongYanOspiea on 16/08/2016.
 */

@RestController
@EnableWebMvc
public class AppointmentReceiver {

    @RequestMapping("/")
    //public @ResponseBody CallResult callACandidate(@RequestParam(value="name", required=true) String name, @RequestParam(value="tel", required=true) String tel) {
    public @ResponseBody CallResult callACandidate() {

        CallResult callResult = new CallResult();
        callResult.setName("name");
        callResult.setTel("tel");

        //ici on fait les appels.....
        boolean result = true;// callService.callCandidate(name,tel);


        callResult.setRdvPrise(result);

        return callResult;
    }

    @RequestMapping("/callACandidate2")
    public CallResult CallResult(@RequestParam(value="name",  required=true, defaultValue="World") String name,  @RequestParam(value="tel", defaultValue="0011223344", required=true) String tel)  {
        return new CallResult(name,tel,true);
    }

}



