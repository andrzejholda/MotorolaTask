package Model;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Cards {

    private SortedMap<String,Card> cards=new TreeMap<>();
    private ReadFile readFile= new ReadFile();
    Random random=new Random();

    public void doubleWords(int level) throws IOException {

            String[] localizations= new String[16];
            localizations=  this.adding();
                int count =0;
            for(int i=0;i<level;i++){
                int index=random.nextInt(0, readFile.howManyLines());
                for(int j=0;j<2;j++)
                {
                    String word= readFile.readFile(index);
                        this.cards.put(localizations[i+count+j],new Card(word));
                 }
                count ++;
            }
    }
    public String[] adding(){
        String[] indexes=new String[16];

        for(int i=0;i<16;i++){
            if(i<8){
                indexes[i]="A"+(i+1);
            }else{
                indexes[i]="B"+(i-7);
            }
        }
        List<String> intList = Arrays.asList(indexes);
        Collections.shuffle(intList);
        intList.toArray(indexes);
        indexes=intList.toArray(new String[intList.size()]);
        return indexes;
    }
    public String shufleLocalization(int level){

        int randomInt = random.nextInt(2);
        String word;
        if(randomInt==1){
            word= "A";
        }else{
             word ="B";
        }
        int int_random = random.nextInt(1,level);
        String result= String.valueOf(word+int_random);
        return result;
    }
    public SortedMap<String,Card> getCards()
    {
        return this.cards;
    }
    public void setCards(SortedMap<String,Card> card){
        this.cards=card;

    }
    public void randomizeCard(String localization,int level){
        int position= random.nextInt(0,level-1);
        this.cards.get(position).setLocalization(localization);
    }
}


