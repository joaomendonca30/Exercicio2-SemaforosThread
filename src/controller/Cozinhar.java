package controller;

public class Cozinhar extends Thread{

    private final int id;
    private final String prato;
    private final double tempMinCozinha;
    private final double tempMaxCozinha;

    public Cozinhar(int id, String prato, double tempMinCozinha, double tempMaxCozinha) {
        this.id = id;
        this.prato = prato;
        this.tempMinCozinha = tempMinCozinha;
        this.tempMaxCozinha = tempMaxCozinha;
    }

    @Override
    public void run() {
        System.out.println("Iniciando cozimento do prato " + prato + " com ID " + id);
        double tempCozinha = (Math.random() * (tempMaxCozinha - tempMinCozinha)) + tempMinCozinha;

        double tempTotal = 0.0;
        while (tempTotal < tempCozinha) {
            try {
                Thread.sleep(100);
                tempTotal += 0.1;
                double percentual = (tempTotal / tempCozinha) * 100;
                System.out.printf("Prato %s com ID %d: %.2f%% cozido.\n", prato, id, percentual);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Prato " + prato + " com ID " + id + " pronto para entrega.");
        try {
            Thread.sleep(500);
            System.out.println("Prato " + prato + " com ID " + id + " entregue.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
