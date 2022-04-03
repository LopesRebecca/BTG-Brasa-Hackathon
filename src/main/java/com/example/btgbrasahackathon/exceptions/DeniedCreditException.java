package com.example.btgbrasahackathon.exceptions;

public class DeniedCreditException extends Exception{
	private static final long serialVersionUID = 3713662943329797254L;
	
    public DeniedCreditException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DeniedCreditException(String message) {
        super(message);
    }
    
    public DeniedCreditException() {
        super();
    }
}
