import java.io.IOException;

public class InputUserException extends IOException {
    InputUserException(String description) {
        super(description);
    }
}
