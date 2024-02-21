public class ShoppingCustomer implements ShoppingDiscountRate{
    String customerName;
    String customerType;
    ShoppingCustomer(String customerName, String customerType){
        this.customerName = customerName;
        this.customerType = customerType;
    }
    String getCustomerName(){
        return customerName;
    }
    void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    String getCustomerType(){
        return customerType;
    }
    void setCustomerType(String customerType){
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        switch(customerType.toUpperCase()){
            case "PREMIUM":
                return 0.20;
            case "GOLD":
                return 0.15;
            case "SILVER":
                return 0.10;
            case "NORMAL":
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        switch(customerType.toUpperCase()){
            case "PREMIUM":
            case "GOLD":
            case "SILVER":
                return 0.10;
            case "NORMAL":
            default:
                return 0.0;
        }
    }
}
