package algortest.wk.chapterOne;

public class ChapterOne {
    private int fa[];

    public ChapterOne(int n){
        fa = new int[n+1];
    }

    public void init(){
        for (int i = 1; i < fa.length; i++) {
            fa[i] = i;
        }
    }

    public int find(int x){
        if (x != fa[x]){
            fa[x] = find(fa[x]);
        }
        return fa[x];
    }

    public void xx(){
        for (int i = 1; i < fa.length; i++) {
            if (i == fa[i]) {
                System.out.println(fa[i]);
            }
        }
    }

    public void union(int x,int y){
        int a = find(x);
        int b = find(y);
        if (a<b){
            fa[b] = a;
        }
        if (a > b){
            fa[a] = b;
        }
    }

    public static void main(String[] args) {
        ChapterOne chapterOne = new ChapterOne(5);
        chapterOne.init();
        chapterOne.union(4,2);
        chapterOne.union(1,3);
        chapterOne.union(4,3);
        chapterOne.union(3,3);
        chapterOne.union(1,2);
        chapterOne.union(1,3);
        chapterOne.union(2,3);
        chapterOne.union(5,2);
        chapterOne.union(1,2);
        chapterOne.union(3,5);
        chapterOne.xx();


    }
}
