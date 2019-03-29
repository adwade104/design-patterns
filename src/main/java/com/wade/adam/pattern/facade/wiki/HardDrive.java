package com.wade.adam.pattern.facade.wiki;

public class HardDrive {

    public byte[] read(long lba, int size) {

        System.out.println("Hard Drive reading: (lba=" + lba + ",size=" + size + ")");
        return new byte[10];
    }

}
