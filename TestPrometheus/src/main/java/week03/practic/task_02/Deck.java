package week03.practic.task_02;

// ! Без использование коллекций
public class Deck {
    private final int RANK_SIZE = Rank.values.length;
    private final int SUIT_SIZE = Suit.values.length;
    private final int DECK_SIZE = SUIT_SIZE * RANK_SIZE;
    private final int MAX_SIZE = DECK_SIZE - 1;
    private final int MIN_SIZE = 0;

    private int[] set = new int[DECK_SIZE];
    private Card[] deck = new Card[DECK_SIZE];
    private Card[] deckToPlay = new Card[DECK_SIZE];
    private int size;

    public Deck() {

        for (int i = MIN_SIZE; i <= MAX_SIZE; i++) {
            Card cardToAdd = new Card(Rank.values[i % RANK_SIZE], Suit.values[i / RANK_SIZE]);
            System.out.println(cardToAdd);
            System.out.println(i);
            deck[i] = cardToAdd;
            //deckToPlay.add(cardToAdd);
        }
        ;
        deckToPlay = deck.clone();
        this.size = DECK_SIZE;
    }

    public void shuffle() {
        int i = 0;
        Integer number;

        do {
            number = (int) Math.round((MAX_SIZE - MIN_SIZE) * Math.random()) + MIN_SIZE;
            System.out.println("i = " + i + " ; number = " + number);
            boolean present = false;

            for (int j = 0; j < i; j++) {
                if (set[j] == number) present = true;
            }
            ;

            if (!present) {
                set[i] = number;
                deckToPlay[i] = deck[number];
                i++;
            }
        } while (i < DECK_SIZE);
        this.size = DECK_SIZE;
        for (i = MIN_SIZE; i <= MAX_SIZE; i++) {
            //System.out.println(deckToPlay[i]);
        }
        ;
    }

    public void order() {

        for (int outI = MIN_SIZE; outI < DECK_SIZE - 1; outI++)

            for (int i = MIN_SIZE; i < DECK_SIZE - 1; i++) {

                String suitCurrent = deckToPlay[i].getSuit().getName();
                String suitNext = deckToPlay[i + 1].getSuit().getName();

                String rankCurrent = deckToPlay[i].getRank().getName();
                String rankNext = deckToPlay[i + 1].getRank().getName();

                int weightCurrent = 0;
                int weightNext = 0;

                for (int j = 0; j < Suit.values.length; j++) {
                    if (suitCurrent.equals(Suit.values[j].getName())) {
                        weightCurrent += j * RANK_SIZE;
                    }
                    ;
                    if (suitNext.equals(Suit.values[j].getName())) {
                        weightNext += j * RANK_SIZE;
                    }
                    ;
                }
                ;

                for (int j = 0; j < Rank.values.length; j++) {
                    if (rankCurrent.equals(Rank.values[j].getName())) {
                        weightCurrent += j;
                    }
                    ;
                    if (rankNext.equals(Rank.values[j].getName())) {
                        weightNext += j;
                    }
                    ;
                }
                ;

                // need to swap
                if (weightCurrent > weightNext) {
                    Card tmpCard;
                    tmpCard = deckToPlay[i];
                    deckToPlay[i] = deckToPlay[i + 1];
                    deckToPlay[i + 1] = tmpCard;
                }
                ;
            }
        ;
    }

    public boolean hasNext() {
        Boolean result = false;
        if (this.size > 0) result = true;
        return result;
    }

    public Card drawOne() {
        Card result = null;
        if (this.hasNext()) {
            result = deckToPlay[this.size - 1];
            this.size--;
        }
        ;
        return result;
    }

    public void printDeckToPlay() {
        for (int i = MIN_SIZE; i < this.size; i++) {
            System.out.println("Card[ " + i + " ] = " + deckToPlay[i]);
        }
        ;
    }

    public void printDrawOne() {
        for (int i = MIN_SIZE; i < deckToPlay.length + 2; i++) {
            System.out.println("Card[ " + i + " ] = " + this.drawOne());
        }
        ;
    }


    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printDeckToPlay();

        System.out.println("shuffle");
        deck.shuffle();
        deck.printDeckToPlay();

        System.out.println("order");
        deck.order();
        deck.printDeckToPlay();

        System.out.println("draw");
        deck.printDrawOne();
        System.out.println("after draw");
        deck.printDeckToPlay();
    }


}