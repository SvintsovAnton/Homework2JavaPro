package app.stuff.driver;

import app.stuff.onBoardComputer.BoardComputer;
import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    @Autowired
    private BoardComputer boardComputer;

    public BoardComputer getBoardComputer() {
        return boardComputer;
    }

    public void setBoardComputer(BoardComputer boardComputer) {
        this.boardComputer = boardComputer;
    }

    public void modeLetsGo() {
        boardComputer.firstStart();
    }
}
