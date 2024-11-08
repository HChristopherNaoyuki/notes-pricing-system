package Solution;

/**
 * BUISNotes is a subclass of Notes with a fixed price of R24.99.
 */
public class BUISNotes extends Notes
{
    /**
     * Constructor initializes the BUISNotes with a name.
     * Calls setPrice() to set the fixed price.
     * @param summaryName - Name of the BUISNotes summary
     */
    public BUISNotes(String summaryName)
    {
        super(summaryName);
        setPrice();
    }

    /**
     * Sets the price of BUISNotes to R24.99.
     */
    @Override
    public void setPrice()
    {
        price = 24.99;
    }
}
