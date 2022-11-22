package fanur;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        PhoneBook pb = new PhoneBook();
        pb.addRow("Анастасия", "+79164274040");
        pb.addRow("Анастасия", "+79097869098");
        pb.addRow("Фанур", "+79265740808");
        pb.addRow("Фанур", "+74956785643");
        pb.addRow("Илья", "+79268907867");
        logger.info(pb.toString());

    }
}