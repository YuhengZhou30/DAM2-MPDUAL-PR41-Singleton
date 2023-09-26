import java.lang.reflect.Constructor;

public final class PR431Objecte {
    
    private static PR431Objecte instance;
    private String nom;
    private String cognom;
    private int edat;
    
    private PR431Objecte(String nom, String cognom, int edat) {
        // Simulem una inicialització lenta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR431Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new PR431Objecte(nom,  cognom,  edat);
        }
        return instance;
    }
    

    public static PR431Objecte getNewDestroyedInstance (String nom, String cognom, int edat) {
        
    	PR431Objecte result = null;
        try {
            Constructor<?>[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                result = (PR431Objecte) constructor.newInstance(nom,cognom,edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
	@Override
	public String toString() {
		return "nom= " + nom + ", cognom= " + cognom + ", edat= " + edat + "";
	}
    
}