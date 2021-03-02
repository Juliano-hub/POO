package trycatch;

    public class InsufficientFundsException extends RuntimeException {
        public InsufficientFundsException(){
        }
        public InsufficientFundsException(String reason){
        super(reason);
        }
}

