package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The DitchRight Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(']', "DitchRight.jpg");
    private static String NAME = "DitchRight";

    /**
     * Instantiates a new ditchRight.
     */
    DitchRight() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
