
/*
  File: HideSelectedAction.java 
  
  Copyright (c) 2006, The Cytoscape Consortium (www.cytoscape.org)
  
  The Cytoscape Consortium is: 
  - Institute for Systems Biology
  - University of California San Diego
  - Memorial Sloan-Kettering Cancer Center
  - Institut Pasteur
  - Agilent Technologies
  
  This library is free software; you can redistribute it and/or modify it
  under the terms of the GNU Lesser General Public License as published
  by the Free Software Foundation; either version 2.1 of the License, or
  any later version.
  
  This library is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
  MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
  documentation provided hereunder is on an "as is" basis, and the
  Institute for Systems Biology and the Whitehead Institute 
  have no obligations to provide maintenance, support,
  updates, enhancements or modifications.  In no event shall the
  Institute for Systems Biology and the Whitehead Institute 
  be liable to any party for direct, indirect, special,
  incidental or consequential damages, including lost profits, arising
  out of the use of this software and its documentation, even if the
  Institute for Systems Biology and the Whitehead Institute 
  have been advised of the possibility of such damage.  See
  the GNU Lesser General Public License for more details.
  
  You should have received a copy of the GNU Lesser General Public License
  along with this library; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/

//-------------------------------------------------------------------------
// $Revision: 8514 $
// $Date: 2006-10-18 15:02:53 -0700 (Wed, 18 Oct 2006) $
// $Author: mes $
//-------------------------------------------------------------------------
package cytoscape.actions;
//-------------------------------------------------------------------------
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import giny.model.*;
import giny.view.*;
import java.util.*;

import cytoscape.Cytoscape;
import cytoscape.util.CytoscapeAction;
//-------------------------------------------------------------------------
public class HideSelectedAction extends CytoscapeAction  {

    public HideSelectedAction () {
        super( "Hide Selected" );
        setPreferredMenu( "Select.Edges" );
    }

   public HideSelectedAction ( boolean label) {
        super(  );
        
    }
    
    public void actionPerformed (ActionEvent e) {
        // Get the selected nodes:
    		Set selectedNodes = Cytoscape.getCurrentNetwork().getSelectedNodes();
    		Set selectedEdges = Cytoscape.getCurrentNetwork().getSelectedEdges();
    		GinyUtils.hideSelectedNodes( Cytoscape.getCurrentNetworkView() );
    		GinyUtils.hideSelectedEdges( Cytoscape.getCurrentNetworkView() );
        // unselect the nodes and edges
        if(selectedNodes != null){
        		Cytoscape.getCurrentNetwork().setSelectedNodeState(selectedNodes, false);
        }
        
        if(selectedEdges != null){
        		Cytoscape.getCurrentNetwork().setSelectedEdgeState(selectedEdges,false);
        }
    }//action performed
}

