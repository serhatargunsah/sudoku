package argunsah.ai.sudoku;

import sac.State;
import sac.StateFunction;

public class EmptyPlacesHeuristics extends StateFunction {
	@Override
	public double calculate(State state) {
		// TODO Auto-generated method stub
		Sudoku s=(Sudoku) state;
		//return super.calculate(state);
		return s.getZerosCounter();
	}

}
