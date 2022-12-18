
/**
 * The class 'Matrix' represents a two-dimensional array of integers in the 255-0 range.
 *
 * @Rei Bashari , 315522623
 * @21-1-2021
 */
public class Matrix
 {//start of the class
    private final int MAXֹֹֹ_VALUE_COLOR = 255 ; //default final value , the max RGB .   
    private int[][] _matrix ; //private veriable 
    
    /**
    * Constructor 1 - copy constructor
    * @param array - to copy the array to the new matrix
    */
    public Matrix(int[][] array) {
        _matrix = new int [array.length][array[0].length] ; 
        for (int i = 0 ; i< array.length ; i++)
        {
            for (int j = 0 ; j< array[i].length ; j++) 
                _matrix[i][j] = array[i][j] ; 
        }
    }
    
    /**
     * Constructor 2 - build array by rows and columns and give them value 0 . 
     * @param size1 - rows of the array . 
     * @param size2 - columns of the array . 
     */
    public Matrix(int size1,int size2) {
        _matrix = new int[size1][size2] ; 
    }
    
    /**
     * Build a string of the matrix by rows and coulmns . 
     * @return Matrix String
     */
    public String toString() {
        String str = "" ; 
        int j ; 
        for (int i = 0 ; i < _matrix.length ; i++) 
        {
             for (j = 0 ; j < _matrix[0].length-1 ; j++) 
             {    
                str += _matrix[i][j] + "\t" ; 
             }
             str += _matrix[i][j] + "\n" ; 
        }
        return str ; 
    }
    
    /**
     * Flip the matrix horizonatally and return the new matrix  
     * @return the new matrix after it flipped horizonatally . 
     */
    public Matrix flipHorizontal() {
        int[][] arrHori = new int[_matrix.length][_matrix[0].length];
        for (int i = 0 ; i < _matrix.length/2; i++)
        {
              {
                  int swap_row =_matrix.length-1-i;
                  arrHori[i]= _matrix[i];
                  _matrix[i] = _matrix[_matrix.length-1-i];
                  _matrix[_matrix.length-1-i] = arrHori[i];
              }
        }
        return this ;
    }
    
    /**
     * Flip the matrix vertically and return the new matrix  
     * @return the new matrix after it flipped vertically . 
     */
    public Matrix flipVertical() {
        int[][] arrVerti = new int[_matrix.length][_matrix[0].length];
        for ( int a = 0 ;  a < _matrix.length ;a++)
        {
              for (int i= 0 , z = _matrix[0].length-1  ; z >= 0 && i < _matrix[0].length ;z--, i++)
              {
                  arrVerti[a][i] = _matrix[a][z];
              }

        }
        return new Matrix(arrVerti);
    }
    
    /**
     * Rotate the matrix clockwise ,   
     * @return the new matrix rotated clockwise .  
     */
    public Matrix rotateClockwise() {
        int[][] arrRotate = new int[_matrix[0].length][_matrix.length] ; 
        for (int i = 0  ; i < _matrix.length ; i++ ) 
        {
                for (int j = 0 ; j < _matrix[0].length ; j++ ) 
                {
                    arrRotate[_matrix[0].length-1-j][i]=_matrix[i][j];
                }
        }
        this._matrix = arrRotate ;
        return this;
    }
    
    /**
     * Rotates the matrix counterclockwise.    
     * @return the new matrix rotated counterclockwise .  
     */
    public Matrix rotateCounterClockwise() {
        int[][] arrCounter = new int[_matrix[0].length][_matrix.length] ; 
        for (int i=0; i<_matrix.length; i++)
        {
                for (int j = 0 ; j < _matrix[0].length ; j++ ) 
                {
                    arrCounter[_matrix[0].length-j-1][i]=_matrix[i][j];
                }
        }
        this._matrix = arrCounter ;
        return this;
    }
    
    /**
     * The method returns the negative image of the number. Each black number turns white.
     * For example , the number '2' will become '253' (255-2=253) .    
     * @return the new matrix after the conversion .  
     */
    public Matrix makeNegative() {
        int[][] arrNegative = new int[_matrix.length][_matrix[0].length] ; 
        for (int i = 0 ; i < _matrix.length ; i++)
        {
                for (int j = 0 ; j < _matrix[0].length ; j++)
                {
                    arrNegative[i][j] = MAXֹֹֹ_VALUE_COLOR - _matrix[i][j] ; 
                }
        }
        return new Matrix(arrNegative) ;
    }
    
    } //end of class 'matrix' 
