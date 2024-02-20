package ru.diana.shipandfish.entity;

public class Fish implements Floating {
    @Override
    public void swim() {
        eat();
        System.out.println("Я - рыба, и я - плыву");
    }
    private void eat() {
        System.out.println("Я - рыба, чтобы поплыть, мне нужна еда");
    }
}
