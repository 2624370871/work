package chapter8.controller;

import com.sun.deploy.net.HttpResponse;
import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@Controller
@RequestMapping("/chapter8")
public class FileDownloadController {
    @RequestMapping("/fileDownload1")
    String printFileDownload1(HttpServletRequest request,
                              HttpServletResponse response,
                              String filename,
                              ModelMap model){
        System.out.println(filename);
        model.addAttribute("message","要下载的文件是"+filename);
//        定义输入输出流
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try{
            //下载文件逻辑
            String path=request.getServletContext().getRealPath("/WEB-INF/upload");
            File file=new File(path+File.separator+filename);

//            获取文件大小
            long filelength=file.length();
//            处理文件名的编码问题
                filename=transFilenameEndcoding(request,filename);
                response.setContentType("application/x-msdownload");
                response.setHeader("Content-disposition","attachment;filename="+filename);
                response.setHeader("Content-Length",String.valueOf(filelength));

                bis=new BufferedInputStream(new FileInputStream(file));
                bos=new BufferedOutputStream(response.getOutputStream());
                int bytesRead=0;
                byte[] buff=new byte[2048];
                while (-1!=(bytesRead=bis.read(buff,0, buff.length))){
                    bos.write(buff,0,bytesRead);
                }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bis!=null){
                try {
                    bis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(bos!=null){
                try {
                    bos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return "hello";

    }
    @RequestMapping("/fileDownload2")
    public ResponseEntity<byte[]>fileDownload(HttpServletRequest request,String filename) throws Exception{
String path=request.getServletContext().getRealPath("/WEB-INF/upload");
File file=new File(path+File.separator+filename);
        filename=this.transFilenameEndcoding(request,filename);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentDispositionFormData("attachment",filename);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }
    String transFilenameEndcoding(HttpServletRequest request,String filename) throws Exception{
//        微软编码类型
        String[] keyWords={"MSIE","Trident","Edge"};
//        获取user-agent
        String userAgent=request.getHeader("User-Agent");
        for (String each:keyWords){
            if(userAgent.toLowerCase().contains(each.toLowerCase())){
//                统一编码utf-8
                return URLEncoder.encode(filename,"utf-8");
            }
        }
        return new String(filename.getBytes("UTF-8"),"ISO-8859-1");
    }
}
