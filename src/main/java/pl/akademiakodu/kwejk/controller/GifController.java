package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.GifDao;

@Controller
public class GifController {





    @Autowired
    private GifDao gifDao;






    @GetMapping("/")
    public String home(){
        return "home";
    }


}