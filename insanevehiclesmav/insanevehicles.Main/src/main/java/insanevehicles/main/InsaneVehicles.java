package insanevehicles.main;

import java.io.IOException;

import insanevehicles.contract.IIinsaneVehiclesController;
import insanevehicles.contract.IInsaneVehiclesModel;
import insanevehicles.controller.InsaneVehiclesController;
import insanevehicles.model.InsaneVehiclesModel;
import insanevehicles.view.InsaneVehiclesView;


/**
 * <h1>The InsaneVehicles Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public abstract class InsaneVehicles {

    /** The Constant startX. */
    private static final int startX = 5;

    /** The Constant startY. */
    private static final int startY = 0;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws InterruptedException
     *             the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final IInsaneVehiclesModel model = new InsaneVehiclesModel("road.txt", startX, startY);
        final InsaneVehiclesView view = new InsaneVehiclesView(model.getRoad(), model.getMyVehicle());
        final IIinsaneVehiclesController controller = new InsaneVehiclesController(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());

        //controller.play();
        controller.saveCircuit(model.getRoad());
    }
}
