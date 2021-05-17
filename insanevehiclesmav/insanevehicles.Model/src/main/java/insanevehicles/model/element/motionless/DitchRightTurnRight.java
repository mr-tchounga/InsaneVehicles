package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Class Ditch.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchRightTurnRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(')', "DitchRightTurnRight.jpg");
    private static String NAME = "DitchRightTurnRight";

    /**
     * Instantiates a new ditch.
     */
    DitchRightTurnRight() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
