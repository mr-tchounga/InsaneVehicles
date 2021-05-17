package insanevehicles.model.element.motionless;

import insanevehicles.contract.Permeability;
import insanevehicles.contract.Sprite;

/**
 * <h1>The Tree Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Tree extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('^', "Tree.jpg");
    private static String NAME = "Tree";

    /**
     * Instantiates a new tree.
     */
    Tree() {
        super(SPRITE, Permeability.BLOCKING);
        this.name = NAME;
    }
}
