package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Macadam Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Macadam extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ', "Macadam.jpg");
    private static String NAME = "Macadam";

    /**
     * Instantiates a new macadam.
     */
    Macadam() {
        super(SPRITE, Permeability.PENETRABLE);
        this.name = NAME;
    }
}
