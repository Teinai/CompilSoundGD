/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soundAPI;

import java.util.ArrayList;
import java.util.Iterator;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Lucas
 */
public class Sequence extends Playable implements Iterable<Playable>{
    
    private ArrayList<Playable> playables;
    private int bpm = 60;
    
    public Sequence() {
        playables = new ArrayList();
        //SoundFactory.setBPM(bpm);
    }
    
    public Sequence(int bpm) {
        playables = new ArrayList();
        this.bpm = bpm;
    }
    
    public void add(Playable playable) {
        SoundFactory.setBPM(this.bpm);
        playables.add(playable);
    }

    @Override
    public Iterator<Playable> iterator() {
        return playables.iterator();
    }
        
    @Override
    public void play() throws LineUnavailableException {
        SoundFactory.setBPM(bpm);
        for(Playable playable : playables) playable.play();
    }
    
}
