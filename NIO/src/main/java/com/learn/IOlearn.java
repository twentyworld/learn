package com.learn;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by teemper on 2017/10/26, 19:35.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public class IOlearn {
    public static void main(String[] args) throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:example/init.txt");
        method2(file);
        System.out.println();
        method1(file);
    }

    public static void method2(File file){
        InputStream in = null;
        try{
            in = new BufferedInputStream(new FileInputStream(file));

            byte [] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while(bytesRead != -1)
            {
                for(int i=0;i<bytesRead;i++)
                    System.out.print((char)buf[i]);
                bytesRead = in.read(buf);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }finally{
            try{
                if(in != null){
                    in.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void method1(File file){
        RandomAccessFile aFile = null;
        try{
            aFile = new RandomAccessFile(file,"rw");
            FileChannel fileChannel = aFile.getChannel();

            //分配空间
            ByteBuffer buf = ByteBuffer.allocate(1024);

            //写入数据到Buffer
            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);

            while(bytesRead != -1)
            {
                buf.flip();
                while(buf.hasRemaining())
                {
                    //读取buffer中的数据
                    System.out.print((char)buf.get());
                    //使用get()方法从Buffer中读取数据 buf.get()
                }

                buf.compact();
                bytesRead = fileChannel.read(buf);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(aFile != null){
                    aFile.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
