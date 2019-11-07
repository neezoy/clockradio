package dk.dtu.philipsclockradio;



public class StateSleepTimer extends StateAdapter {

    String[] sleepTime = {"120", "90", "60", "30", "15", "OFF"};
    int counter;
    private ContextClockradio tcontext;




    //update display
    @Override
    public void onEnterState(ContextClockradio context) {
        counter = 0;
        context.ui.setDisplayText(sleepTime[counter]);
        context.ui.turnOnLED(3);
        tcontext = context;

    }

    //Idle detection
    private void resetIdle(){





    }



    //shuffle between sleep timers
    @Override
    public void onClick_Sleep(ContextClockradio context) {
        counter++;
        if (counter>5){
            counter = 0;
        }
        if (counter==5){
            context.ui.turnOffLED(3);
        }else{
            context.ui.turnOnLED(3);
        }
        context.ui.setDisplayText(sleepTime[counter]);

    }



}
