package car.controller;

import car.entity.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
    @RequestMapping("/carInfo")
//    返回carInfo 找到carInfo.jsq页面
    public String printHelloCar(){
        return "carInfo";
    }
        @RequestMapping(value = "/carBase", method = RequestMethod.GET)
        public ModelAndView carBase(@RequestParam("id") int id, @RequestParam("price") int price,
                                    @RequestParam("age") int age, @RequestParam("color") String color,
                                    @RequestParam("brand") String brand) {
            Car car = new Car(id, price, age, color, brand);

            car.setId(id);
            car.setPrice(price);
            car.setAge(age);
            car.setColor(color);
            car.setBrand(brand);
            String message = "车的颜色是:" + color + ",品牌是:" + brand + ",年龄是:" + age + ",价格是:" + price;
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("success");
            modelAndView.addObject("id", id);
            modelAndView.addObject("message", message);
            return modelAndView;
        }
    }
