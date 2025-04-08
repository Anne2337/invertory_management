public class InvalidStockException extends Throwable {


    public  class InvalidStockException extends Exception {
        public InvalidStockException(String message) {
            super(message);  // Passing the message to the parent Exception class
        }
    }

}
