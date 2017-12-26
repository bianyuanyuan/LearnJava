package com.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where an I?");
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);//RuntimeException
        }
    }
}

class SomeOtherException extends Exception {
}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckException wrap=new WrapCheckException();
        wrap.throwRuntimeException(3);
        for(int i=0;i<10;i++){
            try{
                if(i<3){
                    wrap.throwRuntimeException(i);
                }else{
                    throw new SomeOtherException();
                }
            }catch (SomeOtherException e){
                System.out.println("SomeOtherException "+e);
            }catch (RuntimeException re){
                try{
                    throw re.getCause();
                }catch (FileNotFoundException e1){
                    System.out.println("FileNotFoundException "+e1);
                }catch (IOException e1){
                    System.out.println("IOException "+e1);
                }catch (Throwable e1){
                    System.out.println("Throwable "+e1);
                }
            }
        }
    }
}
