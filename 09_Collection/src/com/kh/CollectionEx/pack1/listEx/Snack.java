package com.kh.CollectionEx.pack1.listEx;

public class Snack {

    private String snackName;    //과자이름
    private int snackPrice;     //과자가격
    private int snackQuantity; //과자수량

    public Snack() {
    }

    public Snack(String snackName, int snackPrice, int snackQuantity) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackQuantity = snackQuantity;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    @Override
    public String toString() {
        return "snackName='" + snackName + '\'' +
                ", snackPrice=" + snackPrice +
                ", snackQuantity=" + snackQuantity ;
    }
}
