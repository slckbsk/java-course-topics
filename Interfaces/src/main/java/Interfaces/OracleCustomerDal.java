/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author sb
 */
public class OracleCustomerDal implements ICustomerDal, IRepsotory {

    @Override
    public void Add() {
        System.out.println("Oracle eklendi");
    }

}