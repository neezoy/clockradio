package dk.dtu.philipsclockradio;

public class StateNumberChoosingState extends StateAdapter {





    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.turnOnTextBlink();

    }

    @Override
    public void onExitState(ContextClockradio context) {
        context.ui.turnOffTextBlink();

    }

    @Override
    public void onClick_Preset(ContextClockradio context) {
        context.setState(new StateRadioStation());

    }

    @Override
    public void onLongClick_Preset(ContextClockradio context) {

        context.currentStation = context.currentStation + 1;
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);


    }



}
