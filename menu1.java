import java.awt.event.*;
import javax.swing.* ;

class menu extends JFrame implements ActionListener
{
	public menu ()
  { setTitle ("menus_rectangle") ;
    setSize (300, 150) ;
     /* creation barre des menus */
    //barreMenus = new JMenuBar() ;
    setJMenuBar(barreMenus) ;
     /* creation menu Fichier et ses options */
    Dimensions = new JMenu ("Dimensions") ;
    barreMenus.add(Dimensions) ;
    
    nouvellelongueur = new JMenuItem ("nouvelle longueur") ;
    Dimensions.add (nouvellelongueur) ;
    nouvellelongueur.addActionListener(this);
    
    nouvellelargeur = new JMenuItem ("nouvelle largeur") ;
    Dimensions.add (nouvellelargeur) ;
    nouvellelargeur.addActionListener(this);
    
    dimensionactuelle = new JMenuItem ("dimension actuelle") ;
    Dimensions.add (dimensionactuelle) ;
    dimensionactuelle.addActionListener(this);
    
    Calcul = new JMenu ("Calcul") ;
    barreMenus.add (Calcul) ;
    
    perimetre = new JMenuItem ("perimetre") ;
    Calcul.add (perimetre) ;
    perimetre.addActionListener(this);
    
    aire = new JMenuItem ("aire") ;
    Calcul.add (aire) ;
    aire.addActionListener(this);
  }
    	public void actionPerformed(ActionEvent e) 
    	{   
  	        if (e.getSource()==nouvellelongueur)
  	        {
  	        	 longueur = Double.parseDouble(JOptionPane.showInputDialog(null, "Saisir la nouvelle longueur: "));
  	        }
  	        
  	        if(e.getSource()==perimetre)
  	        {
  	        	JOptionPane.showMessageDialog(null, "perimetre  :" + (largeur+longueur)*2);
  	        }
  	        
  	        if (e.getSource()==nouvellelargeur)
	        {
	        	 largeur = Double.parseDouble(JOptionPane.showInputDialog(null, "Saisir la nouvelle largueur: "));
	        }
  	        
  	        if (e.getSource()==dimensionactuelle)
	        {
	        	 
                    JOptionPane.showMessageDialog( null, " largeur actuelle : "+largeur+"\nlongueur actuelle: "+longueur);
	        }
  	        
	        if(e.getSource()==aire)
	        {
	        	JOptionPane.showMessageDialog(null, " aire : " + (largeur*longueur));
	        }
    	}
  
  private JMenuBar barreMenus ;
  private JMenu Dimensions, Calcul ;
  private JMenuItem nouvellelongueur, nouvellelargeur, dimensionactuelle, perimetre, aire;
  double longueur;
  double largeur;
}

public class menu1
{ public static void main (String args[])
  { menu fen = new menu() ;
    fen.setVisible(true) ;
  }
}