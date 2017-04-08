//Team BreadAndButter - Grace Cuenca, Despoina Sparakis, Yuyang Zhang

public class DequeTester2{
     public static void main (String[] args){

	DD mine = new DD();

	//since there are no elements in the DL, nothing can be removed; error exception will be thrown
	mine.removeLast();
	System.out.println(mine);

	//since there are no elements in the DL, nothing can be removed; error exception will be thrown
	mine.removeFirst();
	System.out.println(mine);

	//handles error silently (\n)
	//	mine.pollLast();
	System.out.println(mine);

	//at the end of these calls, 5 should be in the front
	mine.addLast(5);
	mine.addLast(6);
	System.out.println(mine);

	//at the end of these calls, 9 should be in the front
	mine.addFirst(9);
	System.out.println(mine);

	//at the end of these calls, it should look the same because there are no 1's in the AL
	mine.removeFirst();
	System.out.println(mine);

	//should print 9
	//	System.out.println(mine.peekFirst());

	//should print 6
	//	System.out.println(mine.peekLast());

	//at the end of these calls, the 9 should be gone
	mine.removeFirst();
	System.out.println(mine);

	mine.addLast(9);
	mine.addLast(9);
	mine.addLast(7);
	mine.addLast(9);
	mine.addLast(9);
	mine.addLast(9);
	System.out.println(mine);

	//at the end of these test calls, there should only be two 9s after the 7
	mine.removeLast();
	System.out.println(mine);

	//should return 7
	System.out.println(mine.size());

	//should print true
	//	System.out.println(mine.contains(9));

	//5 at front should be gone
	//mine.pollFirst();
	System.out.println(mine);

	//should print 1
	//	System.out.println(mine.atIndex(9));
	
    }
}
