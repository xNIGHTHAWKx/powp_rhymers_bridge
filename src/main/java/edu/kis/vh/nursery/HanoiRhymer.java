package edu.kis.vh.nursery;

/**
 * Simple Hanoi Rhyme.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int NUMBER_OF_REJECTED_RHYMES = 0;

    int totalRejected = NUMBER_OF_REJECTED_RHYMES;

    /**
     * Method returns number of rejected rhymes.
     * @return number of rejected rhymes.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * If number in param is less than current number, method add param into rhyme.
     * @param in number to place into rhyme.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
