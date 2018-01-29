package week03.practic.task_02;
// С использование коллекций
//
//

import java.util.*;

public class DeckCollections {
    private ArrayList<Card> deck, deckToPlay;
    private Iterator<Card> it;
    private int size;

    private final int RANK_SIZE = Rank.values.length;
    private final int SUIT_SIZE = Suit.values.length;
    private final int DECK_SIZE = SUIT_SIZE * RANK_SIZE;
    private final int MAX_SIZE =DECK_SIZE - 1;
    private final int MIN_SIZE = 0;

    private Set<Integer> set;
    private Random rnd;

    //private Rank rank;
    //private Suit suit;

    public DeckCollections(){
        this.deck = new ArrayList<Card>();


        for (int i=MIN_SIZE; i<=MAX_SIZE; i++ )
        {
            Card cardToAdd = new Card(Rank.values[i%RANK_SIZE], Suit.values[i/RANK_SIZE]);
            System.out.println(cardToAdd);
            deck.add(cardToAdd);
            //deckToPlay.add(cardToAdd);
        };
        this.deckToPlay = new ArrayList<Card>(deck);
        System.out.println("Количество карт в колоде = " + deck.size());
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        int i=0;
        set = new LinkedHashSet<Integer>();
        Integer number;
        deckToPlay.clear();
        rnd = new Random();

        do {
            number = rnd.nextInt(DECK_SIZE);
            System.out.println("i = " + i + " ; number = " + number + " ; set.contains(number) = " + set.contains(number));
            if (!set.contains(number)){
                set.add(number);
                deckToPlay.add(deck.get(number));
                i++;
            }
        } while (i < DECK_SIZE);

        System.out.println("i = " + i);
        for (i=MIN_SIZE; i<=MAX_SIZE; i++ ){
            System.out.println(deckToPlay.get(i));
        };

    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {

        Collections.sort(deckToPlay, new Comparator<Card>() {

            public int compare(Card card1, Card card2) {
                int result = 0;
                String suitCard1, suitCard2;
                String rankCard1, rankCard2;
                int card1Weight=0;
                int card2Weight=0;

                suitCard1 = card1.getSuit().getName();
                suitCard2 = card2.getSuit().getName();

                rankCard1 = card1.getRank().getName();
                rankCard2 = card2.getRank().getName();

                for (int i=0; i<Suit.values.length; i++){
                    if (suitCard1.equals(Suit.values[i].getName())) {card1Weight += i*RANK_SIZE;};
                    if (suitCard2.equals(Suit.values[i].getName())) {card2Weight += i*RANK_SIZE;};
                }

                for (int i=0; i<Rank.values.length; i++){
                    if (rankCard1.equals(Rank.values[i].getName())) {card1Weight += i;};
                    if (rankCard2.equals(Rank.values[i].getName())) {card2Weight += i;};
                };

                // result = -1 o1<o2
                // result = 0  o1.equals(o2)
                // result = 1 o1>o2

                System.out.println(card1 + " weigth = " + card1Weight);
                System.out.println(card2 + " weigth = " + card2Weight);

                result = card1Weight - card2Weight;

                return result;
            }
        });
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        Boolean result = false;
        if (deckToPlay.size()>0) result = true;
        return result;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        Card result = null;
        if (this.hasNext()) {
            result = this.deckToPlay.get(deckToPlay.size()-1);
            this.deckToPlay.remove(deckToPlay.size()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        DeckCollections deck = new DeckCollections();
        for (int i = 0; i<40; i++) {
            System.out.println((i+1) + " " +deck.drawOne());
        }

        deck.shuffle();
        for (int i = 0; i<40; i++) {
            System.out.println((i+1) + " " +deck.drawOne());
        }

        deck = new DeckCollections();
        deck.shuffle();
        deck.order();
        for (int i = 0; i<40; i++) {
            System.out.println((i+1) + " " +deck.drawOne());
        }

    }
}

