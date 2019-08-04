package com.westar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class IndexController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String uploaFile(MultipartFile file, HttpServletRequest request){
        try {
            String dir = request.getServletContext().getRealPath("/upoad");
            File fileDir = new File(dir);
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String fileName = UUID.randomUUID().toString()+fileSuffix;

            File files = new File(fileDir.getAbsolutePath()+File.separator+fileName);
            file.transferTo(files);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping(value = "/mult/upload",method = RequestMethod.POST)
    @ResponseBody
    public String multUploaFile(MultipartFile[] file, HttpServletRequest request){
        try {
            String dir = request.getServletContext().getRealPath("/upoad");
            File fileDir = new File(dir);
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            for (int i=0,len =file.length;i<len; i++){
                String fileSuffix = file[i].getOriginalFilename().substring(file[i].getOriginalFilename().lastIndexOf("."));
                String fileName = UUID.randomUUID().toString()+fileSuffix;

                File files = new File(fileDir.getAbsolutePath()+File.separator+fileName);
                file[i].transferTo(files);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
