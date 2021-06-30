package com.how2java.springboot.Controller;

import com.how2java.springboot.dao.CategoryDAO;
import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
@RunWith(SpringRunner.class)
@SpringBootTest
public class He {
    @Autowired CategoryMapper categoryMapper;
    @Autowired CategoryDAO categoryDAO;
    @RequestMapping("/zeng")
    public String listCategory(Model m) throws Exception{
        List<Category> cs=categoryMapper.findAll();
        m.addAttribute("cs",cs);
        return "listcategory";
    }
    @Test
    public void test(){
        List<Category> cs=categoryMapper.findAll();
        for (Category c:cs){
            System.out.println(c.getName());
        }
    }
    @Test
    public void save(){
        List<Category> cs2=categoryDAO.findByName("斧王");
        for (Category c:cs2){
            System.out.println(c.getName());
        }
    }

}
