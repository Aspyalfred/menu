package com.mycompany.aspa_menu;

import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsGame1 extends JFrame {

    // ==========================
    // LIFE
    // ==========================
    private int player1Life = 5;
    private int player2Life = 5;

    // Mga choice ng players
    private String player1Choice = "";
    private String player2Choice = "";

    // ==========================
    // GUI
    // ==========================
    private JLabel titleLabel;
    private JLabel player1LifeLabel;
    private JLabel player2LifeLabel;
    private JLabel player1ChoiceLabel;
    private JLabel player2ChoiceLabel;
    private JLabel resultLabel;

    private JButton player1RockButton;
    private JButton player1PaperButton;
    private JButton player1ScissorsButton;

    private JButton player2RockButton;
    private JButton player2PaperButton;
    private JButton player2ScissorsButton;

    private JButton restartButton;

    // ==========================
    // CONSTRUCTOR
    // ==========================
    public RockPaperScissorsGame1() {

        setTitle("Rock Paper Scissors - 2 Players");
        setSize(700, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        createGUI();
    }

    // ==========================
    // CREATE GUI
    // ==========================
    private void createGUI() {

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(
                new BorderLayout(10, 10)
        );

        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        // ==========================
        // TITLE
        // ==========================

        titleLabel = new JLabel(
                "ROCK PAPER SCISSORS",
                SwingConstants.CENTER
        );

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        mainPanel.add(
                titleLabel,
                BorderLayout.NORTH
        );

        // ==========================
        // CENTER
        // ==========================

        JPanel centerPanel = new JPanel();

        centerPanel.setLayout(
                new BoxLayout(
                        centerPanel,
                        BoxLayout.Y_AXIS
                )
        );

        // PLAYER 1 LIFE

        player1LifeLabel = new JLabel(
                "PLAYER 1 LIFE: 5"
        );

        player1LifeLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        player1LifeLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // PLAYER 2 LIFE

        player2LifeLabel = new JLabel(
                "PLAYER 2 LIFE: 5"
        );

        player2LifeLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        player2LifeLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // PLAYER 1 CHOICE

        player1ChoiceLabel = new JLabel(
                "PLAYER 1: -"
        );

        player1ChoiceLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18
                )
        );

        player1ChoiceLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // PLAYER 2 CHOICE

        player2ChoiceLabel = new JLabel(
                "PLAYER 2: -"
        );

        player2ChoiceLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18
                )
        );

        player2ChoiceLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // RESULT

        resultLabel = new JLabel(
                "PLAYER 1: Choose your move!"
        );

        resultLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        resultLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ADD LABELS

        centerPanel.add(player1LifeLabel);

        centerPanel.add(
                Box.createVerticalStrut(10)
        );

        centerPanel.add(player2LifeLabel);

        centerPanel.add(
                Box.createVerticalStrut(25)
        );

        centerPanel.add(player1ChoiceLabel);

        centerPanel.add(
                Box.createVerticalStrut(10)
        );

        centerPanel.add(player2ChoiceLabel);

        centerPanel.add(
                Box.createVerticalStrut(25)
        );

        centerPanel.add(resultLabel);

        mainPanel.add(
                centerPanel,
                BorderLayout.CENTER
        );

        // ==========================
        // BUTTONS
        // ==========================

        JPanel allButtonsPanel = new JPanel();

        allButtonsPanel.setLayout(
                new GridLayout(
                        3,
                        1,
                        5,
                        5
                )
        );

        // PLAYER 1 PANEL

        JPanel player1Panel = new JPanel();

        player1Panel.add(
                new JLabel("PLAYER 1:")
        );

        player1RockButton =
                new JButton("ROCK");

        player1PaperButton =
                new JButton("PAPER");

        player1ScissorsButton =
                new JButton("SCISSORS");

        player1Panel.add(
                player1RockButton
        );

        player1Panel.add(
                player1PaperButton
        );

        player1Panel.add(
                player1ScissorsButton
        );

        // PLAYER 2 PANEL

        JPanel player2Panel = new JPanel();

        player2Panel.add(
                new JLabel("PLAYER 2:")
        );

        player2RockButton =
                new JButton("ROCK");

        player2PaperButton =
                new JButton("PAPER");

        player2ScissorsButton =
                new JButton("SCISSORS");

        player2Panel.add(
                player2RockButton
        );

        player2Panel.add(
                player2PaperButton
        );

        player2Panel.add(
                player2ScissorsButton
        );

        // RESTART

        JPanel restartPanel = new JPanel();

        restartButton =
                new JButton("RESTART GAME");

        restartPanel.add(
                restartButton
        );

        allButtonsPanel.add(
                player1Panel
        );

        allButtonsPanel.add(
                player2Panel
        );

        allButtonsPanel.add(
                restartPanel
        );

        mainPanel.add(
                allButtonsPanel,
                BorderLayout.SOUTH
        );

        // ==========================
        // PLAYER 1 BUTTONS
        // ==========================

        player1RockButton.addActionListener(e -> {

            choosePlayer1("Rock");

        });

        player1PaperButton.addActionListener(e -> {

            choosePlayer1("Paper");

        });

        player1ScissorsButton.addActionListener(e -> {

            choosePlayer1("Scissors");

        });

        // ==========================
        // PLAYER 2 BUTTONS
        // ==========================

        player2RockButton.addActionListener(e -> {

            choosePlayer2("Rock");

        });

        player2PaperButton.addActionListener(e -> {

            choosePlayer2("Paper");

        });

        player2ScissorsButton.addActionListener(e -> {

            choosePlayer2("Scissors");

        });

        // ==========================
        // RESTART
        // ==========================

        restartButton.addActionListener(e -> {

            restartGame();

        });

        add(mainPanel);
    }

    // ==========================
    // PLAYER 1 CHOICE
    // ==========================

    private void choosePlayer1(
            String choice
    ) {

        // Kapag may winner na
        if (player1Life <= 0 ||
                player2Life <= 0) {

            return;
        }

        player1Choice = choice;

        player1ChoiceLabel.setText(
                "PLAYER 1: " + choice
        );

        resultLabel.setText(
                "PLAYER 2: Choose your move!"
        );

        // Hindi pa magdedesisyon
        // hangga't wala pang Player 2
    }

    // ==========================
    // PLAYER 2 CHOICE
    // ==========================

    private void choosePlayer2(
            String choice
    ) {

        // Kailangan munang pumili
        // si Player 1

        if (player1Choice.equals("")) {

            resultLabel.setText(
                    "PLAYER 1: Choose your move first!"
            );

            return;
        }

        // Kapag game over

        if (player1Life <= 0 ||
                player2Life <= 0) {

            return;
        }

        player2Choice = choice;

        player2ChoiceLabel.setText(
                "PLAYER 2: " + choice
        );

        determineWinner();
    }

    // ==========================
    // DETERMINE WINNER
    // ==========================

    private void determineWinner() {

        // DRAW

        if (player1Choice.equals(
                player2Choice
        )) {

            resultLabel.setText(
                    "DRAW! Walang nabawas na life."
            );
        }

        // PLAYER 1 WINS

        else if (

                (player1Choice.equals("Rock")
                        && player2Choice.equals("Scissors"))

                || (player1Choice.equals("Paper")
                        && player2Choice.equals("Rock"))

                || (player1Choice.equals("Scissors")
                        && player2Choice.equals("Paper"))

        ) {

            player2Life--;

            resultLabel.setText(
                    "PLAYER 1 WINS! PLAYER 2 -1 LIFE"
            );
        }

        // PLAYER 2 WINS

        else {

            player1Life--;

            resultLabel.setText(
                    "PLAYER 2 WINS! PLAYER 1 -1 LIFE"
            );
        }

        updateLife();

        checkGameOver();

        // Reset choices para sa
        // susunod na round

        player1Choice = "";
        player2Choice = "";

        if (player1Life > 0 &&
                player2Life > 0) {

            // Magbibigay ng instruction
            // para sa next round

            // Choices ay mananatiling
            // nakikita sa screen
        }
    }

    // ==========================
    // UPDATE LIFE
    // ==========================

    private void updateLife() {

        player1LifeLabel.setText(
                "PLAYER 1 LIFE: " +
                player1Life
        );

        player2LifeLabel.setText(
                "PLAYER 2 LIFE: " +
                player2Life
        );
    }

    // ==========================
    // GAME OVER
    // ==========================

    private void checkGameOver() {

        if (player1Life <= 0) {

            player1Life = 0;

            player1LifeLabel.setText(
                    "PLAYER 1 LIFE: 0"
            );

            resultLabel.setText(
                    "GAME OVER! PLAYER 2 WINS!"
            );

        }

        else if (player2Life <= 0) {

            player2Life = 0;

            player2LifeLabel.setText(
                    "PLAYER 2 LIFE: 0"
            );

            resultLabel.setText(
                    "GAME OVER! PLAYER 1 WINS!"
            );
        }
    }

    // ==========================
    // RESTART
    // ==========================

    private void restartGame() {

        player1Life = 5;

        player2Life = 5;

        player1Choice = "";

        player2Choice = "";

        player1ChoiceLabel.setText(
                "PLAYER 1: -"
        );

        player2ChoiceLabel.setText(
                "PLAYER 2: -"
        );

        resultLabel.setText(
                "PLAYER 1: Choose your move!"
        );

        updateLife();
    }

    // ==========================
    // MAIN
    // ==========================

    public static void main(
            String[] args
    ) {

        SwingUtilities.invokeLater(() -> {

            RockPaperScissorsGame1 game =
                    new RockPaperScissorsGame1();

            game.setVisible(true);
        });
    }
}