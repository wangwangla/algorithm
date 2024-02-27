package algortest.wk.book1.chapterOne;

/**
 * 1            5   6   7               11  12  13
 *  2   3   4               8   9   10
 */
public class ChapterOne {
    public void test(){
        int numPeople = 4;
        int numDeng = 14;
        boolean arr[] = new boolean[numDeng+1];
        /**
         * 开始灯都是灭的
         */
        for (int i = 0; i < numDeng; i++) {
            arr[i] = false;
        }
        /**
         * 每个人过来将灯取反
         */
        for (int i = 2; i <= numPeople; i++) {
            for (int i1 = 1; i1 <= numDeng; i1++) {
                if (i1 % i == 0){
                    arr[i1] = !arr[i1];
                }
            }
        }
        /**
         * 最后那个灯亮着
         */
        for (int i = 1; i <= numDeng; i++) {
            if (arr[i]) {
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        ChapterOne chapterOne = new ChapterOne();
        chapterOne.test();
    }

    /**
     * 灯的位置
     */
    public void test1(){
        int numPeople = 4;
        int numDeng = 14;
        boolean arr[] = new boolean[numDeng+1];
        for (int i = 1; i <= numDeng; i++) {
            for (int i1 = 1; i1 < numPeople; i1++) {
                int i2 = i % i1;
                if (i2 == 0){
                    //开始取反   最后的值

                    //人数的倍数
                }
            }
        }
    }
}
