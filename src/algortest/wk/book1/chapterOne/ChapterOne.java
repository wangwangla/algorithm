package algortest.wk.book1.chapterOne;

/**
 * 1            5   6   7               11  12  13
 *  2   3   4               8   9   10
 */
public class ChapterOne {
    public void test(){
        int numPeople = 3;
        int numDeng = 14;
        boolean arr[] = new boolean[numDeng+1];
        for (int i = 0; i < numDeng; i++) {
            arr[i] = false;
        }
        for (int i = 1; i <= numPeople; i++) {
            for (int i1 = 1; i1 <= numDeng; i1++) {
                if (i1 % i == 0){
                    arr[i1] = !arr[i1];
                }
            }
        }

        for (int i = 0; i < numDeng; i++) {
            if (arr[i]) {
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        ChapterOne chapterOne = new ChapterOne();
        chapterOne.test();
    }
}
