package com.test9;

import java.util.*;

class Snow {
}

class Power extends Snow {
}

class Light extends Power {
}

class Heavy extends Power {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

class Test extends Light{

}
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Power());
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy(),new Test());//
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
