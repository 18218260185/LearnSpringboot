package com.how2java.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class UnloadPage {
    @RequestMapping("/uploadPage")
    public String uploadPage(){
        return "uploadPage";
    }
    @RequestMapping(value = "/upload",method= RequestMethod.POST)
    public String upload(HttpServletRequest rep, @RequestParam("file") MultipartFile file, Model m){
        try {
            String fileNmae=System.currentTimeMillis()+file.getOriginalFilename();
            String destFileName=rep.getServletContext().getRealPath("")+"uploaded"+ File.separator+fileNmae;
            File destFile = new File(destFileName);
            destFile.getParentFile().mkdirs();
            file.transferTo(destFile);
            m.addAttribute("fileName",fileNmae);
        }catch (Exception e){
            e.printStackTrace();
            return "上传失败"+e.getMessage();
        }
        return "showImg";
    }
}
