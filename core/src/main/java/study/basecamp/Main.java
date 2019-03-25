package study.basecamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.basecamp.configs.ApplicationConfigs;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static Game game;

    public static void main(String[] args) {
        init();
        log.info("Guess Number");

        game.checkUserIn();

        log.info("Result = {}", game.isGameWon() ? "Win" : "Lose");
    }

    private static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigs.class); // от тобі config класс створи мені будь ласка по ньому контекст
        game = context.getBean(Game.class);

    }
}
