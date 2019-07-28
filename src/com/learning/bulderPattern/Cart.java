package com.learning.bulderPattern;

public class Cart {
    private final String val1;
    private final String val2;
    private final String val3;

    public Cart(Builder Builder){
        this.val1 = Builder.val1;
        this.val2 = Builder.val2;
        this.val3 = Builder.val3;
    }

    public static class Builder{
        String val1;
        String val2;
        String val3;

        private Builder(){

        }

        public static Builder newInstance(){
            return new Builder();
        }

        public Builder setVal1(String val1) {
            this.val1 = val1;
            return(this);
        }

        public Builder setVal2(String val2) {
            this.val2 = val2;
            return(this);
        }

        public Builder setVal3(String val3) {
            this.val3 = val3;
            return (this);
        }

        public Cart build(){
            return new Cart(this);
        }
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    public String getVal3() {
        return val3;
    }
}
