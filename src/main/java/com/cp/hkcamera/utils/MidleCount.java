package com.cp.hkcamera.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 12:41
 */
public class MidleCount {

    static Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
    //static Hashtable hashtable = new Hashtable();

    public static void add(Integer cameraid ,int count){
        boolean x = mp.containsKey(cameraid);
        if(x == false){
            count = count + 1;
            mp.put(cameraid,count);
        }else{
            Integer a = mp.get(cameraid);
            count = a + 1;
            mp.put(cameraid,count);
        }
    }

    public static Integer reduce(Integer cameraid){
        Integer  b =mp.get(cameraid);
        Integer c = b - 1;
        mp.put(cameraid,c);
        return c;
    }

    public static Map<Integer, Integer> getMp() {
        return mp;
    }

    public static void setMp(Map<Integer, Integer> mp) {
        MidleCount.mp = mp;
    }
}
