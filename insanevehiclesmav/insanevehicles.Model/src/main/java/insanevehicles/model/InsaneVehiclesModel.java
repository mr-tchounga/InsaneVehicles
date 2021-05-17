package insanevehicles.model;

import java.io.IOException;

import insanevehicles.contract.IInsaneVehiclesModel;
import insanevehicles.contract.IMobile;
import insanevehicles.contract.IRoad;
import insanevehicles.model.element.mobile.MyVehicle;


/**
 * <h1>The Class InsaneVehiclesModel.</h1>
 */
public class InsaneVehiclesModel implements IInsaneVehiclesModel {

    /** The road. */
    private IRoad   road;

    /** The my vehicle. */
    private IMobile myVehicle;

    /**
     * Instantiates a new insane vehicles model.
     *
     * @param fileName
     *            the file name
     * @param myVehicleStartX
     *            the my vehicle start X
     * @param myVehicleStartY
     *            the my vehicle start Y
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public InsaneVehiclesModel(final String fileName, final int myVehicleStartX, final int myVehicleStartY)
            throws IOException {
        this.setRoad(new Road(fileName));
        this.setMyVehicle(new MyVehicle(myVehicleStartX, myVehicleStartY, this.getRoad()));
    }

    /* (non-Javadoc)
     * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getRoad()
     */
    @Override
    public final IRoad getRoad() {
        return this.road;
    }

    /**
     * Sets the road.
     *
     * @param road
     *            the road to set
     */
    private void setRoad(final IRoad road) {
        this.road = road;
    }

    /* (non-Javadoc)
     * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getMyVehicle()
     */
    @Override
    public final IMobile getMyVehicle() {
        return this.myVehicle;
    }

    /**
     * Sets the my vehicle.
     *
     * @param myVehicle
     *            the myVehicle to set
     */
    private void setMyVehicle(final IMobile myVehicle) {
        this.myVehicle = myVehicle;
    }

}
