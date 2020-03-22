package com.cp.hkcamera.mapper;

import com.cp.hkcamera.model.Camera;

public interface CameraMapper {
    Camera insert(Camera camera);

    int insertSelective(Camera record);

    Camera findbycamera(Integer cameraId);
}