public class ResponseUtil {

    public static ResponseEntity<Object> createResponse(Object data, String message, HttpStatus status) {
        Map<String, Object> response = new HashMap<>();
        response.put("data", data);
        response.put("message", message);
        response.put("status", status.value());
        return new ResponseEntity<>(response, status);
    }

    public static ResponseEntity<Object> createSuccessResponse(Object data) {
        return createResponse(data, "Request was successful", HttpStatus.OK);
    }

    public static ResponseEntity<Object> createErrorResponse(String message, HttpStatus status) {
        return createResponse(null, message, status);
    }
}