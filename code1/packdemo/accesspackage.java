/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdemo;
import pack1.*;
import pack1.subpackage.*;
import pack2.*;
import pack2.subpackage.*;

/**
 *
 * @author suuky Masanan
 */
public class accesspackage {
    public static void main(String[] args)
    {
        first s=new first();
        s.display();
        second s1=new second();
        s1.display();
        third s2=new third();
        s2.display();
        fourth s3=new fourth();
        s3.display();
    }
}
