package com.org;

//How an exception can be lost
@SuppressWarnings("ALL")
class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception";
    }
}

@SuppressWarnings("ALL")
class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try{
            LostMessage ls=new LostMessage();
            try{
                ls.f();
            }finally {
                ls.dispose();
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ExceptionsSilencer{
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }finally {
            return;//Using "return" inside the finally block will silence any thrown exception
        }
    }
}