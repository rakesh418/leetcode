package lld.logger;

import java.time.LocalDateTime;

class Logger{

    private static Logger logger = new Logger();

    private Logger() {

    }

    public static Logger getLogger(){
        return logger;
    }

    public void log(String msg){
        System.out.println(msg + " at " + LocalDateTime.now());
    }
}

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("first logger implementation" );
    }
}
