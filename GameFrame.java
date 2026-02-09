import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameData data = new GameData();

    public GameFrame() {
        setSize(760, 570);
        setPreferredSize(new Dimension(760, 570));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        showMenu();
    }

    public void showMenu() {
        // setContentPane(new MenuPanel(this));
        refresh();
    }

    public void showStore() {
        // setContentPane(new StorePanel(this));
        refresh();
    }

    public void startGame() {
        // setContentPane(new BattlePanel(this));
        refresh();
    }

    private void refresh() {
        revalidate();
        repaint();
    }
}
