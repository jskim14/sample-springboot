package jskim.lines.sample.controller;

import jskim.lines.sample.model.Info;
import jskim.lines.sample.model.PasswordVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@Controller
public class SampleController {

    @GetMapping("/helloworld")
    public String helloworld() {
        Week we = Week.MONDAY;
        String str = Week.MONDAY.toString();
        System.out.println("str = " + str); //MONDAY
        System.out.println("we = " + we); //MONDAY ENUM왜쓰는거지...??
        return "Hello World";
    }

    @GetMapping("/password")
    public PasswordVo password(PasswordVo passwordVo) {
        System.out.println(passwordVo.getPassword());
        System.out.println(passwordVo.getUserId());

        List<Map<?,?>> svcevtPrprtys = new ArrayList<>();
        Map<String, Object> svcevtPrprtysMap = new HashMap<>();
        svcevtPrprtysMap.put("svcevtPrprtyCd", "pp00001401"); // 체크인 시간
        svcevtPrprtysMap.put("svcevtPrprtyVal", "pp00002207");
        svcevtPrprtys.add(svcevtPrprtysMap);

        svcevtPrprtysMap = new HashMap<>();
        svcevtPrprtysMap.put("svcevtPrprtyCd", "pp00001402"); // 체크 아웃 시간
        svcevtPrprtysMap.put("svcevtPrprtyVal", "pp00002209");
        svcevtPrprtys.add(svcevtPrprtysMap);
        System.out.println("svcevtPrprtys = " + svcevtPrprtys);
        System.out.println("svcevtPrprtysMap = " + svcevtPrprtysMap);
        System.out.println(svcevtPrprtysMap.containsKey("svcevtPrprtyCd"));

        boolean size = svcevtPrprtys.size() == 0;
        boolean nullTest = svcevtPrprtys == null;
        boolean empty = svcevtPrprtys.isEmpty();
        boolean contains = svcevtPrprtys.contains("svcevtPrprtyCd");

        System.out.println("empty = " + empty);
        System.out.println("nullTest = " + nullTest);
        System.out.println("size = " + size);
        System.out.println("contains = " + contains);

        return passwordVo;
    }



    /*
    @GetMapping("/lotto")
    public String lotto(){
        return "lotto되느냐";
    }

    @GetMapping("/blog")
    public String blogGet(@RequestParam String name, @RequestParam String id) {
        System.out.println("name = " + name);
        return name + "의 블로그입니다. " +id;
    }

    @PostMapping("/postblog")
    public String blogPost(@RequestBody Info info) {
        return info.getName() + "의 블로그입니다. " +info.getId();
    }
     */
}
