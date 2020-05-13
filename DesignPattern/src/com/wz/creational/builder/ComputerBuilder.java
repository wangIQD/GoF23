package com.wz.creational.builder;

/**
 * @author 隔壁老王
 * @create 2020-04-28 19:07
 * @description
 */
//抽象建造者
public abstract class ComputerBuilder {

    public abstract void buildCPU(String CPU);

    public abstract void buildMotherboard(String motherboard);

    public abstract void buildRAM(String RAM);

    public abstract void buildGPU(String GPU);

    public abstract void buildMonitor(String monitor);

    //组装电脑
    public abstract Computer AssembleComputer();
}
