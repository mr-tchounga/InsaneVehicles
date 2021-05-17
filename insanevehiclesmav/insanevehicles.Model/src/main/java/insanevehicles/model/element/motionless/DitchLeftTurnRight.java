package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Class Ditch.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchLeftTurnRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('{', "DitchLeftTurnRight.jpg");
    private static String NAME = "DitchLeftTurnRight";

    /**
     * Instantiates a new ditch.
     */
    DitchLeftTurnRight() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
