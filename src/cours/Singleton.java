package cours;

public final class Singleton implements Cloneable {
    private static Singleton instance = null;
    public int x;
    public int y;

    private Singleton() {
        super();
    }

    private Singleton(int x2, int y2) {
        super();
        this.x = x2;
        this.y = y2;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int somme(int x, int y) {
        return x + y;
    }

    public float moyenne(int x, int y) {
        return (float) somme(x, y) / 2;
    }

    public void affiche() {
        System.out.println("\nJe suis une instance et mes valeurs sont : x = " + this.x + " et y = " + this.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
