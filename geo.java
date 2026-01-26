
import java.util.Vector;
import java.util.function.LongUnaryOperator;
import org.w3c.dom.css.Rect;

 class Forme{
     private String nom;
     private int couleur;
    static int nbrobj = 0;
    
    public Forme(){
    nbrobj++;
}
    

public Forme (String nom, int couleur){
    this.nom= nom;
    this.couleur= couleur; 
    nbrobj++; 
}
 }
 class Cercle extends Forme{
    private float rayon;
    public Cercle(String nom , int couleur,float rayon){
        super (nom,couleur);
        this.rayon=rayon;

    }
    @Override
    public float surface() {
        return float (Math.PI*rayon*rayon);
    }
    @Override
    public String toString() {
        return super .toString()+",type:Cercle,rayon:"+rayon+",surface:"+surface();
 }
class Rect extends  Forme{
    private float LONGEUR,LARGEUR;
}
public Rect(string nom,int couleur,float longeur,float largeur){
    this.longeur=longeur;
    this.largeur=largeur;:
}
@Override
    public String toString() {
        return super.toString()+",type rectongle,L:"+LONGEUR+",I:"+LARGEUR+"surface:"+surface();
 }
    
 
class Triangle extends Forme{
    private  float base ,hauteur;
    
}
public Triangle (string nom,int couleur, float base, float hauteur){
    this.base=base;
    this.hauteur=hauteur;

}
 @Override
    public float surface() {
        return (base*hauteur)/2;
    }
    @Override
    public String toString() {
        return super .toString()+",type:triangle,base:"+base+",hauteur;"+hauteur+",surface:"surface()}
 }

public class geo{
    public static void main(String[] args){
        Vector<Forme> dessin =new Vector<Forme>();
        dessin.add(new Cercle ("C1",3,55));
        dessin.add(new Triangle ("T1",1,7,4));
        float tot=0;
        for(Forme f:dessin){
            tot+=f.surface();
            System.out.println("tottale des surface="+tot);
        }
        
    }
}
