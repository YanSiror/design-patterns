package builderMode;

public class MilkTea {
    private final String type;    //奶茶类型
    private final String size;    //杯型
    private final boolean pearl;  //珍珠
    private final boolean ice;    //加冰

    private MilkTea(Builder builder){
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", pearl=" + pearl +
                ", ice=" + ice +
                '}';
    }

    public static class Builder {
        private final String type;
        private String size = "中杯";
        private boolean pearl = true;
        private boolean ice = false;

        public Builder(String type) {
            this.type = type;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean cold) {
            this.ice = cold;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }


}
