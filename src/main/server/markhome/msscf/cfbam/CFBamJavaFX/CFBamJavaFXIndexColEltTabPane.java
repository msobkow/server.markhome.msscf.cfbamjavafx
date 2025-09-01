// Description: Java 11 JavaFX Element TabPane implementation for IndexCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.List;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXIndexColEltTabPane JavaFX Element TabPane implementation
 *	for IndexCol.
 */
public class CFBamJavaFXIndexColEltTabPane
extends CFTabPane
implements ICFBamJavaFXIndexColPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabChildrenRefRelFromColList = "Optional Children Referencing Relation From Columns";
	protected CFTab tabChildrenRefRelFromCol = null;
	public final String LABEL_TabChildrenRefRelToColList = "Optional Children Referencing Relation To Columns";
	protected CFTab tabChildrenRefRelToCol = null;
	protected CFBorderPane tabViewChildrenRefRelFromColListPane = null;
	protected CFBorderPane tabViewChildrenRefRelToColListPane = null;

	public CFBamJavaFXIndexColEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamIndexColObj argFocus ) {
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		setJavaFXFocusAsIndexCol( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabChildrenRefRelFromCol = new CFTab();
		tabChildrenRefRelFromCol.setText( LABEL_TabChildrenRefRelFromColList );
		tabChildrenRefRelFromCol.setContent( getTabViewChildrenRefRelFromColListPane() );
		getTabs().add( tabChildrenRefRelFromCol );
		tabChildrenRefRelToCol = new CFTab();
		tabChildrenRefRelToCol.setText( LABEL_TabChildrenRefRelToColList );
		tabChildrenRefRelToCol.setContent( getTabViewChildrenRefRelToColListPane() );
		getTabs().add( tabChildrenRefRelToCol );
		javafxIsInitializing = false;
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamIndexColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamIndexColObj" );
		}
	}

	public void setJavaFXFocusAsIndexCol( ICFBamIndexColObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamIndexColObj getJavaFXFocusAsIndexCol() {
		return( (ICFBamIndexColObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenRefRelFromColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefRelFromColList() {
		}

		public void refreshMe() {
			Collection<ICFBamRelationColObj> dataCollection;
			ICFBamIndexColObj focus = (ICFBamIndexColObj)getJavaFXFocusAsIndexCol();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelFromCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefRelFromColListPane();
			ICFBamJavaFXRelationColPaneList jpList = (ICFBamJavaFXRelationColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefRelFromColListPane() {
		if( tabViewChildrenRefRelFromColListPane == null ) {
			ICFBamIndexColObj focus = (ICFBamIndexColObj)getJavaFXFocusAsIndexCol();
			Collection<ICFBamRelationColObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelFromCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamRelationObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamRelationObj ) ) {
				javafxContainer = (ICFBamRelationObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefRelFromColListPane = javafxSchema.getRelationColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefRelFromColList(), false );
		}
		return( tabViewChildrenRefRelFromColListPane );
	}

	protected class RefreshChildrenRefRelToColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefRelToColList() {
		}

		public void refreshMe() {
			Collection<ICFBamRelationColObj> dataCollection;
			ICFBamIndexColObj focus = (ICFBamIndexColObj)getJavaFXFocusAsIndexCol();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelToCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefRelToColListPane();
			ICFBamJavaFXRelationColPaneList jpList = (ICFBamJavaFXRelationColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefRelToColListPane() {
		if( tabViewChildrenRefRelToColListPane == null ) {
			ICFBamIndexColObj focus = (ICFBamIndexColObj)getJavaFXFocusAsIndexCol();
			Collection<ICFBamRelationColObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefRelToCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamRelationObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamRelationObj ) ) {
				javafxContainer = (ICFBamRelationObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefRelToColListPane = javafxSchema.getRelationColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefRelToColList(), false );
		}
		return( tabViewChildrenRefRelToColListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewChildrenRefRelFromColListPane != null ) {
			((ICFBamJavaFXRelationColPaneCommon)tabViewChildrenRefRelFromColListPane).setPaneMode( value );
		}
		if( tabViewChildrenRefRelToColListPane != null ) {
			((ICFBamJavaFXRelationColPaneCommon)tabViewChildrenRefRelToColListPane).setPaneMode( value );
		}
	}
}
