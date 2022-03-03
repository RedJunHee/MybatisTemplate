package kr.pe.study.mybatisstudy.controller;

import kr.pe.study.mybatisstudy.dao.SalesDTO;
import kr.pe.study.mybatisstudy.mapper.Sales;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@MapperScan("kr.pe.study.mybatisstudy.mapper")
@Controller
public class WebController {

    @Autowired
    Sales SalesService;

    @ResponseBody
    @RequestMapping("/")
    public String startPoint() {
        System.out.println(" / 타는지 ");

        List<SalesDTO> salesList = SalesService.getSales();

        for(SalesDTO sale : salesList)
            System.out.println(sale.toString());

        return "aa";
    }
}
