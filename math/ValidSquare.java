class Solution {
  public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

    int d1 = findDistance(p1, p2);
    int d2 = findDistance(p1, p3);
    int d3 = findDistance(p1, p4);

    if (d1 == 0 || d2 == 0 || d3 == 0) return false;

    if (d1 == d2 
    && d1 * 2 == d3 
    && findDistance(p2, p4) == findDistance(p3, p4) 
    && findDistance(p2, p3) == 2 * d1) 
        return true;

    if (d1 == d3 
    && d1 * 2 == d2 
    && findDistance(p2, p3) == findDistance(p3, p4) 
    && findDistance(p2, p4) == 2 * d1) 
        return true;

    if (d2 == d3 
    && d2 * 2 == d1 
    && findDistance(p2, p4) == findDistance(p2, p3) 
    && findDistance(p3, p4) == 2 * d2) 
        return true;

    return false;
  }

  int findDistance(int[] p1, int[] p2) {
    return (p1[0] - p2[0]) * (p1[0] - p2[0]) 
    + (p1[1] - p2[1]) * (p1[1] - p2[1]);

  }
}
