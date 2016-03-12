/** COEN 275 OOAD (Winter 2016)
 *  Group Project
 *  Team 8
 */
package module.connections;

import java.util.Random;

import module.market.Market;

/**
 * @author nishant
 *
 */
public class AIRequests implements Runnable {
	
	//Automatic Random Requests
	
	private Thread t;
	private String threadName = "NewConnections Thread";
	private Market market;

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	public AIRequests (Market runningMarket) {
		
		this.market = runningMarket;
	}
	
	public void start ()
	{
		System.out.println("--Starting " +  threadName );
	    if (t == null)
	    {
	    	t = new Thread (this, threadName);
	        t.start ();
	     }
	}
	
	private void AICreatedRequests () {
		String SampleBuyRequest1 = "stockName:amazon,userId:123,userName:surag,unitPrice:101,quantity:100,buySell:true";
		String SampleBuyRequest2 = "stockName:google,userId:123,userName:surag,unitPrice:101,quantity:110,buySell:true";
		String SampleBuyRequest3 = "stockName:facebook,userId:123,userName:surag,unitPrice:101,quantity:80,buySell:true";
		String SampleBuyRequest4 = "stockName:google,userId:123,userName:surag,unitPrice:101,quantity:70,buySell:false";
		String SampleBuyRequest5 = "stockName:facebook,userId:123,userName:surag,unitPrice:101,quantity:80,buySell:false";
		String SampleBuyRequest6 = "stockName:amazon,userId:123,userName:surag,unitPrice:101,quantity:95,buySell:false";
		String SampleBuyRequest7 = "stockName:amazon,userId:123,userName:surag,unitPrice:101,quantity:120,buySell:false";
		String SampleBuyRequest8 = "stockName:google,userId:123,userName:surag,unitPrice:101,quantity:85,buySell:true";
		String SampleBuyRequest9 = "stockName:facebook,userId:123,userName:surag,unitPrice:101,quantity:90,buySell:true";
		String SampleBuyRequest10 = "stockName:amazon,userId:123,userName:surag,unitPrice:101,quantity:100,buySell:true";
		
		Random rn = new Random();
    	int answer = rn.nextInt(10);
    	
    	switch (answer) {
        case 1:  market.createBuySell(SampleBuyRequest1);
                 break;
        case 2:  market.createBuySell(SampleBuyRequest2);;
                 break;
        case 3:  market.createBuySell(SampleBuyRequest3);;
                 break;
        case 4:  market.createBuySell(SampleBuyRequest4);;
                 break;
        case 5:  market.createBuySell(SampleBuyRequest5);;
                 break;
        case 6:  market.createBuySell(SampleBuyRequest6);;
                 break;
        case 7:  market.createBuySell(SampleBuyRequest7);;
                 break;
        case 8:  market.createBuySell(SampleBuyRequest8);;
        	 break;
        case 9:  market.createBuySell(SampleBuyRequest9);;
        	 break;
        case 10: market.createBuySell(SampleBuyRequest10);;
        	 break;
        default: market.createBuySell(SampleBuyRequest4);;
        		
    	}
		
	}
		
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			AICreatedRequests ();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
