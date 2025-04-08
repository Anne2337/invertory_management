public class invertoty {


    public class Item {
        private  String name;
        private int quantity;
        private double price;
        //    private int newstock;
//    private int initialstock ;
        private int stock;

        public Item(){
            this.name = "";
            this.quantity = 0;
            this.price = 0;
//        this.newstock = 0;
//        this.initialstock = 0;
            this.stock = 0;
        }
        public Item(String name, int quantity, double price, int stock) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
//        this.newstock = newstock;
//        this.initialstock = initialstock;
            this.stock = stock;

        }

//    public void setInitialstock(int initialstock) {
//        this.initialstock = initialstock;
//    }
//    public int getNewstock(){
//        return newstock;
//    }


        public int getStock() {
            return stock;
        }

        public void addStock(int quantity) throws InvalidStockException {
            if (quantity < 0){
                throw new InvalidStockException("can not add negative stock");
            }
            stock += quantity;
            System.out.println( " added :" + quantity + " stock");

        }


        public void  RemoveStock(int quantity) throws InvalidStockException{

            if(quantity > stock) {
                throw new InvalidStockException("can not remove negative stock");

            }
            stock -= quantity;

            System.out.println( " removed :" + quantity + " stock");

        }
        public double getValue(){
            return price*quantity;


        }
        public void displayItem(){
            System.out.println("stock information :" +"Name: " + name + " Quantity: " + quantity + " price: " + this.getValue());

        }

    }


}
