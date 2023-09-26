public final class PR430Objecte {
    
    private static PR430Objecte instance;
    private String nom;
    private String cognom;
    private int edat;
    
    private PR430Objecte(String nom, String cognom, int edat) {
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

    public static PR430Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new PR430Objecte(nom,  cognom,  edat);
        }
        return instance;
    }

	@Override
	public String toString() {
		return "nom= " + nom + ", cognom= " + cognom + ", edat= " + edat + "";
	}
    
}