package Serializable;

import java.io.Serializable;
import java.net.URL;

/**
 * Created by bjhexiong on 6/29/2017 AD.
 */
public class TestSerializable implements Serializable{


    public static void main(String[] args) {

//        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for(URL url : urls){
//            System.out.println(url.toExternalForm());
//
//        }
        System.out.println();

        Integer s = 1000;
        Integer s1 = s;
        Integer s2 = s;
        System.out.println(s1 == s2);

    }
}
