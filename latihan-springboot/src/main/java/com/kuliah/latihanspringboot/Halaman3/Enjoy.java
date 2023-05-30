package com.kuliah.latihanspringboot.Halaman3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/api")
@Slf4j
public class Enjoy {
    @GetMapping(value = "/Enjoy")
    public String openLoginPage(HttpServletResponse httpServletResponse, HttpServletResponse request){
        log.info("Selamat Menikmati Web Kami");
        return "Enjoy";
    }
}

