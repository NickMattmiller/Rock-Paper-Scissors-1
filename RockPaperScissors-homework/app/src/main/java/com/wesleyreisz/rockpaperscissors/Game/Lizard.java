package com.wesleyreisz.rockpaperscissors.Game;

/**
 * Created by Nick on 9/28/2015.
 */

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

public class Lizard implements GameType {

    public String eval(Integer opponentChoice)  {
        if (opponentChoice== R.id.btnSpock) {
            return GameUtils.BEATS;
        }else if (opponentChoice==R.id.btnPaper){
            return GameUtils.BEATS;
        }else if (opponentChoice==R.id.btnScissors){
            return GameUtils.LOSES_TO;
        }else if (opponentChoice==R.id.btnRock){
            return GameUtils.LOSES_TO;
        }
        else{
            return GameUtils.TIES;
        }
    }

}
