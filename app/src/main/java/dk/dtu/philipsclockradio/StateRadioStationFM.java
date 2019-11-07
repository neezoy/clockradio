package dk.dtu.philipsclockradio;

public class StateRadioStationFM extends StateRadioStation {


    @Override
    public void onEnterState(ContextClockradio context) {}



//change state

    @Override
    public void onClick_Power(ContextClockradio context) {
        context.currentRadioType = "AM ";
        super.onEnterState(context);

    }


}
