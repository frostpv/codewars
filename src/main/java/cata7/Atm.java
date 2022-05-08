package cata7;

public class Atm {

    public int solve(int number) {
        int[] cash = {0, number};
        takeBanknote(cash, 500);
        takeBanknote(cash, 200);
        takeBanknote(cash, 100);
        takeBanknote(cash, 50);
        takeBanknote(cash, 20);
        takeBanknote(cash, 10);

        return (cash[1] > 0) ? -1 : cash[0];
    }

    private void takeBanknote(int[] cash, int typeNote) {
        int notes = cash[0];
        int change = cash[1];

        while (change >= typeNote) {
            change = change - typeNote;
            notes += 1;
        }

        cash[0] = notes;
        cash[1] = change;
    }
}
