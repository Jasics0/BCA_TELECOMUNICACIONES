/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author henry
 */
public class prueba {

    public static void main(String[] args) {
        
        Date prueba= new Date(121,0,1);
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(prueba));

    }

}
