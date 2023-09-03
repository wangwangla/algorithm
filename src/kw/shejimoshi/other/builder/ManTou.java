package kw.shejimoshi.other.builder;

public class ManTou {
    private final String water;
    private final String mianfei;
    private final String kaoxiang;
    private final String shouTao;

    class Builder{
        private String water = "cunjingshui";
        private String mainfei = "tedengmian";
        private String kaoxiang = "meidi";
        private String shouTao = "yicixing";

        public Builder setWater(String water){
            this.water = water;
            return this;
        }

        public Builder setMainfei(String mainfei){
            this.mainfei = mainfei;
            return this;
        }

        public Builder setKaoxiang(String kaoxiang){
            this.kaoxiang = kaoxiang;
            return this;
        }

        public Builder setShowTao(String shouTao){
            this.shouTao = shouTao;
            return this;
        }

        public ManTou build(){
            return new ManTou(water,mainfei,kaoxiang,shouTao);
        }
    }

    public ManTou(String water,String mianfei,String kaoxiang,String shouTao){
        this.water = water;
        this.mianfei = mianfei;
        this.kaoxiang = kaoxiang;
        this.shouTao = shouTao;
    }

}
