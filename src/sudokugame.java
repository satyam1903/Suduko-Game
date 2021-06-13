import java.io.Serializable;

public class sudokugame implements Serializable {


	private final GameState gamestate;
	private final int[][] gridState;
	public static final int GRID_BOUNDARY=9;
	public sudokugame(GameState gamestate, int[][] gridState) {
		super();
		this.gamestate = gamestate;
		this.gridState = gridState;
		
	}
	public GameState getGamestate() {
		return gamestate;
	}
	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNeyArray(gridState);
	}
	
	
	

}



