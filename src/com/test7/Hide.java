package com.test7;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 12.3f;
    }
}

class MilHourse {
}


class Bart extends Homer {
    void doh(MilHourse m) {
        System.out.println("doh(MilHourse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh('x');
        bart.doh(67.0f);
        bart.doh(new MilHourse());
    }
}
