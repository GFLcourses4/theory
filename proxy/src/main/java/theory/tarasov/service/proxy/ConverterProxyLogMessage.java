package theory.tarasov.service.proxy;

enum ConverterProxyLogMessage {
    CONVERSION_PERFORMED("Performing temperature conversion using {} converter: {}"),
    CONVERSION_RESULT("Conversion result: {}");

    private final String message;

    ConverterProxyLogMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
