package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.ArrayList;
import java.util.List;

//*.
// implement a prototype service to detect a user's location based on their IP address.
// The IP addresses belonging to the IPv4 space are conventionally represented by four octets, "a.b.c.d" .
// to keep it simple these IP address are classified into 5 diff regions indexed from 1 to 5 on the basis of the order of the bits in the first octet.
// Broadly, the IP addresses are categorized as : 1. 0.0.0.0 - 127.255.255.255 2. 128.0.0.0 => 191.255.255.255 3. 192.0.0.0 => 223.255.255.255 4. 224.0.0.0 => 239.255.255.255 5 - 240.0.0.0 => 255.255.255.255.
// Given a list of strings, ip_addresses of size n, representing possible IPv4 addresses, for each address,
// determine if its valid IP or not & classify it into one of the 5 classes.
// Return an array of n integers that represents th3e index of the regions for the corresponding IP addresses.
// Represent invalid IP as -1. Suppose ip_addresses = ["128.0.0.0","31.258.90.11] , the ans here is [2, -1]
// *
//
// /
public class IpClassifier {
    public static List<Integer> classifyIpAddresses(List<String> ipAddresses){
        List<Integer> result = new ArrayList<>();
        for (String ip: ipAddresses){
            if(isValidIp(ip)){
                String[] octate = ip.split("\\.");
                int firstOctate = Integer.parseInt(octate[0]);
                // classify based on 1st octate
                if (firstOctate >= 0 && firstOctate <= 127){
                    result.add(1);
                } else if (firstOctate >= 128 && firstOctate <= 191){
                    result.add(2);
                } else if (firstOctate >= 192 && firstOctate <= 223){
                    result.add(3);
                } else if (firstOctate >= 224 && firstOctate <= 239){
                    result.add(4);
                } else if (firstOctate >= 240 && firstOctate <= 255){
                    result.add(5);
                }
            }else {
                result.add(-1);
            }
        }
        return result;

    }
    public static boolean isValidIp(String ipAddress){
        String[] octate = ipAddress.split("\\.");
        if(octate.length != 4){
            return false;
        }
        try {
            for (String part: octate){
                int num = Integer.parseInt(part);
                if( num < 0 || num > 255){
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e){
            return false;
        }

    }

    public static void main(String[] args) {
        List<String> ipAddresses = List.of("128.0.0.0", "31.258.90.11", "192.168.1.1", "224.0.0.1", "256.1.1.1");
        List<Integer> results = classifyIpAddresses(ipAddresses);
        for (int i: results){
            System.out.println(i);
        }

    }
}
