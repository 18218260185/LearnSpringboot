package com.how2java.springboot.web;

import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class He {
    @Autowired CategoryMapper categoryMapper;

    @RequestMapping("/zeng")
    public String listCategory(Model m) throws Exception{
        List<Category> cs=categoryMapper.findAll();
        m.addAttribute("cs",cs);
        return "listcategory";
    }
}
