package com.wz.creational.builder;

/**
 * @author 隔壁老王
 * @create 2020-04-28 18:59
 * @description
 */
//业务场景：隔壁老王由于电脑过老，需要自己组装一台新的台式机
//实际产品
public class Computer {
    //属性过多，只列举一部分
    private String CPU;     //CUP
    private String motherboard;   //主板
    private String RAM;     //内存条
    private String GPU;     //显卡
    private String monitor; //显示器

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", GPU='" + GPU + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }
}
