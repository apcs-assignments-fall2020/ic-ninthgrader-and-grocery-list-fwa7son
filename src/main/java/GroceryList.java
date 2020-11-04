public class GroceryList {
    private String[] liste;

    public GroceryList(){
        this.liste = new String[10];
    }
    public void add(String item){
        for (int i=0; i<liste.length;i++){
            if (liste[i]==null){
                liste[i] = item;
                break;
            }
        }
    }
    public void remove(String item){
        for (int i = 0; i < liste.length; i++){
            if (liste[i]==item){
                liste[i] = " ";
                break;
            }
        }
    }
    public String toString(){
        String newstr = this.liste[0] + " " + this.liste[1] + " " + this.liste[2] + " " + this.liste[3] + " " + this.liste[4] + " " + this.liste[5] + " " + this.liste[6] + " " + this.liste[7] + " " + this.liste[8] + " " + this.liste[9];
        return newstr;
    }
}