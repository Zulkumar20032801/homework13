public class Class {
    private int number;
    private String word;
    private int [] array;

    public Class() {
    }
    public  Class(int number,String word,int [] array){
        this.number=number;
        this.word=word;
        this.array=array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public int[] setArray(int[]array) {
        this.array = array;
        return array;
    }
}
