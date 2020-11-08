/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main kalkulator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator value = new Kalkulator();
        
        value.setValue1(7.0);
        value.setValue2(5.0);
        
        System.out.println("VALUE 1 = " + value.getValue1());
        System.out.println("VALUE 2 = " + value.getValue2());
        value.setNameProject();
        value.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + value.add(value.getValue1(), value.getValue2()));
        System.out.println("Result Minus is = " + value.minus(value.getValue1(), value.getValue2()));
        System.out.println("Result Multiple is = " + value.multiplication(value.getValue1(), value.getValue2()));
        System.out.println("Result Division is = " + value.division(value.getValue1(), value.getValue2()));
        
    }
    
}
