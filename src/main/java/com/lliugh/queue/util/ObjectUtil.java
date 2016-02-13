package com.lliugh.queue.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)ObjectUtil.java 1.0 12/02/2016
 */

public class ObjectUtil {
    /**
     * 对象转byte[]
     *
     * @param obj
     * @return
     * @throws java.io.IOException
     */
    public static byte[] objectToBytes(Object obj) throws Exception {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        byte[] bytes = bo.toByteArray();
        bo.close();
        oo.close();
        return bytes;
    }

    /**
     * byte[]转对象
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static Object bytesToObject(byte[] bytes) throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        ObjectInputStream sIn = new ObjectInputStream(in);
        return sIn.readObject();
    }
}
