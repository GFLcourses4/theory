package theory.tarasov.service.dynamicproxy;

enum DynamicProxyLogMessage {
    EXECUTING_METHOD("Executing method {} in class {} with arguments {}"),
    METHOD_EXECUTION_COMPLETED("Method execution completed in class {}: Result - {}"),
    ILLEGAL_ACCESS_EXCEPTION("Method execution failed due to illegal access in class {}: {}"),
    INVOCATION_TARGET_EXCEPTION("Method execution failed in class {}: {}");

    private final String message;

    DynamicProxyLogMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}