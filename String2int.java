/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string2int;
import java.lang.Math;

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
        System.out.println(s2i("abc573"));
    }
    
    public static int s2i(String a) {
        int res = 0;
        for(int i=0; i<a.length(); i++) {
            if ('0'<=a.charAt(i) & a.charAt(i)<='9') {
                res = res*10 + a.charAt(i) - '0';
            }
        }
        return res;
    }
    
}
