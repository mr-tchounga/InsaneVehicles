package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Ditch Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchLeftTurnLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('(', "DitchLeftTurnLeft.jpg");
    private static String NAME = "DitchLeftTurnLeft";

    /**
     * Instantiates a new ditch.
     */
    DitchLeftTurnLeft() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
