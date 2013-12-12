/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soundAPI;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Lucas
 */
public class Tone extends Note {

    private SoundFactory.Tones tone;
    
    public Tone(SoundFactory.Tones tone) {
        this(tone, 1);
    }
    
    public Tone(SoundFactory.Tones tone, double duration) {
        super(duration);
        this.tone = tone;
    }
    
    @Override
    public void play() throws LineUnavailableException {
        SoundFactory.sound(tone, duration);
    }
    
}
