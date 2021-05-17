package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class DitchLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('[', "DitchLeft.jpg");
    private static String NAME = "DitchLeft";

    /**
     * Instantiates a new ditchLeft.
     */
    DitchLeft() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
