package com.cp.hkcamera.utils;

import java.io.*;
import java.util.List;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 12:41
 */
public class SyncPipe extends Thread{
    String rtsp = null;
    Process p = null;
    List<String> list = null;
    File videoAddress = null;

    public SyncPipe(List<String> list) {
        this.list = list;
    }

    public SyncPipe(List<String> list, File videoAddress) {
        this.list = list;
        this.videoAddress = videoAddress;
    }


    public synchronized void connectToCamera() {
        try {
            //在指定目录执行命令
            ProcessBuilder processBuilder = new ProcessBuilder(list);
            processBuilder.directory(videoAddress);
            //ProcessBuilder重定向标准错误
            processBuilder.redirectErrorStream(true);
            p = processBuilder.start();
            //防止ffmpeg进程塞满缓存造成死锁
            new PrintStream(parse(p.getErrorStream()));
            new PrintStream(parse(p.getInputStream()));
        } catch (Exception e) {
            System.out.println("error 1");
            e.printStackTrace();
        }
    }

    //inputStream转outputStream
    private ByteArrayOutputStream parse(InputStream in) throws Exception {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(new String(temp.getBytes("utf-8"), "utf-8"));
            swapStream.write(temp.getBytes());
        }
        return swapStream;
    }

    public void cancel() {
        if (p.isAlive()) {
            p.destroy();
        }
        System.out.println("close thread");
        //interrupt();
    }

    @Override
    public void run() {
        connectToCamera();
    }
}
