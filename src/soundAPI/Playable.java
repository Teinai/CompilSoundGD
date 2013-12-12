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
public abstract class Playable {
    
    public abstract void play() throws LineUnavailableException;
    
}
