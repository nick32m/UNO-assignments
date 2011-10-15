
/**
 * Write a description of class SkipCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkipCard extends Card
{
    // instance variables - replace the example below with your own
    private int nSkip;

    /**
     * Constructor for objects of class SkipCard
     */
    public SkipCard(int colour, int nSkip)
    {
        super(colour, nSkip);
        this.nSkip = nSkip;
    }

    /**
     * Check whether this card can be played on the given card. 
     * @param The card to be played on
     * @returns true if either the colours or the symbols match
     */
    public boolean canPlayOn(Card card) { 
        // it should only check for colour as skip card does not have symbol nor number
        return (card.myColour == myColour);        
    }
    
    
     /**
     * Take any effect when the card is played.
     * 
     * SkipCard effect: it skips the nSkip player
     * also be skipped
     */
    public void play (UnoGame game) {
        //skip the nSkip player
        game.draw(game.getNextPlayer(nSkip),1);
     
    }
}
