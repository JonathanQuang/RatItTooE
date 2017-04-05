//Kevin Bao
//APCS2 pd1
//HW29 -- Stress is the Best
//2017-04-04

public class DequeTester {
    
    public static void main(String[] args) {

	//Instantiating Main Deque and other Objects to add/offer
	DD<Object> deeznuts = new DD();
	DD<Object> mario = new DD();
	BankAccount toad = new BankAccount("TOAD","mushroom",1949,5,200.00);
	mario.addLast("9");

	//test add
	deeznuts.addFirst(null);//null
	deeznuts.addFirst("");//""<->null
	deeznuts.addFirst(1);//1<->""<->null
	deeznuts.addLast(mario);//1<->""<->null<->toad
	deeznuts.addLast("clang");//1<->""<->null<->toad<->"clang"

	//test contains
	//System.out.println(deeznuts.contains("TheSecretKrabbyPattyFormuler"));//false; Mr. Krabs has it!
	//System.out.println(deeznuts.contains("Beginner's Guide to Entering the Salty Spitoon"));//false
	//System.out.println(deeznuts.contains(""));//true bang!
			   
			   
	//test get
	System.out.println(deeznuts.getFirst());//1
	System.out.println(deeznuts.getLast());//"clang"

	//test remove
	System.out.println(deeznuts.removeFirst());//1
	System.out.println(deeznuts.removeFirst());//""
	System.out.println(deeznuts.removeFirst());//null
	System.out.println(deeznuts.removeLast());//"clang"
	System.out.println(deeznuts.removeLast());//BankAccount toad toString()
	//System.out.println(deeznuts.removeLast());//ERROR

	//test get after remove
	//System.out.println(deeznuts.getFirst());//ERROR
	//System.out.println(deeznuts.getLast());//ERROR
	
	/**============================================================
	   ^^^ Comment out above if add/remove/get aren't implemented  ^^^
	   ~ ~~ ~~~ ~~~~ ~~~~~ ~~~~~~ ~~~~~~~ ~~~~~~~~ ~~~~~~~~~ ~~~~~~~~~~
	   vvv Comment out below if offer/poll/peek aren't implemented vvv
	   ============================================================**/
	/*
	//test offer
	deeznuts.offerFirst(null);//null
	deeznuts.offerFirst("");//""<->null
	deeznuts.offerFirst(1);//1<->""<->null
	deeznuts.offerLast(mario);//1<->""<->null<->toad
	deeznuts.offerLast("clang");//1<->""<->null<->toad<->"clang"

	//test peek
	System.out.println(deeznuts.peekFirst());//1
	System.out.println(deeznuts.peekLast());//"clang"

	//test poll
	System.out.println(deeznuts.pollFirst());//1
	System.out.println(deeznuts.pollFirst());//""
	System.out.println(deeznuts.pollFirst());//null
	System.out.println(deeznuts.pollLast());//"clang"
	System.out.println(deeznuts.pollLast());//BankAccount toad toString()
	System.out.println(deeznuts.pollLast());//null

	//test peek after poll
	System.out.println(deeznuts.peekFirst());//null
	System.out.println(deeznuts.peekLast());//null
	*/    
    }
}

	
	
