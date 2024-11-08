package Solution;

/**
 * BUPENotes is a subclass of Notes with a fixed price of R19.99.
 */
public class BUPENotes extends Notes
{
    /**
     * Constructor initializes the BUPENotes with a name.
     * Calls setPrice() to set the fixed price.
     * @param summaryName - Name of the BUPENotes summary
     */
    public BUPENotes(String summaryName)
    {
        super(summaryName);
        setPrice();
    }

    /**
     * Sets the price of BUPENotes to R19.99.
     */
    @Override
    public void setPrice()
    {
        price = 19.99;
    }
}
