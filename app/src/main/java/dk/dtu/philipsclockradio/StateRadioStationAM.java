package dk.dtu.philipsclockradio;

public class StateRadioStationAM extends StateRadioStation {


    @Override
    public void onEnterState(ContextClockradio context) {}



//change state

    @Override
    public void onClick_Power(ContextClockradio context) {
        context.currentRadioType = "FM ";
        super.onEnterState(context);

    }


}



