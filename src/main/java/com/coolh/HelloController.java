package com.coolh;

import com.coolh.modle.Gril;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    Gril gril;

//    http://127.0.0.1:8082/gril/test/100
    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public String test(@PathVariable Integer id){
        return "hello my controller:"+id;
    }
//    http://127.0.0.1:8082/gril/test2?id=20
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
//    @GetMapping(value = "/test2")
//    @PostMapping(value = "/test2")
    public String test2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "hello my controller2:"+id;
    }
    @RequestMapping(value = "/gril",method = RequestMethod.GET)
    public String girl(){
        return gril.getName();
    }


}
