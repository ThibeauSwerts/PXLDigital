namespace Prey_predator.Contracts
{
    public class Position
    {
        public int X { get { return _x; } set { _x = CheckCoordinate(value); } }
        public int Y { get { return _y; } set { _y = CheckCoordinate(value); } }
        private int _x;
        private int _y;

        public Position(int X, int Y)
        {
            this.X = X;
            this.Y = Y;
        }

        public void MoveUp() => Y--;
        public void MoveDown() => Y++;
        public void MoveLeft() => X--;
        public void MoveRight() => X++;

        private int CheckCoordinate(int pos)
        {
            if(pos > 15)
            {
                return 15;
            }else if(pos < 0)
            {
                return 0;
            }
            else
            {
                return pos;
            }
        }
    }
}