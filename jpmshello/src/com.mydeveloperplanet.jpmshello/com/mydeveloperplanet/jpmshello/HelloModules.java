
package com.mydeveloperplanet.jpmshello;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
import com.mydeveloperplanet.jpmshi.HiModules;

public class HelloModules {

    public static void main(String[] args) {
        System.out.println("Hello Modules");
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);
        HiModules hiModules = new HiModules();
        System.out.println("**: " + hiModules.getHi());
    }

}