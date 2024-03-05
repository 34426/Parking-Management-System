package com.rabbiter.pm.controller;


import com.rabbiter.pm.service.StallTypeService;
import com.rabbiter.pm.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rabbiter
 * @since 2023-03-30
 */
@RestController
@RequestMapping("/stallType")
public class StallTypeController {

    @Autowired
    private StallTypeService stallTypeService;

    @GetMapping("/list")
    public ResultJson<Object> getList(){
        return ResultJson.success(stallTypeService.list());
    }

}

