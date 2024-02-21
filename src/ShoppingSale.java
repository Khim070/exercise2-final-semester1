public class ShoppingSale {
    ShoppingCustomer customer;
    String date;
    double serviceExpense;
    double productExpense;
    ShoppingSale(ShoppingCustomer customer, String date){
        this.customer = customer;
        this.date = date;
    }
    String getDate(){
        return date;
    }
    double getServiceExpense(){
        return serviceExpense;
    }
    void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    double getProductExpense(){
        return productExpense;
    }
    void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    double getTotalExpense(){
        double totalExpense = serviceExpense + productExpense;
        return totalExpense - serviceExpense * customer.getServiceMemberDiscount() - productExpense * customer.getProductMemberDiscount();
    }
    void displayinfo(){
        System.out.println("Customer's Name: "+customer.getCustomerName());
        System.out.println("Customer's Type: "+customer.getCustomerType());
        System.out.println("Order date: "+getDate());
        System.out.println("Service Expense: "+getServiceExpense()+"$");
        System.out.println("Discount on services is "+customer.getServiceMemberDiscount() * 100+"%"+" equals to: "+serviceExpense * customer.getServiceMemberDiscount()+"$");
        System.out.println("Product Expense: "+getProductExpense()+"$");
        System.out.println("Discount on product is: "+customer.getProductMemberDiscount() * 100+"%"+" equals to: "+productExpense * customer.getProductMemberDiscount()+"$");
        System.out.println("Total expense after discount: "+getTotalExpense()+"$");
    }
}
