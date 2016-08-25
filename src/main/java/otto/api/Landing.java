package otto.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karl Otto on 4/10/2016.
 */
@RestController
@RequestMapping("/")
public class Landing {
    @RequestMapping(method = RequestMethod.GET)
    public String Index(){
        return "Landing Page";
    }
}
