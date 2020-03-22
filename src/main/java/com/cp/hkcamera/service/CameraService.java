package com.cp.hkcamera.service;

import com.cp.hkcamera.mapper.CameraMapper;
import com.cp.hkcamera.model.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 11:09
 */
@Service
public class CameraService {
    @Autowired
    CameraMapper cameraMapper;

    public Camera add(Camera camera){
        return cameraMapper.insert(camera);
    }

    public Camera findbycamera(Integer cameraId){
        Camera camera = cameraMapper.findbycamera(cameraId);
        return camera;

    }
}
