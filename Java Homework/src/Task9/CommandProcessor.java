package Task9;

public class CommandProcessor {
    static void processCommand(String cmd) {
        if ("ARG".equals(cmd)) {
            throw new IllegalArgumentException("bad arg");
        } else if ("STATE".equals(cmd)) {
            throw new IllegalStateException("bad state");
        } else {
            System.out.println("ok");
        }
    }

    static void demo() {
        try {
            processCommand("ARG");
            processCommand("STATE");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}