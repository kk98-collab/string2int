/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string2int;
import java.util.*;
/**
 *
 * @author sk
 */
public class String2int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(s2i("hk0g9g0l3"));
    }
    
    public static int s2i(String a) {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] ch = a.split("");
        int res = 0;
        for(int i=0; i<ch.length; i++) {
            if (Arrays.asList(number).indexOf(ch[i])!=-1) {
                res=res*10+Arrays.asList(number).indexOf(ch[i]);
            }
        }
        return res;
    }
    
}
