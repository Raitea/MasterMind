package mastermind;

public class MasterMind {
    static String[] ColorTable = {
        "Acajou",
        "Brique",
        "Cyan",
        "Denim",
        "Ecru",
        "Fuchsia",
        "Gris",
        "Havane",
        "Indigo",
        "Jaune",
        "Kola",
        "Lavande" 
    };
    
    static String[] CouleurHasard(){
        String[] TableCombinaison = new String[4];
        
        for (int i = 0; i < 4 ; i++){
            int index = 0;
            String randomColor = "";
            boolean alreadyIn = true;
            
            do{
                index = (int)(11 * Math.random());
                randomColor = ColorTable[index];
                if(!isIn(TableCombinaison))
            }
        }
        
        return TableCombinaison;
    }
    
    public static void Jeu(){
        System.out.println(ColorTable);
    }
    
    

    public static void main(String[] args) {
        
    }
    
}