package view;

import controller.Cozinhar;

public class Main {
    public static void main(String[] args) {
        Cozinhar[] cozinhar = new Cozinhar[5];
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                cozinhar[i - 1] = new Cozinhar(i, "Lasanha a Bolonhesa", 0.6, 1.2);
            } else {
                cozinhar[i - 1] = new Cozinhar(i, "Sopa de Cebola", 0.5, 0.8);
            }
        }

        for (Cozinhar cozinha : cozinhar) {
            cozinha.start();
        }
    }
}