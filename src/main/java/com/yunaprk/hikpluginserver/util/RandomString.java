package com.yunaprk.hikpluginserver.util;
import org.apache.commons.text.RandomStringGenerator;

/**
 * @author xzhang
 * @date 2019/2/1
 */
public class RandomString {
    public static String randomStr(){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        return  generator.generate(20);
    }

    public static String randomStr(int len){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        return  generator.generate(len);
    }



    public static String randomNum(int len){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', '9').build();
        return  generator.generate(len);
    }

    public static String randomNum(){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', '9').build();
        return  generator.generate(20);
    }

    public static String randomMix(int len){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z').build();
        return  generator.generate(len);
    }

    public static String randomMix(){
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', 'z').build();
        return  generator.generate(20);
    }
}
