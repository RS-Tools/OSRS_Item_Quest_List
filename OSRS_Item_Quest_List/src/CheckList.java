import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;

//Adapted from tutorial http://www.java2s.com/Tutorials/Java/Swing_How_to/JList/Create_JList_of_CheckBox.htm
public class CheckList {
	
	
	@SuppressWarnings("unchecked")
	public CheckList(Quest[] questlist, JFrame jf) {
	CheckListItem[] cli = new CheckListItem[questlist.length];
	for(int i = 0; i < questlist.length;i++) {
		cli[i] = new CheckListItem(questlist[i].Name);
	}
	JList list = new JList(cli);
	 list.setCellRenderer(new CheckListRenderer());
	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    list.addMouseListener(new MouseAdapter() {
	      @Override
	      public void mouseClicked(MouseEvent event) {
	        JList list = (JList) event.getSource();
	        int index = list.locationToIndex(event.getPoint());// Get index of item clicked
	        
	        CheckListItem item = (CheckListItem) list.getModel()
	            .getElementAt(index);
            
	       
	        item.setSelected(!item.isSelected()); //toggle

	        if(item.isSelected()) {
	        	Quests.checked.add(questlist[index]);
	        } else {
	        	Quests.checked.remove(questlist[index]);
	        }
	        
	        list.repaint(list.getCellBounds(index, index));
	      }
	    });
	    FlowLayout fl = new FlowLayout();
	    
	    jf.getContentPane().setLayout(fl);
	    
	    jf.getContentPane().add(new JScrollPane(list));
	    JButton getList = new JButton("Get List");
	    getList.addMouseListener(new MouseAdapter() {
	    	 public void mouseClicked(MouseEvent event) {
	    		 getList.setEnabled(false);
	    		 Quests.printTotal();
	    	 }
	    });
	    jf.getContentPane().add(getList);
	    jf.pack();
	    jf.setVisible(true);
}
}

class CheckListItem {

	  private String label;
	  private boolean isSelected = false;

	  public CheckListItem(String label) {
	    this.label = label;
	  }

	  public boolean isSelected() {
	    return isSelected;
	  }

	  public void setSelected(boolean isSelected) {
	    this.isSelected = isSelected;
	  }

	  @Override
	  public String toString() {
	    return label;
	  }
	}

	class CheckListRenderer extends JCheckBox implements ListCellRenderer {
	  public Component getListCellRendererComponent(JList list, Object value,
	      int index, boolean isSelected, boolean hasFocus) {
	    setEnabled(list.isEnabled());
	    setSelected(((CheckListItem) value).isSelected());
	    setFont(list.getFont());
	    setBackground(list.getBackground());
	    setForeground(list.getForeground());
	    setText(value.toString());
	    return this;
	  }
	}
