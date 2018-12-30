package ch.hesge.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import ch.hesge.algo.model.*;

import static ch.hesge.algo.model.TransportMode.*;

/**
 * Attention, cet échantillon vous est fourni pour vous aider dans la résolution des questions.
 * Le fait que votre code fonctionne avec cet échantillon n'implique pas que votre réponse soit correcte.
 * A l'inverse, si votre code ne fonctionne pas avec cet échantillon, alors votre réponse est incorrecte.
 */
public class Sample {

    public static final Vehicle BATMOBILE;
    public static final Vehicle BATCOPTER;
    public static final Vehicle INVISIBLE_PLANE;

    public static final Hero SUPERMAN;
    public static final Hero WONDER_WOMAN;
    public static final Hero BATMAN;
    public static final Hero FLASH;
    public static final Hero AQUAMAN;
    public static final Hero CYBORG;
    public static final Hero ROBIN;
    public static final Hero KID_FLASH;

    public static final Villain CATMAN;
    public static final Villain DEADSHOT;
    public static final Villain SCANDAL;
    public static final Villain RAG_DOLL;

    public static final Group<Hero> JUSTICE_LEAGUE;
    public static final Group<Villain> SINISTER_SIX;
    public static final Collection<Super> WTF;

    static {

        BATMOBILE = new Vehicle("Batmobile", new Move("Go", LAND, 350));
        BATCOPTER = new Vehicle("Bat Copter", new Move("Fly", AIR, 450));
        INVISIBLE_PLANE = new Vehicle("Invisible Plane", new Move("Fly", AIR, 500));

        KID_FLASH = new Hero("Kid Flash",
                40,
                "Wally West",
                new Move("Run", LAND, 180));
        ROBIN = new Hero("Robin",
                20,
                "Dick Grayson",
                new Move("Run", LAND, 20));
        SUPERMAN = new Hero("Superman",
                100,
                "Clark Kent",
                Arrays.asList(new Move("Run", LAND, 200), new Move("Fly", LAND, 200)));
        WONDER_WOMAN = new Hero("Wonder Woman",
                95,
                "Diana Prince",
                new Move("Run", LAND, 50));
        BATMAN = new Hero("Batman",
                50,
                "Bruce Wayne",
                ROBIN,
                new Move("Run", LAND, 20),
                BATMOBILE, BATCOPTER);
        FLASH = new Hero("Flash",
                80,
                "Barry Allen",
                KID_FLASH,
                new Move("Run", LAND, 200));
        AQUAMAN = new Hero("Aquaman",
                40,
                "Arthur Curry",
                Arrays.asList(new Move("Run", LAND, 20), new Move("Swim", UNDERWATER, 80)));
        CYBORG = new Hero("Cyborg",
                60,
                "Victor Sone",
                new Move("Run", LAND, 50));

        JUSTICE_LEAGUE = new Group<>("Justice League", SUPERMAN, WONDER_WOMAN, BATMAN, FLASH, AQUAMAN, CYBORG);

        CATMAN = new Villain("Catman",
                60,
                "Thomas Blake",
                new Move("Run", LAND, 50));
        DEADSHOT = new Villain("Catman",
                40,
                "Floyd Lawton",
                new Move("Run", LAND, 20));
        SCANDAL = new Villain("Scandal",
                50,
                "Scandal Savage",
                new Move("Run", LAND, 20));
        RAG_DOLL = new Villain("Rag Doll",
                60,
                new Move("Run", LAND, 20));

        SINISTER_SIX = new Group<>("Sinister Six", CATMAN, DEADSHOT, SCANDAL, RAG_DOLL);

        WTF = Arrays.asList(BATMAN, SUPERMAN, DEADSHOT, CATMAN, AQUAMAN);
    }
}
