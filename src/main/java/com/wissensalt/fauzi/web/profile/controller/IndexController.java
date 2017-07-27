package com.wissensalt.fauzi.web.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 7/27/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class IndexController {

    @GetMapping("*/")
    public String displayIndex(){
        return "index";
    }
}
