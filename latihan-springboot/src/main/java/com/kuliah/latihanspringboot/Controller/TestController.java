package com.kuliah.latihanspringboot.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/api")
@Slf4j
public class TestController {
    @GetMapping(value = "/login")
    public String openLoginPage(HttpServletResponse httpServletResponse, HttpServletResponse request){
        log.info("Selamat Anda Berhasil Masuk Ke Halaman Login");
        return "Login";
    }
}
