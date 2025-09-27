public class Ruler {
    public static void main(String[] args) {
        String ruler1 = " 1 ";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        String ruler5 = ruler4 + "5" + ruler4;
        System.out.println(ruler1+'\n'+ruler2+'\n'+ruler3+'\n'+ruler4+'\n'+ruler5);
    }

}