package ru.diana.shipandfish.entity;

public class Ship implements Floating {
    @Override
    public void swim() {
        fuel();
        System.out.println("Я - корабль, и я - плыву");
    }
    private void fuel() {
        System.out.println("Я - корабль, чтобы поплыть, мне нужно топливо");
    }
}
