package variante;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class AppLogger {
    private static AppLogger instance = null;
    private DateTimeFormatter dtf;

    private AppLogger() {
        super();
        this.dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("[SYSTEM INIT] Initialisation du journal d'application unique (AppLogger).");
    }

    public static synchronized AppLogger getInstance() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }

    public void logInfo(String message) {
        String timestamp = dtf.format(LocalDateTime.now());
        System.out.println("[INFO][" + timestamp + "] " + message);
    }

    public void logError(String message) {
        String timestamp = dtf.format(LocalDateTime.now());
        System.err.println("[ERROR][" + timestamp + "] " + message);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Le Singleton AppLogger ne peut pas être cloné !");
    }
}
