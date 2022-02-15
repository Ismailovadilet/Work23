package com.company.week;

public class Main {
    public static void main(String[] args) {
        Day day = Day.TUESDAY;

        switch (day){
            case MONDAY -> System.out.println("Дуйшомбу куну жава окуйм");
            case TUESDAY -> System.out.println("Шейшемби куну англис тили сабагын окуйм");
            case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм");
            case THURSDAY -> System.out.println("Бейшемби куну толкинг клаб окуйм");
            case FRIDAY -> System.out.println("Жума куну жава окуйм");
            default -> System.out.println("Дем алуу куну");
        }
    }
}
