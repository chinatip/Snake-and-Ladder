Chinatip  Vichian 5710546551

Which knowledge from GRASP were applied ?
<< Creator >>
Board - created by BoardView
Piece - created by Player

<< Information Expert >>
Player knows Piece.
Board knows Square.
Game knows turn as it knows players.

<< Low Coupling >>
GameActivity only communicate with Game and BoardView.

<< Controller >>
Game - connect to GameActivity, GameActivity does not communicate to any model directly.
Board - connect to BoardView, BoardView does not communicate to Square directly.

<< High cohesion >>
Die - to roll
Piece - to get and set position
