
/**
 * Write a description of class DrawCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawCard extends Card
{
    // instance variables - replace the example below with your own
    private int nDraw;

    /**
     * Constructor for objects of class DrawCard
     */
    public DrawCard(int colour, int nDraw)
    {
        super(colour, nDraw);
        this.nDraw=nDraw;
    }

    /**
     * Check whether this card can be played on the given card. 
     * @param The card to be played on
     * @returns true if either the colours or the symbols match
     */
    public boolean canPlayOn(Card card) {        
        return (card.myColour == myColour);        
    }
    
    
     /**
     * Take any effect when the card is played.
     * 
     * Drawcard effect: the next player draws nDraw cards and their turn will
     * also be skipped
     */
    public void play (UnoGame game) {
        game.draw(game.getNextPlayer(1),nDraw);
        // the current player's turn will also be skipped
        game.goToNextPlayer();
    }
}
