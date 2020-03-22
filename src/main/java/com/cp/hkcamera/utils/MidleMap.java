package com.cp.hkcamera.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 12:41
 */
public class MidleMap {

    static Map<Integer,Object> m = new HashMap<Integer, Object>();

    public static void getHashMap(Integer cameraId,Object num){
        m.put(cameraId,num);

    }

    public static Object getnum(Integer cameraId){
        Object p = null;
        int cp = cameraId;
        for (Map.Entry<Integer, Object> entry : m.entrySet()) {
            if( entry.getKey() == cp){
                p = entry.getValue();
            }
        }
        return p;
    }
}
