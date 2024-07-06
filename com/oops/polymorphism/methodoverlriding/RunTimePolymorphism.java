package com.oops.polymorphism.methodoverlriding;

class SamsungMobile{
    String devicename;
    String version;
    int devicestorage;
    double ram;
    public void mobileDetails(String devicename, String version, int devicestorage, double ram){
        this.devicename = devicename;
        this.version = version;
        this.devicestorage = devicestorage;
        this.ram = ram;
    }}
class RedmiMobile extends SamsungMobile{
    public void mobileDetails(String devicename, String version, int devicestorage, double ram){
        this.devicename = devicename;
        this.version = version;
        this.devicestorage = devicestorage;
        this.ram = ram;
        System.out.println("Mobile name:" +devicename + "Mobile version:" + version + "Mobile storage:" + devicename + "Mobile ram:" + ram);
    }
}



public class RunTimePolymorphism {
    public static void main(String[] args) {
        RedmiMobile redmiMobile = new RedmiMobile();
        System.out.println("Samsung mobile details:");
        redmiMobile.mobileDetails("Samsung", "Android",42,4.00);
        System.out.println("Redmi mobile details:");
        redmiMobile.mobileDetails("Redmi", "Android",50,3.5);
        System.out.println("Apple mobile details:");
        redmiMobile.mobileDetails("Apple", "IOS",128,6);

    }
}
