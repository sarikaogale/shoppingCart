public enum Item
{
    APPLE(35.0, 0,0.0),
    BANANA(20.0, 0, 0.0),
    MELON(50.0, 2, 50.0),
    LIME(15.0, 3, 30.0);

    private Double unitPrice;
    private Integer discountFactor;
    private Double discountedPrice;

    Item(Double unitPrice, Integer discountFactor, Double discountedPrice) {
        this.unitPrice = unitPrice;
        this.discountFactor = discountFactor;
        this.discountedPrice = discountedPrice;
    }

    private Double getUnitPrice() {
        return unitPrice;
    }

    private Integer getDiscountFactor() {
        return discountFactor;
    }

    private Double getDiscountedPrice() {
        return discountedPrice;
    }

    /**
     * this method will calculate total cost of an item applying any discount rules.
     * @param qty
     * @return
     */
    public Double calculateItemPrice(int qty)
    {
        Double itemTotal = 0.0;
        double discountPrice;
        double unitPricePerItem;
        int modVal;
        if(null != getDiscountFactor() && getDiscountFactor() != 0 && null != getDiscountedPrice())
        {
            itemTotal=  ((qty/getDiscountFactor() ) * getDiscountedPrice() ) + ((qty % getDiscountFactor() ) * getUnitPrice() );

        }
        else
        {
            itemTotal=  getUnitPrice() * qty;
        }
        System.out.println("ItemWise Total: "+itemTotal);
        return itemTotal;
    }


}
