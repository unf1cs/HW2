package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1992;
        int monthOfBirthday = 3;
        int dayOfBirthday = 10;
        boolean monthBiggerDay;
        char[] array = {'И','в','а','н'};
        double myAge=29.0;
        double partYear= 1.0/12.0;
        int summ = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: "+summ);
        if (monthOfBirthday>dayOfBirthday){
            monthBiggerDay=true;
            System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        } else if (monthOfBirthday<dayOfBirthday){
            monthBiggerDay=false;
            System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        }
        System.out.print("Массив с моим именем: ");
        System.out.println(array);
        System.out.println("Мне "+(myAge+partYear)+" лет");
    }
}
