package com.mdd.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class OOMObject {
    }


    public static void main(String[] args) {
        List<OOMObject> objects = new ArrayList<OOMObject>();

        while (true) {
            objects.add(new OOMObject());
        }
    }

}
