package chapter8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chapter8")
public class FileUploadController {
@RequestMapping("/fileUpload")
    String printUpload(@RequestParam("name") String name,
                       @RequestParam("uploadfile")List<MultipartFile>uploadFiles,
                       HttpServletRequest httpServletRequest,
                       ModelMap model){
    if(!uploadFiles.isEmpty()&&uploadFiles.size()>0){
        for (MultipartFile file:uploadFiles){
//            获取文件名
            String original_name=file.getOriginalFilename();
            String dirPath=httpServletRequest.getServletContext().getRealPath("/tm_upload/");
            Date date=new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
//            在内存里面生成一个
            File filePath=new File(dirPath);//在服务器内
            if(filePath.exists()){
                //pass
            }else {
//                如果不存在，重新创建一个
                filePath.mkdirs();
            }
//            生成一个新文件的名字
            String newFileName=name+"_"+df.format(date)+"_"+original_name;
            File des=new File(dirPath+newFileName);
            try{
                file.transferTo(des);
            }catch (Exception e){
                e.printStackTrace();
                model.addAttribute("msg","文件传输异常，请重新上传！");
//                return "chapter8_status";
            }
        }
//        填充框内有内容
        model.addAttribute("msg","文件上传成功！");
        return "chapter8_status";
    }else{
//        填充框内无内容
        model.addAttribute("msg","没有文件，请重新上传");
        return "chapter8_status";
    }
}
}

