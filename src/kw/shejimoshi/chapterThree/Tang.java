package kw.shejimoshi.chapterThree;

public class Tang extends BaseWater{
    private BaseWater baseWater;
    public void setWater(Water water){
        this.baseWater = water;
    }

    @Override
    public void msg() {
        baseWater.msg();
        System.out.println("糖水！！");
    }
}
