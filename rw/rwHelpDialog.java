/*
 * To change this template, ch

            public int getLength() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void addDocumentListener(DocumentListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void removeDocumentListener(DocumentListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void addUndoableEditListener(UndoableEditListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void removeUndoableEditListener(UndoableEditListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Object getProperty(Object key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void putProperty(Object key, Object value) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void remove(int offs, int len) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public String getText(int offset, int length) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void getText(int offset, int length, Segment txt) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Position getStartPosition() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Position getEndPosition() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Position createPosition(int offs) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Element[] getRootElements() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public Element getDefaultRootElement() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void render(Runnable r) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }ose Tools | Templates
 * and open the template in the editor.
 */

/*
 * rwHelpDialog.java
 *
 * Created on Aug 26, 2014, 8:52:45 PM
 */
package rw;

/**
 *
 * @author tedr
 */
public class rwHelpDialog extends javax.swing.JDialog {

    /** Creates new form rwHelpDialog */
    public rwHelpDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        helpScrollPane = new javax.swing.JScrollPane();
        helpEditorPane = new javax.swing.JEditorPane();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setModal(true);
        setName("helpDialog\n"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        helpEditorPane.setBackground(new java.awt.Color(51, 51, 51));
        helpEditorPane.setContentType("text/html"); // NOI18N
        helpEditorPane.setEditable(false);
        helpEditorPane.setText("<html>\n  <head>\n  <style>\n    h1{Color: red;}\n    h2{color: blue;}\n    h3{color: purple;}\n    li{color: blue; font-size: 12}\n    body{ background: #DDFFEE; color: #110022;}\n    .sub{color: #000088; font-size: 10;}\n    .bland{color: black; font-size: 12;}\n  </style>\n  </head>\n  <body>\n     <h1> \nRandom Language Generator</h1>\n<h2>Table of Contents</h2>\n<ul>\n<li>What it is</li>\n<li>How to Generate Your First Language</li>\n<li>The Menus</li>\n<ul>\n<li class=sub>File</li>\n<li class=sub>Edit</li>\n<li class=sub>Project</li>\n<li class=sub>Help</li>\n</ul>\n<li>Dialogs</li>\n<ul>\n<li class=sub>Load</li>\n<li class=sub>Save As...</li>\n<li class=sub>Load Definitions</li>\n<li class=sub>Save Definitions As...</li>\n<li class=sub>Edit...</li>\n<li class=sub>Find</li>\n<li class=sub>Vowel and Consonant</li>\n<li class=sub>Set POS Rules</li>\n<li class=sub>Set Maximum Syllables</li>\n<li class=sub>Syllable Patterns</li>\n<li class=sub>Writing System Chooser</li>\n<li class=sub>Translate Text</li>\n<li class=sub>Help</li>\n</ul>\n</ul>\n<h2>What It Is:</h2>\nRandom Language Generator is a program to generate artificial spoken languages.  This artificial language is generated based on the syllable\n structures, the consonants and vowels you choose and several part of speech rules.  The program was developed primarily for the fun of it, \nas in becuase I wanted to see if I could.  Random Language Generator also allows you to specify a writing system that your constructed \nlanguages will use.  As a labor of love this program took considerable development time and though it is free to use I will accept any monetary \nor coding donations you may choose to give.  For monetary donations send a PayPal donation to tednchar@comcast.net.  For coding donations\nthe code is on Git Hub, just email me at the above address and I'll send along the particulars and share the repository with you.\n<h2>How To Generate Your First Language:</h2>\nThe easiest method is to choose the \"New\" item in the \"File\" menu.  This will step you through the minimum requirements for a language. \n First you will choose a project name.  Then choose the sounds, vowels and consonants,  you would like your language to use.  The \nsymbols used for these sounds are allowed to have more than on letter to represent them.  First you will choose the vowels, and \nthen the consonants.  You can also just accept the defaults, if you desire.  The defaults are those used in the english language.  \nOnce you have chosen all of the sounds in your language, you will be prompted for a syllable pattern to use.  The syllable patterns \ncan be quite complex.  You will find more about how to set up this pattern later in this manual, but for now all you need to know is \nthat \"C\" represents a consonant and \"V\", of course, a vowel.   The default pattern is a consonant followed by a vowel.  You can change \nthis if you desire.  After choosing the syllable pattern you will be asked to load a dicionary or word list.  A dictionary was supplied with \nthis program, \"RwDictionary.csv,\" load it.  Words in your new language will be generated as the dictionary loads.  When it is done these \nwords will be displayed in the table.  The default writing system used is just all caps of the sounds you chose.  If you added any sounds \nto either list the words will not display completely, they will stop at the first word that contains any of your new sounds.  You can get \nthem all to display by seting up a writing system.  To do this choose \"Set Writing System\" from the \"Project\" menu.  This will bring up the\nWriting System specification dialog.  You will note that all of the sounds that you chose are in the list there.  You will need to choose how\nyou want each sound to be represented in print.  You can do this either by selecting the table cell to the right of the sound and typing \nthe letter on the keyboard or by using the arrow buttons to move up or down in the list and the using the buttons under the \"XXAXX\" \non the dialog, then selecting the \"Set\" button to place the chosen letter in the cell. \n<h1>The Menus:</h1>\n<h2>File</h2>\nThe item in this menu manage the files used by your contructed languages.\n<h3>New</h3>\nSteps the user though the basic steps needed for making a new language.\n<h3>Load ...</h3>\nLoads an already genrated language for use.\n<h3>Save</h3>\nSaves the current language with the current project name.  This same action is performed by the \"Save\" button on the main display. \n<h3>Save As ...</h3>\nSame as above, but allows the language to be renamed.\n<h3>Load Definitions ...</h3>\nLoads the dictionary.  The same is done by the \"Load Definitions\" button on the main window.\n<h3>Save Definitions</h3>\nSaves the dictionary with out the generated words. With this you can create your own versions of the dictionary.\n<h3>Save Definitions As ...</h3>\nSame as above but allows renaming of the file.\n<h3>Quit</h3>\nQuits the program.\n<h2>Edit</h2>\nThese items handle the editing tasks for the entries in the dictionary.\n<h3>Undo</h3>\nUndoes the last edit.  Will not undo loading of definitions or setting a writing system.  Only the inserting or deleting of entries.\n<h3>Redo</h3>\nOpposite of undo - undoes the last undo :)\n<h3>Cut</h3>\nRemoves the selected entry from the list and holds it in the buffer for possible pasting later. Be warned though changing the order of entries can break the find operation.\n<h3>Copy</h3>\nCopies the slected entry into the buffer for later pasting. see warning under cut menu item.\n<h3>Paste</h3>\nPastes the entry held in the buffer at the current selection, moving the current selection and all following entries down by one. see warning above. \n<h3>Find</h3>\nHunts down the word you enter and scrolls to it.\n<h2>Project</h2>\nRuns the various stuff you need to do to make the contructed language your own.\n<h3>Generate</h3>\nGenerates the words of your constructed language.  Using this menu item is tha same as selecting the \"Generate\" button on the bottom of the program window.  This will generate the words considering the root / lemma  of the words, if you have not set any POS rules the words generated will be the same as the root.\n<h3>Set Consonants</h3>\nThis lets you set up the consonant sounds used in your language. These sounds can be represented by more than one character if you desire.  Such as 'ch' or 'th'.\n<h3>Set POS Rules</h3>\nThis item brings up a dialog that allows you to set how the words will differ from the root word based on the part of speech.\n<h3>Set Maximum Syllables</h3>\nThis allows you tell the generator how many syllables you words will have at a maximum.  There is currently a bug that some of the words will be one more syllable than the maximum set here.\n<h3>Set Syllable Patterns</h3>\nAllows you to set the payttern of the syllables in your words. You can have up to 8 different patterns.  You may also choose whether a new pattern is chosen for each word or each new syllable. \n As mentioned earlier, there is a small language to steeing up these patterns.  That language is as follows:\n<ol><li class=bland> It is case sensitive</li>\n<li class=bland>C = consonant, chosen from your list of consonant sounds set up by the 'Set Consonants\" menu item.</li>\n<li class=bland>V = vowel, chosen from your list of vowel sounds set up by the 'Set Voewls\" menu item.</li>\n<li class=bland> [ = any one of the comma separated list that fallows until a ] is found can be chosen for the next sound in the syllable. \nThese sounds must be in lower case and must be comma separated, not comma + space separated. The list must also be terminated by a ]</li>\n<li class=bland>{ = if the previous sound in the syllable is the sound immediatley following the '{' and preceding the ':', the next sound will be chosen from the comma separated list that follows the ':' until the '}'.\nThe same rules on case apply as in the preceding item.</li>\n<li class=bland> (C/V.#) = the next sound will be chosen from your list of consonants or vowels depending on which C or V follows the '(' if the random number picked by the program is less than the number \nfollowing and including the '.'. Thus if '(C.5)' is entered in the pattern, the program will pull a random number between 0 and 1, if this number is less than .5 a consonant will be added to the word.</li> \n</ol>\n<h3>Set Vowels</h3>\nSame as the 'Set Consonants' menu item, other than with this you can set your vowel sounds.  As with consonants, these sounds can be multicharacter strings such as 'ou' or 'ea'.\n<h3>Set Writing System</h3>\nThis will open the Writing System Chooser with which you can coose how your new language will appear on the printed page.  You can chose from five different types of systems.  These types are Alphabets, Abjads, Abugidas, Syllabaries \nand Multigraphic systems.  Alphabets are those system where each sound is represented by one glyph.  Abjads are systems similar to Hebrew or Arabic where the vowels are optional, if they are written it is usually small dots or strokes near\n the consonants.  In Abugidas the vowels are merged with the consonants to form syllables in one glyph, they are sometimes called alphasyllabaries. In contrast to full syllabaries where each glyph represents a syllalbe, \nwhich could be more than two sounds, each glyph represents a vowel consononant pair.  In Multigraphic 2 - 4 sounds merge into one glyph, they can be any sounds, and can be syllables or just parts of syllables or even a syllable may be split\n between two glyphs.  The operation of the chooser will be explained in depth later.\n<h3>Translate Text</h3>\n<h2>Help</h2>\n<h3>Help Contents</h3>\nBrings up this dialog :)\n<h3>About</h3>\nTells you about this proggy.\n<h1>Dialogs</h1>\n<h3>Load</h3>\nThis is the standard file chooser.  Look for a file with an .xml extension.<br><center><img src=\"file:./src/rw/images/LoadDialog.png\" /></center>\n<h3>Save As...</h3>\nThis is the standard file chooser for saving a file.  You must add the .xml extension to the file name.  I have tried to put it there automatically if not there by default, but it isn't currently working.\n<br><center><img src=\"file:./src/rw/images/SaveAsDialog.png\" /></center>\n<h3>Load Definitions</h3>\nThis is the standard file chooser again. This time look for a file with a .rld or .csv extension.  \n<h3>Save Definitions As...</h3>\nYet another standard file chooser dialog.  You must add the extension as in the previous save dialog.\n<h3>Edit...</h3>\nThis dialog is for editing an entry in the dictionary, it is used for both modifying an entry or adding a new entry.<br>\n<center><img src=\"file:./src/rw/images/EditDialog.png\" /></center>\n<h3>Find</h3>\n<center><img src=\"file:./src/rw/images/FindDialog.png\" /></center>\n<h3>Vowel and Consonant</h3>\n<center><img src=\"file:./src/rw/images/ConsonantsDialog.png\" /></center><br>\n<center><img src=\"find:./src/rw/images/VowelsDialog.png\" /></center>\n<h3>Set POS Rules</h3>\n<center><img src=\"file:./src/rw/images/POSRulesDialog.png\" /></center>\n<h3>Set Maximum Syllables</h3>\n<center><img src=\"file:./src/rw/images/MaxSyllablesDialog.png\" /></center>\n<h3>Syllable Patterns</h3>\n<center><img src=\"file:./src/rw/images/SyllablePatternsDialog.png\" /></center>\n<h3>Writing System Chooser</h3>\n<center><img src=\"file:./src/rw/images/WSAlphabetDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSAbjadDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSAbugidaDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSSyllabaryDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSMultigraphicDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSPresetsDialog.png\" /></center><br>\n<center><img src=\"file:./src/rw/images/WSUserDefdDialog.png\" /></center><br>\n<h3>Translate Text</h3>\n<center><img src=\"file:./src/rw/images/TranslationDialog.png\" /></center>\n<h3>Help</h3>\nThis dialog, silly, not much to explain here.\n<h3>About</h3>\n<center><img src=\"file:./src/rw/images/AboutDialog.png\" /></center>\n    </p>\n  </body>\n</html>\n\n");
        helpEditorPane.setMaximumSize(new java.awt.Dimension(800, 600));
        helpEditorPane.setMinimumSize(new java.awt.Dimension(800, 600));
        helpEditorPane.setPreferredSize(new java.awt.Dimension(800, 600));
        helpScrollPane.setViewportView(helpEditorPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.95;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(helpScrollPane, gridBagConstraints);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(okButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rwHelpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rwHelpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rwHelpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rwHelpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                rwHelpDialog dialog = new rwHelpDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JEditorPane helpEditorPane;
    public javax.swing.JScrollPane helpScrollPane;
    public javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
