package Solution;

import static java.lang.System.out;

/**
 * UseNotes demonstrates creating and using instances of BUPENotes and BUISNotes.
 */
public class UseNotes 
{
    public static void main(String[] args) 
    {
        // Create a BUPENotes object with a summary name
        BUPENotes bupeNote = new BUPENotes("Entrepreneurship");

        // Print details of BUPENotes
        out.println(
                "BUPE Notes on " + bupeNote.getSummaryName() 
                + " costs R" + bupeNote.getPrice()
        );

        // Create a BUISNotes object with a summary name
        BUISNotes buisNote = new BUISNotes("Information Systems");

        // Print details of BUISNotes
        out.println(
                "BUIS Notes on " + buisNote.getSummaryName() 
                + " costs R" + buisNote.getPrice()
        );
    }
}
