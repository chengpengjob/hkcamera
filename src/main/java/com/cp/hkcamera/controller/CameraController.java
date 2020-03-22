package com.cp.hkcamera.controller;

import com.cp.hkcamera.model.Camera;
import com.cp.hkcamera.service.CameraService;
import com.cp.hkcamera.utils.CameraUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 12:45
 */
@RestController
public class CameraController {

    @Autowired
    CameraService cameraService;


    @GetMapping("/camera/{cameraId}/play")
    public String  playVideo(@PathVariable Integer cameraId){
        /*CameraUtil cameraUtil = new CameraUtil();
        cameraUtil.getCameraList();*/

        //获取对应的CameraIndexCode
        Camera camera = cameraService.findbycamera(cameraId);

        return camera.getCameraindexcode();
    }

}
