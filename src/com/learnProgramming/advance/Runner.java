package com.learnProgramming.advance;

public class Runner {
    public static void main(String[] args) {

        Class1 class1 = new Class1(9, "Julian Alvares", "Mancity");

//        class1.setName("Mbappe");
//        class1.setNumber(7);
//        class1.setClub("Paris Saint Germain");

        System.out.println(class1.getName());
        System.out.println(class1.getNumber());
        System.out.println(class1.getClub());

        Child child = new Child();
        Parent parent = new Parent();

        // child bisa memanggil function dari parant
        System.out.println(child.parentName());
        // child bisa memanggil function milik sendiri
        System.out.println(child.namaAnak());
        // parent bisa memanggil function milik sendiri
        System.out.println(parent.umurAyah());
    }

}
