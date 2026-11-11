package variante;

public class Client {
    public static void main(String[] args) {
        AppLogger logger1 = AppLogger.getInstance();
        logger1.logInfo("Démarrage du module de sécurité.");

        AppLogger logger2 = AppLogger.getInstance();
        logger2.logInfo("Connexion au service de paiement établie.");

        System.out.println("\n--- Vérification de l'unicité ---");
        System.out.println("logger1 et logger2 pointent-ils vers la même instance ? " + (logger1 == logger2));
    }
}
