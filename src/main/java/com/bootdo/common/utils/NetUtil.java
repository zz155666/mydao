package com.bootdo.common.utils;

import java.net.InetAddress;

/**
 *
 *
 */
public class NetUtil {

    public static String getLocalIP(){
        try {

            InetAddress addr = InetAddress.getLocalHost();

            String hostAddr = addr.getHostAddress();

            return hostAddr;
        }catch (Exception e){
            return "localhost";
        }
    }

    public static void main(String[] args) {
        System.out.println(NetUtil.getLocalIP());
    }


}
