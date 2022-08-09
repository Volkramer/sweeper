package com.volk;

import com.badlogic.gdx.Game;
import com.volk.views.EndScreen;
import com.volk.views.LoadingScreen;
import com.volk.views.MainScreen;
import com.volk.views.MenuScreen;
import com.volk.views.PreferencesScreen;

public class Sweeper extends Game {

    private LoadingScreen loadingScreen;
    private PreferencesScreen preferencesScreen;
    private MenuScreen menuScreen;
    private MainScreen mainScreen;
    private EndScreen endScreen;

    public final static int MENU = 0;
    public final static int PREFERENCES = 1;
    public final static int APPLICATION = 3;
    public final static int ENDGAME = 4;

    @Override
    public void create() {
        loadingScreen = new LoadingScreen(this);
        setScreen(loadingScreen);
    }

    public void changeScreen(int screen) {
        switch (screen) {
            case MENU:
                if (menuScreen == null)
                    menuScreen = new MenuScreen();
                this.setScreen(menuScreen);
                break;
            case PREFERENCES:
                if (preferencesScreen == null)
                    preferencesScreen = new PreferencesScreen();
                this.setScreen(preferencesScreen);
                break;
            case APPLICATION:
                if (mainScreen == null)
                    mainScreen = new MainScreen();
                this.setScreen(mainScreen);
                break;
            case ENDGAME:
                if (endScreen == null)
                    endScreen = new EndScreen();
                this.setScreen(endScreen);
                break;
        }
    }
}
