package dk.dtu.philipsclockradio;

public class StateRadioStation extends StateAdapter {

    //private ContextClockradio mContext;



    @Override
    public void onEnterState(ContextClockradio context) {
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);

        if (context.currentRadioType == "FM "){
            context.setState(new StateRadioStationFM());
        }else{
            context.setState(new StateRadioStationAM());
        }


        }



    // FREQ tuning -
    @Override
    public void onClick_Hour(ContextClockradio context) {
        context.currentStation = context.currentStation - 0.1;
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);

    }


    //FREQ tuning +
    @Override
    public void onClick_Min(ContextClockradio context) {
        context.currentStation = context.currentStation + 0.1;
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);

    }



    // st tuning -
    @Override
    public void onLongClick_Hour(ContextClockradio context) {
        context.currentStation = context.currentStation - 1;
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);


    }

    //st tuning +
    @Override
    public void onLongClick_Min(ContextClockradio context) {

        context.currentStation = context.currentStation + 1;
        context.ui.setDisplayText(context.currentRadioType + context.currentStation);


    }




    @Override
    public void onLongClick_Preset(ContextClockradio context) {
        context.savedStation = context.currentStation;
        context.savedRadioType = context.currentRadioType;
        context.setState(new StateNumberChoosingState());
    }


    }





