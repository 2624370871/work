package chapter8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chapter8")
public class FileLoadController {
    @RequestMapping("/upload")
String printUpload(){
    return "chapter8_fileupload";
}
@RequestMapping("/download")
    String printDownload(){
        return "chapter8_filedownload";
}

}
