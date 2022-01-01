package kw.other.list.clone;

public class Type implements Cloneable{
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public Type clone() throws CloneNotSupportedException {
        return (Type) super.clone();
    }
}
