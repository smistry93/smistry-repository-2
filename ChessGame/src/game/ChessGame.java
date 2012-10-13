package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ChessGame extends JFrame implements MouseListener,
		MouseMotionListener {
	private JFrame _window;
	private ChessGame _cg;
	private static int _row;
	private static int _col;
	private JPanel _main;


	public ChessGame(int row, int col){

		Dimension boardSize = new Dimension(600, 600);
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane);
		layeredPane.setPreferredSize(boardSize);
		layeredPane.addMouseListener(this);
		layeredPane.addMouseMotionListener(this);
		
		JPanel chessBoardPanel = new JPanel();
		chessBoardPanel.setLayout(new GridLayout(8,8));
		chessBoardPanel.setPreferredSize(boardSize);
		chessBoardPanel.setBounds(0, 0, boardSize.width, boardSize.height);
		layeredPane.add(chessBoardPanel);
		//ArrayList<JPanel> al = new ArrayList<JPanel>();
		for(int _row = 0; _row < 8; _row++){
			for(int _col=0;_col<8;_col++){
				_row = row;
				_col=col;
				JPanel sq = new JPanel();
				chessBoardPanel.add(sq);
				sq.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JLabel lbl = new JLabel("("+row+","+col+")");
				sq.add(lbl);
			}
			
	
		}
			
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new ChessGame(_row,_col);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
	}

}
