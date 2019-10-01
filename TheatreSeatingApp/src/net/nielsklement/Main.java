package net.nielsklement;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        printList(theatre.seats);


    }

    public static void printList(List<Seat> list){
        for (Seat seat : list) {
                System.out.println(seat.getSeatNumber());



        }
    }
}
