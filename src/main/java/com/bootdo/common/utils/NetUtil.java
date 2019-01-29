package com.bootdo.common.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 *
 */
public class NetUtil {

    public static String getLocalIP(){
        String SERVER_IP = null;
        try {
            Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
             InetAddress ip = null;
            while (netInterfaces.hasMoreElements()) {
                 NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
                 if(ni.isVirtual()){
                     continue;
                 }
                 if(ni.getDisplayName().contains("VMware")){
                     continue;
                 }
                 if(ni.getInetAddresses().hasMoreElements()){
                     ip = (InetAddress) ni.getInetAddresses().nextElement();
                     SERVER_IP = ip.getHostAddress();
                     if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress()
                             && ip.getHostAddress().indexOf(":") == -1) {
                         SERVER_IP = ip.getHostAddress();
                         break;
                     } else {
                         ip = null;
                     }
                 }
           }
        } catch (SocketException e) {
           // TODO Auto-generated catch block
          return "localhost";
       }

        return SERVER_IP;
    }

    public static void main(String[] args) {
        System.out.println(NetUtil.getLocalIP());
    }


}
