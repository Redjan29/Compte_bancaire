public class typedecompte {

    private String nom;

    public static void main(String[] args){
        try{
        typedecompte Typedecompte = new typedecompte("epargn");
        typedecompte Typecourant = new typedecompte("courant");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public typedecompte(String nom) throws Exception {
        this.nom=nom;
        if(nom=="epargne") {
            this.nom=nom;

        }else if (nom=="courant") {
            this.nom=nom;

        }else if(nom=="joint") {
            this.nom=nom;

        } else {
            throw new Exception("n'existe pas mecx ");
        }

    }

}
