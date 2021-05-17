package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Class Ditch.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchRightTurnLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('}', "DitchRightTurnLeft.jpg");
    private static String NAME = "DitchRightTurnLeft";

    /**
     * Instantiates a new ditch.
     */
    DitchRightTurnLeft() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
